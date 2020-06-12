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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Accessors(chain = true)
public class TogetherWorkerCommentApiRequestModel
{
	/*****************
	 * 1	createdAt		DateTime		N
	 * 2	createdBy		String	50	N
	 * 3	updatedAt		DateTime
	 * 4	updatedBy		String	50
	 * 5	id		Long	100	N
	 * 6	name		String	100	N
	 * 7	companyName		String	50	N
	 * 8	positionName		String	100	N
	 * 9	photoUri		String	200
	 * 10	altMessage		String	100	N
	 * 11	content		String	500	N
	 */
	private Long id;
	private String name;
	private String companyName;
	private String positionName;
	private String photoUri;
	private String altMessage;
	private String content;
}
