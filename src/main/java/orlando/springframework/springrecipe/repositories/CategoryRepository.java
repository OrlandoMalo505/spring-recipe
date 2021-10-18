package orlando.springframework.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import orlando.springframework.springrecipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
