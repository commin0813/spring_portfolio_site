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
public class IntroApiResponseModel {
	/******
	 * 1	createdAt		DateTime		N
	 * 2	createdBy		String	50	N
	 * 3	updatedAt		DateTime
	 * 4	updatedBy		String	50
	 * 5	id		Long	100	N
	 * 6	title		String	150	N
	 * 7	content		String	200	N
	 */
	private Long id;
	private String title;
	private String content;
}
