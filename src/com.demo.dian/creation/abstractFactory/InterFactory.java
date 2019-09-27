package com.demo.dian.creation.abstractFactory;

import com.demo.dian.creation.factory.Cpu;
import com.demo.dian.creation.factory.IntelCpu;
import com.demo.dian.creation.factory.IntelMainboard;
import com.demo.dian.creation.factory.Mainboard;

/**
 * Created by DIAN on 2019/9/27.
 */
public class InterFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
