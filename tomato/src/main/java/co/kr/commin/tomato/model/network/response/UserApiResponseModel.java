package co.kr.commin.tomato.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class UserApiResponseModel {
	private Long id;
	private String account;
	private String password;
	private LocalDateTime registeredAt;
	private LocalDateTime unregisteredAt;
	private String email;
	private String status;
	private String userPermission;
	private String userPhotoUri;
	private String userPhotoAltMessage;
}
