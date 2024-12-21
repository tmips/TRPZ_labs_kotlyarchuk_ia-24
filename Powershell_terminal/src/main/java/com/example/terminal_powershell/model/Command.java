package com.example.terminal_powershell.model;

public class Command {
    private Long id;
    private String name;
    private boolean isPowerShellCommand;
    private boolean isSuccess;
    private String description;

    public Command(String commandText, boolean isPowerShellCommand) {
        this.name = commandText;
        this.isPowerShellCommand = isPowerShellCommand;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsPowerShellCommand() {
        return isPowerShellCommand;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
