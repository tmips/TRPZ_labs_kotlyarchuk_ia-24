package com.example.terminal_powershell.command;

import com.example.terminal_powershell.services.TabService;

public class CreateTabCommand implements Command {
    private TabService tabService;
    private String tabName;

    public CreateTabCommand(TabService tabService, String tabName) {
        this.tabService = tabService;
        this.tabName = tabName;
    }

    public void execute() {
        tabService.createTab(tabName);
    }
}
