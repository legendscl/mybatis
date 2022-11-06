package com.legendscl.utils;

import java.util.UUID;

public class IDutils {
    public static String getID(){
        return UUID.randomUUID().toString().replace("_","");
    }
}
