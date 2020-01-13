package ch.supsi.ingsw2.designpattern.command.commands;

import ch.supsi.ingsw2.designpattern.command.model.Fan;


public class StopFanCommand implements ICommand {

    Fan fan;

    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("stoping Fan.");
        fan.stop();
    }

}
