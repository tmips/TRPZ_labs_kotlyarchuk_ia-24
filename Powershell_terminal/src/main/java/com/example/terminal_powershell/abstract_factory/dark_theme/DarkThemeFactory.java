package com.example.terminal_powershell.abstract_factory.dark_theme;

import com.example.terminal_powershell.abstract_factory.BackgroundColor;
import com.example.terminal_powershell.abstract_factory.TextColor;
import com.example.terminal_powershell.abstract_factory.TextSize;
import com.example.terminal_powershell.abstract_factory.ThemeFactory;

public class DarkThemeFactory implements ThemeFactory {

    public TextColor createTextColor() {
        return new DarkTextColor();
    }

    public BackgroundColor createBackgroundColor() {
        return new DarkBackgroundColor();
    }

    public TextSize createTextSize() {
        return new DarkTextSize();
    }
}