package com.example.powershell_terminal.model;

import java.util.List;

class CommandExecutor {
    private Long id;
    private Command command;
    private String output;
    private String error;
    private List<String> executionLog;


    public CommandExecutor(Command command) {
        this.command = command;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Command getCommand() {
        return command;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getExecutionLog() {
        return executionLog;
    }

}

