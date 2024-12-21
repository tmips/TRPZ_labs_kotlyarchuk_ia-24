package com.example.terminal_powershell.services;

import com.example.terminal_powershell.model.Tab;
import com.example.terminal_powershell.repositories.TabRepository;
import org.springframework.stereotype.Service;

@Service
public class TabService {

    private final TabRepository tabRepository;

    public TabService(TabRepository tabRepository) {
        this.tabRepository = tabRepository;
    }

    public void createTab(String tabName) {
        Tab newTab = new Tab(tabName);
        newTab.setTitle(tabName);
        tabRepository.save(newTab);
        System.out.println("Tab created: " + tabName);
    }

    public void closeTab(Long tabId) {
        tabRepository.deleteById(tabId);
        System.out.println("Tab closed: " + tabId);
    }

    public void changeTextSize(Long tabId, int newSize) {
        Tab tab = tabRepository.findById(tabId).orElseThrow(() -> new IllegalArgumentException("Tab not found"));
        tab.setSyntaxSize(newSize);
        tabRepository.save(tab);
        System.out.println("Text size for tab " + tabId + " changed to " + newSize);
    }

    public void changeTextColor(Long tabId, String newColor) {
        Tab tab = tabRepository.findById(tabId).orElseThrow(() -> new IllegalArgumentException("Tab not found"));
        tab.setSyntaxColor(newColor);
        tabRepository.save(tab);
        System.out.println("Text color for tab " + tabId + " changed to " + newColor);
    }

    public void changeBackgroundColor(Long tabId, String newBackgroundColor) {
        Tab tab = tabRepository.findById(tabId).orElseThrow(() -> new IllegalArgumentException("Tab not found"));
        tab.setWindowBackground(newBackgroundColor);
        tabRepository.save(tab);
        System.out.println("Background color for tab " + tabId + " changed to " + newBackgroundColor);
    }

}
