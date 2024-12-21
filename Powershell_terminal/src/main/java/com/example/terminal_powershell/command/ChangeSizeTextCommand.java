package com.example.terminal_powershell.command;

import com.example.terminal_powershell.services.TabService;

public class ChangeSizeTextCommand implements Command {
    private TabService tabService;
    private Long tabId;
    private int newSize;

    public ChangeSizeTextCommand(TabService tabService, Long tabId, int newSize) {
        this.tabService = tabService;
        this.tabId = tabId;
        this.newSize = newSize;
    }

    public void execute() {
        tabService.changeTextSize(tabId, newSize);
    }
}
