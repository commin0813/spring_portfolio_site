package co.kr.commin.tomato.interfaces;

import co.kr.commin.tomato.model.network.HeaderModel;

public interface CrudInterface<Response,Request> {
	HeaderModel<Response> create(HeaderModel<Request> request);
	HeaderModel<Response> read(Long id);
	HeaderModel<Response> update(HeaderModel<Request> request);
	HeaderModel delete(Long id);
}
