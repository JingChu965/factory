package pizza.product;

import ingredient.store.PizzaIngredientStore;

/**
 * @description: 芝士披萨
 * @author: 赵波
 * @createtime :2020-07-01 11:03:05
 **/
public class CheesePizza extends Pizza {
    PizzaIngredientStore pizzaIngredientStore;

    public CheesePizza(PizzaIngredientStore pizzaIngredientStore) {
        this.pizzaIngredientStore = pizzaIngredientStore;
    }

    @Override
    void prepare() {
        System.out.println("准备披萨：" + name);
        dough = pizzaIngredientStore.createDough();
        sauce = pizzaIngredientStore.createSauce();
        cheese = pizzaIngredientStore.createCheese();
    }
}
