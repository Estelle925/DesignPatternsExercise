package com.example.designpatternsexercise.demo.order.command;

import com.example.designpatternsexercise.demo.order.nocommand.Requirement;
import lombok.Data;

@Data
public class TechnicalManager2 {
    private String name;
    private Command command;

    public TechnicalManager2(String name) {
        this.name = name;
    }

    public void action(Requirement requirement) {
        this.command.execute(requirement);
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
