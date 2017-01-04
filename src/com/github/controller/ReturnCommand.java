package com.github.controller;

public class ReturnCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void execute(Input input) {
        input.setInputName("return");

    }
}
