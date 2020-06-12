package co.kr.commin.tomato.repository;

import co.kr.commin.tomato.TomatoApplicationTests;
import co.kr.commin.tomato.model.entity.Intro;
import co.kr.commin.tomato.model.network.request.IntroApiRequestModel;
import co.kr.commin.tomato.model.network.request.UserApiRequestModel;
import co.kr.commin.tomato.repository.api.IntroApiRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IntroApiRepositoryTest extends TomatoApplicationTests {

	@Autowired
	private IntroApiRepository introApiRepository;

	@Test
	public void create() {
		Intro intro = Intro.builder()
				.title("Intro Title")
				.content("Intro content")
				.build();
		introApiRepository.save(intro);
	}
	@Test
	public void read(){
		System.out.println(introApiRepository.findById(1L));
	}

	@Test
	public void update() {
		IntroApiRequestModel introApiRequestModel = IntroApiRequestModel.builder()
				.title("Intro Title Update")
				.content("Intro Content Update")
				.build();

	}

	@Test
	public void delete() {


	}
}
