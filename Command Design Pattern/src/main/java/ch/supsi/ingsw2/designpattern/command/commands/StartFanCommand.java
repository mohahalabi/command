package ch.supsi.ingsw2.designpattern.command.commands;

import ch.supsi.ingsw2.designpattern.command.model.Fan;

public class StartFanCommand implements ICommand {

    Fan fan;

    public StartFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }

}
