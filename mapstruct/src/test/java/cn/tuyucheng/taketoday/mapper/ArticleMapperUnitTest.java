package cn.tuyucheng.taketoday.mapper;

import cn.tuyucheng.taketoday.dto.ArticleDTO;
import cn.tuyucheng.taketoday.dto.CarDTO;
import cn.tuyucheng.taketoday.entity.Article;
import cn.tuyucheng.taketoday.entity.Car;
import cn.tuyucheng.taketoday.entity.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArticleMapperUnitTest {

	@Test
	public void givenArticle_whenMaps_thenProducesCorrectDto() {
		Article entity = new Article();
		entity.setId(1);
		entity.setName("Mapstruct Mapping");
		Person author = new Person();
		author.setId("1");
		author.setName("John");
		entity.setAuthor(author);

		ArticleDTO articleDTO = ArticleMapper.INSTANCE.articleToArticleDto(entity);

		assertEquals(articleDTO.getId(), entity.getId());
		assertEquals(articleDTO.getName(), entity.getName());
		assertEquals(articleDTO.getAuthor().getName(), entity.getAuthor().getName());
	}

	@Test
	public void givenArticle_whenMapsWithUses_thenProducesCorrectDto() {
		Article entity = new Article();
		entity.setId(1);
		entity.setName("Mapstruct Mapping");
		Person author = new Person();
		author.setId("1");
		author.setName("John");
		entity.setAuthor(author);

		ArticleDTO articleDTO = ArticleUsingPersonMapper.INSTANCE.articleToArticleDto(entity);

		assertEquals(articleDTO.getId(), entity.getId());
		assertEquals(articleDTO.getName(), entity.getName());
		assertEquals(articleDTO.getAuthor().getName(), entity.getAuthor().getName());
	}
}