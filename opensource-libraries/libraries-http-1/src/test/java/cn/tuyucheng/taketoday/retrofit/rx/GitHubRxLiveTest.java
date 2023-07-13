package cn.tuyucheng.taketoday.retrofit.rx;

import cn.tuyucheng.taketoday.retrofit.models.Contributor;
import cn.tuyucheng.taketoday.retrofit.models.Repository;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class GitHubRxLiveTest {

	GitHubRxApi gitHub;

	@Before
	public void init() {
		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com/").addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();

		gitHub = retrofit.create(GitHubRxApi.class);
	}

	@Test
	public void whenListRepos_thenExpectReposThatContainTutorials() {
		gitHub.listRepos("eugenp").subscribe(repos -> {
			assertThat(repos).isNotEmpty().extracting(Repository::getName).contains("tutorials");
		});
	}

	@Test
	public void whenListRepoContributers_thenExpectContributorsThatContainEugenp() {
		gitHub.listRepoContributors("eugenp", "tutorials").subscribe(contributors -> {
			assertThat(contributors).isNotEmpty().extracting(Contributor::getName).contains("eugenp");
		});
	}

}
