package co.kr.commin.tomato.controller.api;

import co.kr.commin.tomato.controller.CrudController;
import co.kr.commin.tomato.model.entity.User;
import co.kr.commin.tomato.model.network.request.UserApiRequestModel;
import co.kr.commin.tomato.model.network.response.UserApiResponseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiResponseModel, UserApiRequestModel, User> {

}
