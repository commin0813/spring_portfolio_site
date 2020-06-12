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
public class WorkHistoryApiResponseModel {
	/************
	 * 1	createdAt		DateTime		N
	 * 2	createdBy		String	50	N
	 * 3	updatedAt		DateTime
	 * 4	updatedBy		String	50
	 * 5	id		Long	100	N
	 * 6	title		String	150	N
	 * 7	subTitle		String	200
	 * 8	content		String	500	N
	 * 9	year		String	4	N
	 * 10	month		String	2	N
	 * 11	status	ENDED,WORKING	String	10	N
 	 */
	private Long id;
	private String subtitle;
	private String content;
	private String year;
	private String month;
	private String status;
}
