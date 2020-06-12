package co.kr.commin.tomato.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Accessors(chain = true)
public class SkillStackDetailApiResponseModel {
	/*********************
	 * 1	createdAt		DateTime		N
	 * 2	createdBy		String	50	N
	 * 3	updatedAt		DateTime
	 * 4	updatedBy		String	50
	 * 5	id		Long	100	N
	 * 6	title		String	150	N
	 * 7	iconUri		String	250	N
	 * 8	status		String	100	N
	 * 9	altMessage		String	150	N
	 * 10	width		Long	100	N
	 * 11	height		Long	100	N
	 * 12	categoryId		Long	100	N
	 */
	private Long id;
	private String title;
	private String iconUri;
	private String status;
	private String altMessage;
	private Double width;
	private Double height;
	private Long categoryId;

}
