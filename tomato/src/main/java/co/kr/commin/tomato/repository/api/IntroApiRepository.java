package co.kr.commin.tomato.repository.api;

import co.kr.commin.tomato.model.entity.Intro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IntroApiRepository extends JpaRepository<Intro, Long> {

}
