package co.kr.commin.tomato.model.entity;

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
@Entity
@EntityListeners(AuditingEntityListener.class)
@Accessors(chain = true)
public class Intro {
	/******
	 * 1	createdAt		DateTime		N
	 * 2	createdBy		String	50	N
	 * 3	updatedAt		DateTime
	 * 4	updatedBy		String	50
	 * 5	id		Long	100	N
	 * 6	title		String	150	N
	 * 7	content		String	200	N
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String content;

	@CreatedDate
	private LocalDateTime createdAt;
	@CreatedBy
	private String createdBy;
	@LastModifiedDate
	private LocalDateTime updatedAt;
	@LastModifiedBy
	private String updatedBy;

}
