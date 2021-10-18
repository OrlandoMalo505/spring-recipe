package orlando.springframework.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import orlando.springframework.springrecipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
