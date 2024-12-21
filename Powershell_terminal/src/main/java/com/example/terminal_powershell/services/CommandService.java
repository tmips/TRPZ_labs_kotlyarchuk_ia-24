package com.example.terminal_powershell.services;

import com.example.terminal_powershell.model.Command;
import com.example.terminal_powershell.strategy.CommandExecutionStrategy;
import com.example.terminal_powershell.strategy.FileExecutionStrategy;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    public String executeCommand(Command command) {
        if (command.getIsPowerShellCommand()) {
            return new CommandExecutionStrategy().execute(command);
        } else {
            return new FileExecutionStrategy().execute(command);
        }
    }
}
