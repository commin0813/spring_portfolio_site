package co.kr.commin.tomato.controller;

import co.kr.commin.tomato.interfaces.CrudInterface;
import co.kr.commin.tomato.model.network.HeaderModel;
import co.kr.commin.tomato.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
public class CrudController<res,req,entity> implements CrudInterface<res,req> {
	@Autowired(required = false)
	private BaseService<res,req,entity> baseService;
	
	@Override
	@PostMapping("")
	public HeaderModel<res> create(@RequestBody HeaderModel<req> request) {
		return baseService.create(request);
	}

	@Override
	@GetMapping("{id}")
	public HeaderModel<res> read(@PathVariable Long id) {
		return baseService.read(id);
	}

	@Override
	@PutMapping("")
	public HeaderModel<res> update(@RequestBody HeaderModel<req> request) {
		return baseService.update(request);
	}

	@Override
	@DeleteMapping("{id}")
	public HeaderModel delete(@PathVariable Long id) {
		return baseService.delete(id);
	}
}
