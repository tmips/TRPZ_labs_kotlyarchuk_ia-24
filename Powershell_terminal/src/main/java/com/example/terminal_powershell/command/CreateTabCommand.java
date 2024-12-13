package com.example.terminal_powershell.command;

import com.example.terminal_powershell.services.TabService;

public class CreateTabCommand implements TabCommand {
    private String tabName;

    public CreateTabCommand(String tabName) {
        this.tabName = tabName;
    }

    @Override
    public void execute(TabService tabService) {
        tabService.createTab(tabName);
    }
}
