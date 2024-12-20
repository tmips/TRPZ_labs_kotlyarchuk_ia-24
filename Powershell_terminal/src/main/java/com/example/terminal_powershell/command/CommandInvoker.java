package com.example.terminal_powershell.command;

public class CommandInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
        } else {
            throw new IllegalStateException("No command set");
        }
    }
}
