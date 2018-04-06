package com.greenfoxdi.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements  MyColor {
    @Override
    @Autowired
    public String printColor() {
        return "It is red in color...";
    }
}
