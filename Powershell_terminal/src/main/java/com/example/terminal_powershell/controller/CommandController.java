package com.example.terminal_powershell.controller;

import com.example.terminal_powershell.model.Command;
import com.example.terminal_powershell.services.CommandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/commands")
public class CommandController {
    private final CommandService commandService;

    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    public ResponseEntity<String> executeCommand(@PathVariable Long id, @RequestBody Command command) {
        try {
            String result = commandService.executeCommand(command);
            if (result.contains("Error:")) {
                return ResponseEntity.badRequest().body(result);
            }
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

