package com.example.terminal_powershell.model;

import java.util.ArrayList;
import java.util.List;

public class Tab {
    private Long id;
    private String title;
    private boolean isActive;
    private List<Command> commands;

    public Tab() {
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

    public void setTitle(String title) {
        this.title = title;
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