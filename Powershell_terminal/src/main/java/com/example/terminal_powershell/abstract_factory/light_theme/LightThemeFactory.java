package com.example.terminal_powershell.abstract_factory.light_theme;

import com.example.terminal_powershell.abstract_factory.BackgroundColor;
import com.example.terminal_powershell.abstract_factory.TextColor;
import com.example.terminal_powershell.abstract_factory.TextSize;
import com.example.terminal_powershell.abstract_factory.ThemeFactory;

public class LightThemeFactory implements ThemeFactory {

    public TextColor createTextColor() {
        return new LightTextColor();
    }

    public BackgroundColor createBackgroundColor() {
        return new LightBackgroundColor();
    }

    public TextSize createTextSize() {
        return new LightTextSize();
    }
}

