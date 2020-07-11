package pizza.product;

import ingredient.product.*;

import java.util.Arrays;

/**
 * @description: 披萨类
 * @author: 赵波
 * @createtime :2020-07-01 10:49:49
 **/
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    abstract void prepare();
    void bake(){
        System.out.println("烘烤中");
    }
    void cut(){
        System.out.println("切片中");
    }
    void box(){
        System.out.println("打包中");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
