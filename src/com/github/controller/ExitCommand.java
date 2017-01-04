package com.github.controller;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        Input input = new Input();
        input.setInputName("exit");
    }

    @Override
    public void execute(Input input) {

    }
}
