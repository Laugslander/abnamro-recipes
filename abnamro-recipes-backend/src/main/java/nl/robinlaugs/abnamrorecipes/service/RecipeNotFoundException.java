package nl.robinlaugs.abnamrorecipes.service;

public class RecipeNotFoundException extends Exception{

    public RecipeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
