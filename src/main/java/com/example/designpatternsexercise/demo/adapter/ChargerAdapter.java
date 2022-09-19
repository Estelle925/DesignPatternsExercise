package com.example.designpatternsexercise.demo.adapter;

public class ChargerAdapter implements Target {

    private BritishCharger britishCharger;

    public ChargerAdapter(BritishCharger britishCharger) {
        this.britishCharger = britishCharger;
    }

    @Override
    public void chargeByChineseStandard() {
        britishCharger.chargeByBritishStandard();
    }
}
