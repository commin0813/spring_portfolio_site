package co.kr.commin.tomato.service.api;

import co.kr.commin.tomato.model.entity.User;
import co.kr.commin.tomato.model.network.HeaderModel;
import co.kr.commin.tomato.model.network.request.UserApiRequestModel;
import co.kr.commin.tomato.model.network.response.UserApiResponseModel;
import co.kr.commin.tomato.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserApiService extends BaseService<UserApiResponseModel, UserApiRequestModel, User> {

	@Override
	public HeaderModel<UserApiResponseModel> create(HeaderModel<UserApiRequestModel> request) {
		log.info("{}", request);
		UserApiRequestModel userApiRequestModel = request.getData();
		User user = User.builder()
				.account(userApiRequestModel.getAccount())
				.userPermission(userApiRequestModel.getUserPermission())
				.userPhotoAltMessage(userApiRequestModel.getUserPhotoAltMessage())
				.userPhotoUri(userApiRequestModel.getUserPhotoUri())
				.email(userApiRequestModel.getEmail())
				.password(userApiRequestModel.getPassword())
				.registeredAt(userApiRequestModel.getRegisteredAt())
				.status(userApiRequestModel.getStatus())
				.unregisteredAt(userApiRequestModel.getUnregisteredAt())
				.build();
		return HeaderModel.OK(response(baseRepository.save(user)));
	}


	@Override
	public HeaderModel<UserApiResponseModel> read(Long id) {
		//@TODO 리드
		Optional<User> optionalUser = baseRepository.findById(id);
		return optionalUser.map(selectedUser ->
				HeaderModel.OK(response(selectedUser))
		).orElseGet(() -> HeaderModel.ERROR());
	}

	@Override
	public HeaderModel<UserApiResponseModel> update(HeaderModel<UserApiRequestModel> request) {
		//TODO 업데이트
		log.info("{}", request);

		UserApiRequestModel userApiRequestModel = request.getData();

		Optional<User> optionalUser = baseRepository.findById(userApiRequestModel.getId());
		return optionalUser.map(selectedUser -> {
			selectedUser.setAccount(userApiRequestModel.getAccount())
					.setEmail(userApiRequestModel.getEmail())
					.setPassword(userApiRequestModel.getPassword())
					.setStatus(userApiRequestModel.getStatus())
					.setUserPhotoAltMessage(userApiRequestModel.getUserPhotoAltMessage())
					.setUserPhotoUri(userApiRequestModel.getUserPhotoUri())
					.setUserPermission(userApiRequestModel.getUserPermission());
			return selectedUser;

		}).map(updatedUser -> HeaderModel.OK(response(baseRepository.save(updatedUser))))
				.orElseGet(() -> HeaderModel.ERROR());
	}

	@Override
	public HeaderModel delete(Long id) {
		//TODO DELETE
		return baseRepository.findById(id).map(user -> {
			baseRepository.delete(user);
			return HeaderModel.OK();
		}).orElseGet(() -> HeaderModel.ERROR());

	}

	private UserApiResponseModel response(User user) {
		return UserApiResponseModel.builder()
				.account(user.getAccount())
				.email(user.getEmail())
				.password(user.getPassword())
				.registeredAt(user.getRegisteredAt())
				.status(user.getStatus())
				.unregisteredAt(user.getUnregisteredAt())
				.userPermission(user.getUserPermission())
				.userPhotoAltMessage(user.getUserPhotoAltMessage())
				.userPhotoUri(user.getUserPhotoUri())
				.id(user.getId())
				.build();
	}
}
