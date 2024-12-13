package com.example.terminal_powershell.controller;

import com.example.terminal_powershell.command.TabCommand;
import com.example.terminal_powershell.services.TabService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tabs")
public class TabController {

    private final TabService tabService;

    public TabController(TabService tabService) {
        this.tabService = tabService;
    }

    @PostMapping("/execute")
    public ResponseEntity<String> executeCommand(@RequestBody TabCommand command) {
        command.execute(tabService);
        return ResponseEntity.ok("Command executed successfully");
    }
}