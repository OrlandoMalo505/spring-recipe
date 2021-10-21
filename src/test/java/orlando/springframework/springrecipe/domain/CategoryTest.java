package orlando.springframework.springrecipe.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {
    Category category;


    @BeforeEach
    public void setUp(){
        category=new Category();
    }

    @Test
    void getId() throws Exception {
        Long id=3L;
        category.setId(id);
        assertEquals(id,category.getId());

    }

    @Test
    void getDescription() throws  Exception{
    }

    @Test
    void getRecipes() throws Exception {
    }
}