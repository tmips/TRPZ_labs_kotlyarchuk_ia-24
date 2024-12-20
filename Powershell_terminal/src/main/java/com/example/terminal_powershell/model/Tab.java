package com.example.terminal_powershell.model;

import java.util.ArrayList;
import java.util.List;

public class Tab {
    private Long id;
    private String title;
    private String syntaxColor;
    private String windowBackground;
    private int syntaxSize;
    private List<Command> commands;

    public Tab(String title) {
        this.title = title;
        this.syntaxColor = "WHITE";
        this.windowBackground = "BLACK";
        this.syntaxSize = 12;
        this.commands = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public String getSyntaxColor() {
        return syntaxColor;
    }

    public String getWindowBackground() {
        return windowBackground;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void setSyntaxSize(int syntaxSize) {
        this.syntaxSize = syntaxSize;
    }

    public void setSyntaxColor(String syntaxColor) {
        this.syntaxColor = syntaxColor;
    }

    public void setWindowBackground(String windowBackground) {
        this.windowBackground = windowBackground;
    }

}

