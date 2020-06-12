package co.kr.commin.tomato.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class HeaderModel<T> {
	private LocalDateTime transactionTime;
	private String resultCode;
	private String description;
	private T data;


	public static <T> HeaderModel<T> OK(T data){
		return (HeaderModel<T>) HeaderModel.builder()
				.resultCode("OK")
				.description("OK")
				.transactionTime(LocalDateTime.now())
				.data(data)
				.build();
	}
	public static <T> HeaderModel<T> OK()
	{
		return (HeaderModel<T>) HeaderModel.builder()
				.resultCode("OK")
				.description("OK")
				.transactionTime(LocalDateTime.now())
				.build();
	}

	public static <T> HeaderModel<T> ERROR(){
		return (HeaderModel<T>) HeaderModel.builder()
				.resultCode("ERROR")
				.description("ERROR")
				.transactionTime(LocalDateTime.now())
				.build();
	}

}
