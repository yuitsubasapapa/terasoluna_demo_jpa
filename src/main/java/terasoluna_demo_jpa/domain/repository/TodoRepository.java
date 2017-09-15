package terasoluna_demo_jpa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import terasoluna_demo_jpa.domain.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, String> {

	@Query("SELECT COUNT(t) FROM Todo t WHERE t.finished = :finished")
	long countByFinished(@Param("finished") boolean finished);

}