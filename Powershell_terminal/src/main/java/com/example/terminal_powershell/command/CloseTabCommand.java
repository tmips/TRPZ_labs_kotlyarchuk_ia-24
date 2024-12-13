package com.example.terminal_powershell.command;

import com.example.terminal_powershell.services.TabService;

public class CloseTabCommand implements TabCommand {
    private Long tabId;

    public CloseTabCommand(Long tabId) {
        this.tabId = tabId;
    }

    @Override
    public void execute(TabService tabService) {
        tabService.closeTab(tabId);
    }
}