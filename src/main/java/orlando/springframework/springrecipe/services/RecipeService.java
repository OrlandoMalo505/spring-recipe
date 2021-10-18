package orlando.springframework.springrecipe.services;

import orlando.springframework.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
