package com.example.designpatternsexercise.demo.order.command;

import com.example.designpatternsexercise.demo.order.nocommand.Developer;
import com.example.designpatternsexercise.demo.order.nocommand.Requirement;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Command {

    protected Developer developer;

    public abstract void execute(Requirement requirement);
}
