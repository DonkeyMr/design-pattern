package com.pattern.abstract_factory;

import com.pattern.abstract_factory.ingredient.Cheese;
import com.pattern.abstract_factory.ingredient.Dough;
import com.pattern.abstract_factory.ingredient.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();
}
