package com.example.powershell_terminal.model;

import java.util.ArrayList;
import java.util.List;

class Tab {
    private Long id;
    private String title;
    private boolean isActive;
    private List<Command> commands;

    public Tab(String title) {
        this.title = title;
        this.commands = new ArrayList<>();
        this.isActive = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getTitle() {
        return title;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
}