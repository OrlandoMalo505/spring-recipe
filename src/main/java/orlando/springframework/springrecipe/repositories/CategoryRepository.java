package orlando.springframework.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import orlando.springframework.springrecipe.domain.Category;

import java.util.Optional;


public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
