package com.talzoo.ex10;

public interface Engine {
    default void setOil_1(String a) {
        
    };
    
    public void setOil();

    public void setNumOfCylinder();
    
    public void showStatus();

    public void runEngine(); 

}
