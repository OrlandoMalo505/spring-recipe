package orlando.springframework.springrecipe.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import orlando.springframework.springrecipe.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UnitOfMeasureRepositoryIT {
    @Autowired
    UnitOfMeasureRepository uomRepository;


    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {
        Optional<UnitOfMeasure> uomOptional= uomRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon",uomOptional.get().getDescription());
    }
}