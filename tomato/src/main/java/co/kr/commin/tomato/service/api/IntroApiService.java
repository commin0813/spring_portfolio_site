package co.kr.commin.tomato.service.api;

import co.kr.commin.tomato.model.entity.Intro;
import co.kr.commin.tomato.model.network.HeaderModel;
import co.kr.commin.tomato.model.network.request.IntroApiRequestModel;
import co.kr.commin.tomato.model.network.response.IntroApiResponseModel;
import co.kr.commin.tomato.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class IntroApiService extends BaseService<IntroApiResponseModel, IntroApiRequestModel, Intro> {

	@Override
	public HeaderModel<IntroApiResponseModel> create(HeaderModel<IntroApiRequestModel> request) {
		log.info("{}", request);
		IntroApiRequestModel introApiRequestModel = request.getData();
		Intro intro = Intro.builder()
				.title(introApiRequestModel.getTitle())
				.content(introApiRequestModel.getContent())
				.build();

		return HeaderModel.OK(response(baseRepository.save(intro)));
	}


	@Override
	public HeaderModel<IntroApiResponseModel> read(Long id) {
		//@TODO 리드
		log.info("{}", id);
		Optional<Intro> optionalIntro = baseRepository.findById(id);
		return optionalIntro.map(selectedIntro ->
				HeaderModel.OK(response(selectedIntro))
		).orElseGet(() -> HeaderModel.ERROR());
	}

	@Override
	public HeaderModel<IntroApiResponseModel> update(HeaderModel<IntroApiRequestModel> request) {
		//TODO 업데이트
		log.info("{}", request);
		IntroApiRequestModel introApiRequestModel = request.getData();
		Optional<Intro> optionalIntro = baseRepository.findById(introApiRequestModel.getId());
		return optionalIntro.map(selectedIntro -> {
			selectedIntro.setContent(introApiRequestModel.getContent())
					.setTitle(introApiRequestModel.getTitle());
			return selectedIntro;
		}).map(updatedIntro -> HeaderModel.OK(response(baseRepository.save(updatedIntro)))).orElseGet(() -> HeaderModel.ERROR());
	}

	@Override
	public HeaderModel delete(Long id) {
		//TODO DELETE
		Optional<Intro> introOptional = baseRepository.findById(id);
		return introOptional.map(selectedIntro -> HeaderModel.OK()).orElseGet(() -> HeaderModel.ERROR());
	}

	private IntroApiResponseModel response(Intro intro) {
		return IntroApiResponseModel.builder()
				.id(intro.getId())
				.title(intro.getTitle())
				.content(intro.getContent())
				.build();
	}
}
