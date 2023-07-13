package cn.tuyucheng.taketoday.resttemplate;

import cn.tuyucheng.taketoday.sampleapp.config.RestClientConfig;
import cn.tuyucheng.taketoday.transfer.LoginForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RestClientConfig.class)
class RestTemplateLiveTest {

    @Autowired
    RestTemplate restTemplate;

    @Test
    void givenRestTemplate_whenRequested_thenLogAndModifyResponse() {
        LoginForm loginForm = new LoginForm("userName", "password");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<LoginForm> requestEntity = new HttpEntity<LoginForm>(loginForm, headers);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://httpbin.org/post", requestEntity, String.class);

        Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        Assertions.assertEquals(responseEntity.getHeaders()
              .get("Foo")
              .get(0), "bar");
    }
}