package com.example.terminal_powershell.controller;

import com.example.terminal_powershell.command.*;
import com.example.terminal_powershell.services.TabService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/tabs")
public class TabController {

    private final TabService tabService;
    private final CommandInvoker commandInvoker;

    public TabController(TabService tabService) {
        this.tabService = tabService;
        this.commandInvoker = new CommandInvoker();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createTab(@RequestBody Map<String, String> request) {
        String tabName = request.get("tabName");
        Command createTabCommand = new CreateTabCommand(tabService, tabName);
        commandInvoker.setCommand(createTabCommand);
        commandInvoker.executeCommand();
        return ResponseEntity.ok("Tab created: " + tabName);
    }

    @PostMapping("/close")
    public ResponseEntity<String> closeTab(@RequestBody Map<String, Long> request) {
        Long tabId = request.get("tabId");
        Command closeTabCommand = new CloseTabCommand(tabService, tabId);
        commandInvoker.setCommand(closeTabCommand);
        commandInvoker.executeCommand();
        return ResponseEntity.ok("Tab closed: " + tabId);
    }

    @PostMapping("/change-text-size")
    public ResponseEntity<String> changeTextSize(@RequestBody Map<String, Object> request) {
        Long tabId = Long.valueOf(request.get("tabId").toString());
        int newSize = Integer.valueOf(request.get("newSize").toString());
        Command changeSizeCommand = new ChangeSizeTextCommand(tabService, tabId, newSize);
        commandInvoker.setCommand(changeSizeCommand);
        commandInvoker.executeCommand();
        return ResponseEntity.ok("Text size changed to: " + newSize);
    }

    @PostMapping("/change-text-color")
    public ResponseEntity<String> changeTextColor(@RequestBody Map<String, Object> request) {
        Long tabId = Long.valueOf(request.get("tabId").toString());
        String newColor = request.get("newColor").toString();
        Command changeColorCommand = new ChangeColorTextCommand(tabService, tabId, newColor);
        commandInvoker.setCommand(changeColorCommand);
        commandInvoker.executeCommand();
        return ResponseEntity.ok("Text color changed to: " + newColor);
    }

    @PostMapping("/change-background-color")
    public ResponseEntity<String> changeBackgroundColor(@RequestBody Map<String, Object> request) {
        Long tabId = Long.valueOf(request.get("tabId").toString());
        String newBackgroundColor = request.get("newBackgroundColor").toString();
        Command changeBackgroundColorCommand = new ChangeColorBackgroundCommand(tabService, tabId, newBackgroundColor);
        commandInvoker.setCommand(changeBackgroundColorCommand);
        commandInvoker.executeCommand();
        return ResponseEntity.ok("Background color changed to: " + newBackgroundColor);
    }
}