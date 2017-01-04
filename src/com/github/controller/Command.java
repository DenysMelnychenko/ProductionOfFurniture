package com.github.controller;

public interface Command {

    void execute();

    void execute(Input input);
}

