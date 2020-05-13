package nl.robinlaugs.abnamrorecipes.data;

import nl.robinlaugs.abnamrorecipes.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeRepository extends ReactiveMongoRepository<Recipe, String> {
}
