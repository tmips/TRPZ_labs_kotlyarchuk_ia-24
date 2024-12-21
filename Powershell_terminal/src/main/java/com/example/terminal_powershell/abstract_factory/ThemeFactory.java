package com.example.terminal_powershell.abstract_factory;

public interface ThemeFactory {
    TextColor createTextColor();
    BackgroundColor createBackgroundColor();
    TextSize createTextSize();
}
