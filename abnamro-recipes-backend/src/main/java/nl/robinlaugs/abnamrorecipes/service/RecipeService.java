package nl.robinlaugs.abnamrorecipes.service;

import lombok.RequiredArgsConstructor;
import nl.robinlaugs.abnamrorecipes.data.RecipeRepository;
import nl.robinlaugs.abnamrorecipes.model.Recipe;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository repository;

    public Flux<Recipe> getAll() {
        return repository.findAll();
    }

    public Mono<Recipe> get(String id) {
        return repository.findById(id);
    }

    public Mono<Recipe> create(Mono<Recipe> recipe) {
        return recipe.flatMap(repository::save);
    }

    public Mono<Recipe> update(Mono<Recipe> recipe) {
        return recipe.flatMap(repository::save);
    }

    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

}
