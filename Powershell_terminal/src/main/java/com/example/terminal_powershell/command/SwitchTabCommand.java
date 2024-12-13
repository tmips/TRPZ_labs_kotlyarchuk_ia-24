package com.example.terminal_powershell.command;

import com.example.terminal_powershell.services.TabService;

public class SwitchTabCommand implements TabCommand {
    private Long tabId;

    public SwitchTabCommand(Long tabId) {
        this.tabId = tabId;
    }

    @Override
    public void execute(TabService tabService) {
        tabService.switchToTab(tabId);
    }
}