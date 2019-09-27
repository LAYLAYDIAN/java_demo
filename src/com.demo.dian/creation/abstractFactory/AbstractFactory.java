package com.demo.dian.creation.abstractFactory;

import com.demo.dian.creation.factory.Cpu;
import com.demo.dian.creation.factory.Mainboard;

/**
 * 静态工厂模式
 * Created by DIAN on 2019/9/27.
 * */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
