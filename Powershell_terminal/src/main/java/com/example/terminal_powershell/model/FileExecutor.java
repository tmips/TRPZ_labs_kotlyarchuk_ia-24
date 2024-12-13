package com.example.terminal_powershell.model;

import java.util.ArrayList;
import java.util.List;

public class FileExecutor {
    private Long id;
    private String filePath;
    private String fileType;
    private Command command;
    private long fileSize;
    private List<String> output;


    public FileExecutor(String filePath, String fileType) {
        this.filePath = filePath;
        this.fileType = fileType;
        this.output = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getFilePath() {
        return filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public Command getCommand() {
        return command;
    }
    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public List<String> getOutput() {
        return output;
    }
}