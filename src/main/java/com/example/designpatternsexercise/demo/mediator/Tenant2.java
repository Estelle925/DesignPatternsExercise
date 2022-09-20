package com.example.designpatternsexercise.demo.mediator;

import java.util.List;

public class Tenant2 {
    private String name;
    private List<String> wantTypes;
    private RentingMediator rentingMediator = new RentingMediator();
    public Tenant2(String name, List<String> wantTypes) { this.name = name;
        this.wantTypes = wantTypes;
    }
    public void lookAtHouse() { rentingMediator.supplyHouse(wantTypes);
    }
}
