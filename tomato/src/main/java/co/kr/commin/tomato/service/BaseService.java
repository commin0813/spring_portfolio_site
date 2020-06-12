package co.kr.commin.tomato.service;

import co.kr.commin.tomato.interfaces.CrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseService<Res,Req,entity> implements CrudInterface<Res,Req> {
	@Autowired(required = false)
	protected JpaRepository<entity,Long> baseRepository;
}
