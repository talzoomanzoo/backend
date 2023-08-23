package com.talzoo.ex13Generic;

public class HomeAgency implements Rentable<Home1>{

    @Override
    public Home1 rent() {
        // TODO Auto-generated method stub
        return new Home1();
    }
    
}
