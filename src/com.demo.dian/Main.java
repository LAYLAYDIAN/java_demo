package com.demo.dian;

import com.demo.dian.creation.Builder.Builder;
import com.demo.dian.creation.Builder.ConcreteBuilder;
import com.demo.dian.creation.Builder.Director;
import com.demo.dian.creation.Builder.Product;
import com.demo.dian.creation.abstractFactory.AbstractFactory;
import com.demo.dian.creation.abstractFactory.InterFactory;
import com.demo.dian.creation.abstractFactory.ComputerEngineer;

/**
 * Created by DIAN on 2019/9/20.
 */
public class Main {
    public static void main(String[] args) {

        //工厂模式方法
        //ComputerEngineer cf = new ComputerEngineer();
        //cf.makeComputer(1,1);
        //抽象工厂模式
        //ComputerEngineer cf = new ComputerEngineer();
        //AbstractFactory af = new InterFactory();
        //cf.makeComputer(af);
        //建造者模式
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
