package com.demo.dian;

import com.demo.dian.creation.abstractFactory.AbstractFactory;
import com.demo.dian.creation.abstractFactory.InterFactory;
import com.demo.dian.creation.abstractFactory.ComputerEngineer;

/**
 * Created by DIAN on 2019/9/20.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 工厂模式
         * */
        //ComputerEngineer cf = new ComputerEngineer();
        //cf.makeComputer(1,1);
        /**
         * 抽象工厂模式
         * */
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new InterFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);

    }
}
