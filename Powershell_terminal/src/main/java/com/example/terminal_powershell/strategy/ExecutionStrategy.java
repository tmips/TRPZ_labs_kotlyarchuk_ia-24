package com.example.terminal_powershell.strategy;

import com.example.terminal_powershell.model.Command;

public interface ExecutionStrategy {
    String execute(Command command);
}
