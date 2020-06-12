package co.kr.commin.tomato.repository.api;

import co.kr.commin.tomato.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserApiRepository extends JpaRepository<User, Long> {

}
