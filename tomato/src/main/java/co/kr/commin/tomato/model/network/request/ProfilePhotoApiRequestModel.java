package co.kr.commin.tomato.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Accessors(chain = true)
public class ProfilePhotoApiRequestModel {
	/**********
	 * 1	createdAt		DateTime		N
	 * 2	createdBy		String	50	N
	 * 3	updatedAt		DateTime
	 * 4	updatedBy		String	50
	 * 5	id		Long	100	N
	 * 6	title		String	150	N
	 * 7	contentUri		String	250	N
	 * 8	status		String	100	N
	 * 9	altMessage		String	150	N
	 * 10	width		Long	100	N
	 * 11	height		Long	100	N
	 */
	private Long id;
	private String title;
	private String contentUri;
	private String status;
	private String altMessage;
	private Double width;
	private Double height;


}
