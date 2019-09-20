package com.demo.dian;

import com.demo.dian.creation.factory.ComputerEngineer;

/**
 * Created by DIAN on 2019/9/20.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 工厂模式
         * */
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1,1);

    }
}
