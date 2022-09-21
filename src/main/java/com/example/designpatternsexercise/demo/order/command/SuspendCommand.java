package com.example.designpatternsexercise.demo.order.command;

import com.example.designpatternsexercise.demo.order.nocommand.Developer;
import com.example.designpatternsexercise.demo.order.nocommand.Requirement;
import lombok.AllArgsConstructor;
import lombok.Data;


public class SuspendCommand extends Command {
    public SuspendCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        this.developer.suspend(requirement);
    }
}
