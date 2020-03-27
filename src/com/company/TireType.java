package com.company;

public enum TireType {
    SUMMER ("Summer"),
    WINTER ("Winter"),
    ALLYEAR ("All Year");

    String displayName = "";
    TireType(String displayName){
        this.displayName = displayName;
    }
}
