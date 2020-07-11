package ingredient.store;

import ingredient.product.*;

/**
 * @description: 纽约披萨原料店
 * @author: 赵波
 * @createtime :2020-07-01 11:00:14
 **/
public class NyPizaIngredientStore implements PizzaIngredientStore {
    public Dough createDough() {
        return null;
    }

    public Sauce createSauce() {
        return null;
    }

    public Cheese createCheese() {
        return new NyCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Pepperoni createPepperoni() {
        return null;
    }

    public Clams createClam() {
        return null;
    }
}
