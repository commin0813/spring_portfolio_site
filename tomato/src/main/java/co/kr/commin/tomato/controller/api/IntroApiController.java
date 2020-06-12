package co.kr.commin.tomato.controller.api;

import co.kr.commin.tomato.controller.CrudController;
import co.kr.commin.tomato.model.entity.Intro;
import co.kr.commin.tomato.model.network.request.IntroApiRequestModel;
import co.kr.commin.tomato.model.network.response.IntroApiResponseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/intro")
public class IntroApiController extends CrudController<IntroApiResponseModel, IntroApiRequestModel, Intro> {

}
