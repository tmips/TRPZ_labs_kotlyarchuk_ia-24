package com.example.terminal_powershell.abstract_factory.dark_theme;

import com.example.terminal_powershell.abstract_factory.TextColor;

public class DarkTextColor implements TextColor {

    public String getTextColor() {
        return "white";
    }
}

