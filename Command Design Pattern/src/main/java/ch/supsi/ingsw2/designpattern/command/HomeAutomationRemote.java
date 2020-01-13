package ch.supsi.ingsw2.designpattern.command;

import ch.supsi.ingsw2.designpattern.command.commands.ICommand;

public class HomeAutomationRemote {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
