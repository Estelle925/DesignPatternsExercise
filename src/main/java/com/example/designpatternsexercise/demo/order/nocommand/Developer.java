package com.example.designpatternsexercise.demo.order.nocommand;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private String name;

    public void suspend(Requirement requirement) {
        System.out.println(this.name + " 停止开发需求:" + requirement.getName());
    }

    public void develop(Requirement requirement) {
        System.out.println(this.name + " 开始开发需求:" + requirement.getName());
    }
}
