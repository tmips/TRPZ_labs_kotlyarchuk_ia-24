package com.example.terminal_powershell.services;

import com.example.terminal_powershell.model.Tab;
import com.example.terminal_powershell.repositories.TabRepository;
import org.springframework.stereotype.Service;

@Service
public class TabService {

    private final TabRepository tabRepository;
    private Long activeTabId;

    public TabService(TabRepository tabRepository) {
        this.tabRepository = tabRepository;
    }

    public void createTab(String tabName) {
        Tab newTab = new Tab();
        newTab.setTitle(tabName);
        Tab savedTab = tabRepository.save(newTab);

        if (activeTabId == null) {
            activeTabId = savedTab.getId();
        }

        System.out.println("Tab created: " + tabName);
    }

    public void closeTab(Long tabId) {
        tabRepository.deleteById(tabId);
        System.out.println("Tab closed: " + tabId);

        if (tabId.equals(activeTabId)) {
            activeTabId = null;
        }
    }

    public void switchToTab(Long tabId) {
        if (tabRepository.existsById(tabId)) {
            activeTabId = tabId;
            System.out.println("Switched to tab: " + tabId);
        } else {
            throw new IllegalArgumentException("Tab with ID " + tabId + " does not exist");
        }
    }

    public Long getActiveTabId() {
        return activeTabId;
    }
}
