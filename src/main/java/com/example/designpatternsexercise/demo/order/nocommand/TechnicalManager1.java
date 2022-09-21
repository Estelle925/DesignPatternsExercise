package com.example.designpatternsexercise.demo.order.nocommand;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TechnicalManager1 {

    private String name;
    private Developer developer;

    public TechnicalManager1(String name) {
        this.name = name;
    }

    public void action(Requirement requirement, String type) {
        if ("develop".equals(type)) {
            this.developer.develop(requirement);
        } else if ("suspend".equals(type)) {
            this.developer.suspend(requirement);
        }
    }
}
