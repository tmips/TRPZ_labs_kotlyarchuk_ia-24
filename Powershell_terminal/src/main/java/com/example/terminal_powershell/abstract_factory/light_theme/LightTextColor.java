package com.example.terminal_powershell.abstract_factory.light_theme;

import com.example.terminal_powershell.abstract_factory.TextColor;

public class LightTextColor implements TextColor {

    public String getTextColor() {
        return "black";
    }
}
