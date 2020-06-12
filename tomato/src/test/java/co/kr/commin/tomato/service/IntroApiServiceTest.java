package co.kr.commin.tomato.service;

import co.kr.commin.tomato.TomatoApplicationTests;
import co.kr.commin.tomato.model.network.HeaderModel;
import co.kr.commin.tomato.model.network.request.IntroApiRequestModel;
import co.kr.commin.tomato.service.api.IntroApiService;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@FixMethodOrder(MethodSorters.JVM)
public class IntroApiServiceTest extends TomatoApplicationTests {

	@Autowired
	private IntroApiService introApiService;

	@Test
	public void create() {
		IntroApiRequestModel introApiRequestModel = IntroApiRequestModel.builder()
				.title("Service Test")
				.content("Service Test...")
				.build();
		HeaderModel<IntroApiRequestModel> model = new HeaderModel<IntroApiRequestModel>();
		model.setDescription("Test Model");
		model.setResultCode("");
		model.setTransactionTime(LocalDateTime.now());
		model.setData(introApiRequestModel);
		introApiService.create(model);

	}

	@Test
	public void read() {
	}

	@Test
	public void update() {
	}

	@Test
	public void delete() {

	}
}
