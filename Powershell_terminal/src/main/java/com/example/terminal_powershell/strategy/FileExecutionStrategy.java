package com.example.terminal_powershell.strategy;

import com.example.terminal_powershell.model.Command;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class FileExecutionStrategy implements ExecutionStrategy {
    @Override
    public String execute(Command command) {
        System.out.println("Executing file: " + command.getName());
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command.getName());
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            String output = new BufferedReader(new InputStreamReader(process.getInputStream()))
                    .lines()
                    .collect(Collectors.joining("\n"));

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                return output;
            } else {
                return "Error: Command failed. Output: " + output;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error while executing PowerShell command: " + e.getMessage();
        }
    }
}
