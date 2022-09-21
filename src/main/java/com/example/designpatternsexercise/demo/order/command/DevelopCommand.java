package com.example.designpatternsexercise.demo.order.command;

import com.example.designpatternsexercise.demo.order.nocommand.Developer;
import com.example.designpatternsexercise.demo.order.nocommand.Requirement;

public class DevelopCommand extends Command {
    public DevelopCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        this.developer.develop(requirement);
    }
}
