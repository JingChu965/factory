package pizza.product;

import ingredient.store.PizzaIngredientStore;

/**
 * @description: 蛤蜊披萨
 * @author: 赵波
 * @createtime :2020-07-01 11:05:24
 **/
public class ClamPizza extends Pizza {
    PizzaIngredientStore pizzaIngredientStore;

    public ClamPizza(PizzaIngredientStore pizzaIngredientStore) {
        this.pizzaIngredientStore = pizzaIngredientStore;
    }

    @Override
    void prepare() {
        System.out.println("准备披萨:"+name);
        dough = pizzaIngredientStore.createDough();
        sauce = pizzaIngredientStore.createSauce();
        cheese = pizzaIngredientStore.createCheese();
    }
}
