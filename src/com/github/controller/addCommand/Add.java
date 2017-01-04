package com.github.controller.addCommand;

import com.github.controller.Command;
import com.github.controller.Input;
import com.github.views.Menu;

public class Add implements Command {

    @Override
    public void execute() {
        Menu.showAddMenu();
    }

    @Override
    public void execute(Input input) {

    }
}
