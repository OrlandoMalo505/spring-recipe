package orlando.springframework.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import orlando.springframework.springrecipe.domain.UnitOfMeasure;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {



    Optional<UnitOfMeasure> findByDescription(String description);
}
