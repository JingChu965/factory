package ingredient.store;

import ingredient.product.*;

/**
 * @description: 披萨材料店
 * @author: 赵波
 * @createtime :2020-07-01 10:55:45
 **/
public interface PizzaIngredientStore {
   Dough createDough();
   Sauce createSauce();
   Cheese createCheese();
   Veggies[] createVeggies();
   Pepperoni createPepperoni();
   Clams createClam();
}
