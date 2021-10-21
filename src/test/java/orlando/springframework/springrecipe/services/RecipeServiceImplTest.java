package orlando.springframework.springrecipe.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import orlando.springframework.springrecipe.domain.Recipe;
import orlando.springframework.springrecipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        recipeService=new RecipeServiceImpl(recipeRepository);

    }

    @Test
    void getRecipes() {
        Recipe recipe= new Recipe();
        HashSet recipeData=new HashSet();
        recipeData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipeData);

        Set<Recipe> recipes=recipeService.getRecipes();

        assertEquals(recipes.size(),1);
        verify(recipeRepository,times(1)).findAll();
    }
}