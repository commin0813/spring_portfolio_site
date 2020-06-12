package co.kr.commin.tomato.repository;

import co.kr.commin.tomato.TomatoApplicationTests;
import co.kr.commin.tomato.model.entity.User;
import co.kr.commin.tomato.model.network.request.UserApiRequestModel;
import co.kr.commin.tomato.repository.api.UserApiRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserApiRepositoryTest extends TomatoApplicationTests {

	@Autowired
	private UserApiRepository userApiRepository;

	@Test
	public void create() {
		User user = User.builder().
				account("admin")
				.email("admin@naver.com")
				.password("admin")
				.status("REGISTERED")
				.userPermission("ADMIN")
				.userPhotoUri("https://previews.123rf.com/images/diagon/diagon1311/diagon131100029/23755166-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-%EC%95%84%EC%9D%B4%EC%BD%98.jpg")
				.userPhotoAltMessage("이미지가 없습니다.")
				.registeredAt(LocalDateTime.now())
				.build();

		userApiRepository.save(user);
	}

	@Test
	public void update() {
		UserApiRequestModel userApiRequestModel = UserApiRequestModel.builder()
				.email("admin@naver.com")
				.password("admin")
				.status("UNREGISTERED")
				.userPermission("ADMIN")
				.userPhotoUri("https://previews.123rf.com/images/diagon/diagon1311/diagon131100029/23755166-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-%EC%95%84%EC%9D%B4%EC%BD%98.jpg")
				.userPhotoAltMessage("이미지가 없습니다.")
				.registeredAt(LocalDateTime.now())
				.unregisteredAt(LocalDateTime.now())
				.build();

		Optional<User> userOptionalp = userApiRepository.findById(1L);
		User user = userOptionalp.map(selectedUser ->
		{
			selectedUser
					.setEmail(userApiRequestModel.getEmail())
					.setPassword(userApiRequestModel.getPassword())
					.setStatus(userApiRequestModel.getStatus())
					.setUserPermission(userApiRequestModel.getUserPermission())
					.setUserPhotoUri(userApiRequestModel.getUserPhotoUri())
					.setUserPhotoAltMessage(userApiRequestModel.getUserPhotoAltMessage())
					.setRegisteredAt(userApiRequestModel.getUnregisteredAt())
					.setUnregisteredAt(userApiRequestModel.getUnregisteredAt());

			return userApiRepository.save(selectedUser);
		}).orElseGet(() -> null);

		System.out.println(user);
	}

	@Test
	public void delete() {
		Optional<User> optionalUser = userApiRepository.findById(1L);
		optionalUser.ifPresent(selectedUser -> {
			userApiRepository.delete(selectedUser);
		});


	}
}
