package com.xworkz.implementation;

import com.xworkz.abstractClass.Device;

public class Tablet extends Device {
    @Override
    public void powerOn() {
        System.out.println("Tablet powered on.");
    }

}
