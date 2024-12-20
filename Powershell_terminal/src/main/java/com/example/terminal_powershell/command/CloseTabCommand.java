package com.example.terminal_powershell.command;

import com.example.terminal_powershell.services.TabService;

public class CloseTabCommand implements Command {
    private TabService tabService;
    private Long tabId;

    public CloseTabCommand(TabService tabService, Long tabId) {
        this.tabService = tabService;
        this.tabId = tabId;
    }

    public void execute() {
        tabService.closeTab(tabId);
    }
}
