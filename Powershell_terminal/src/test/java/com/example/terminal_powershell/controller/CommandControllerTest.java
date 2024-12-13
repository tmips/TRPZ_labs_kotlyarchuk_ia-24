package com.example.terminal_powershell.controller;

import com.example.terminal_powershell.model.Command;
import com.example.terminal_powershell.services.CommandService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

class CommandControllerTest {
    private static final Logger logger = LoggerFactory.getLogger(CommandControllerTest.class);
    private final CommandService commandService = new CommandService();
    private final CommandController commandController = new CommandController(commandService);

    @Test
    void testExecutePowerShellCommand() {
        Command command = new Command("echo 'Hello, PowerShell!'", true);
        ResponseEntity<String> response = commandController.executeCommand(1L, command);
        logger.info("Response: {}", response.getBody());
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().contains("Hello, PowerShell!"));
    }

    @Test
    void testExecuteInvalidCommand() {
        Command command = new Command("invalid_command", true);
        ResponseEntity<String> response = commandController.executeCommand(2L, command);
        logger.info("Response: {}", response.getBody());
        assertEquals(400, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().contains("Error"));
    }

    @Test
    void testExecuteFileCommand() {
        Command command = new Command("notepad.exe", false);
        ResponseEntity<String> response = commandController.executeCommand(1L, command);
        logger.info("Response: {}", response.getBody());
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().isEmpty());
    }
}