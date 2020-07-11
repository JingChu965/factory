package pizza.store;

/**
 * @description: 披萨店抽象类
 * @author: 赵波
 * @createtime :2020-07-01 10:37:41
 **/
public interface PizzaStore {
    /**
     * 新建披萨
     */
    void createPizza(String type);

    /**
     * 下单
     */
    void orderPizza();
}
