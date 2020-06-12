package co.kr.commin.tomato.model.network.request;

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
public class UserApiRequestModel {
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
//	id bigint(100) AI PK
//	created_at datetime
//	created_by varchar(50)
//	updated_at datetime
//	updated_by varchar(50)
//	account varchar(50) PK
//	password varchar(50)
//	registered_at datetime
//	unregistered_at datetime
//	email varchar(100)
//	status varchar(50)
//	user_permission varchar(50)
//	user_photo_uri varchar(200)
//	user_photo_alt_message varchar(200)
}
