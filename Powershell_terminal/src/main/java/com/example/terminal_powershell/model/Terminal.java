package com.example.terminal_powershell.model;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private Long id;
    private String syntaxColor;
    private int windowWidth;
    private int windowHeight;
    private String windowBackground;
    private List<Command> commands;
    private List<Tab> tabs;
    private int maxTabs;

    public Terminal(String syntaxColor, int windowWidth, int windowHeight, String windowBackground) {
        this.syntaxColor = syntaxColor;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.windowBackground = windowBackground;
        this.commands = new ArrayList<>();
        this.tabs = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void addTab(Tab tab) {
        tabs.add(tab);
    }

    public String getSyntaxColor() {
        return syntaxColor;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public String getWindowBackground() {
        return windowBackground;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public List<Tab> getTabs() {
        return tabs;
    }
    public int getMaxTabs() {
        return maxTabs;
    }

    public void setMaxTabs(int maxTabs) {
        this.maxTabs = maxTabs;
    }
}

