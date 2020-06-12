package co.kr.commin.tomato.service;

import co.kr.commin.tomato.TomatoApplicationTests;
import co.kr.commin.tomato.model.network.HeaderModel;
import co.kr.commin.tomato.model.network.request.UserApiRequestModel;
import co.kr.commin.tomato.model.network.response.UserApiResponseModel;
import co.kr.commin.tomato.service.api.UserApiService;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@FixMethodOrder(MethodSorters.JVM)
public class UserApiServiceTest extends TomatoApplicationTests {

	@Autowired
	private UserApiService userApiService;

	@Test
	public void testA() {

		UserApiRequestModel userApiRequestModel = UserApiRequestModel.builder()
				.account("Test1")
				.email("test@gmail.com")
				.password("test01")
				.userPermission("USER")
				.registeredAt(LocalDateTime.now())
				.userPhotoUri("file://image01")
				.userPhotoAltMessage("이미지가 없습니다.")
				.status("REGISTERED")
				.build();
		HeaderModel<UserApiRequestModel> requestModel = new HeaderModel<>();
		requestModel.setTransactionTime(LocalDateTime.now());
		requestModel.setData(userApiRequestModel);
		requestModel.setResultCode("");
		HeaderModel response = userApiService.create(requestModel);

		Assertions.assertEquals(((UserApiResponseModel) response.getData()).getAccount(), "Test1");
		System.out.println(response.getData());

	}

	@Test
	public void testB(){
		HeaderModel<UserApiResponseModel> userApiResponseModelHeaderModel = userApiService.read(1L);
		System.out.println(userApiResponseModelHeaderModel);
		Assertions.assertEquals(userApiResponseModelHeaderModel.getData().getAccount(),"Test1");
	}

	@Test
	public void testC(){
		UserApiRequestModel userApiRequestModel = UserApiRequestModel.builder()
				.id(1L)
				.account("Test1-UPDATE")
				.email("test@gmail.com-UPDATE")
				.password("test01")
				.userPermission("USER")
				.registeredAt(LocalDateTime.now())
				.userPhotoUri("file://image01")
				.userPhotoAltMessage("이미지가 없습니다.")
				.status("REGISTERED")
				.build();
		HeaderModel<UserApiRequestModel> requestModel = new HeaderModel<>();
		requestModel.setTransactionTime(LocalDateTime.now());
		requestModel.setData(userApiRequestModel);
		requestModel.setResultCode("");
		HeaderModel<UserApiResponseModel> response = userApiService.update(requestModel);

		System.out.println("UPDATE : "+ response.getResultCode());
		Assertions.assertEquals(response.getData().getAccount(),"Test1-UPDATE");
	}

	@Test
	public void testD(){
		HeaderModel response = userApiService.delete(1L);

		Assertions.assertEquals(response.getResultCode(),"OK");

	}
}
