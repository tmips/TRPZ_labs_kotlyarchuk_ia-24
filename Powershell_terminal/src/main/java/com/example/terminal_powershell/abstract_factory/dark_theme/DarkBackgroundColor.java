package com.example.terminal_powershell.abstract_factory.dark_theme;

import com.example.terminal_powershell.abstract_factory.BackgroundColor;

public class DarkBackgroundColor implements BackgroundColor {

    public String getColor() {
        return "black";
    }
}
