package orlando.springframework.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import orlando.springframework.springrecipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
