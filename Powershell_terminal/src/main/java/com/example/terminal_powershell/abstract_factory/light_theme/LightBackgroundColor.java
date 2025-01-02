package com.example.terminal_powershell.abstract_factory.light_theme;

import com.example.terminal_powershell.abstract_factory.BackgroundColor;

public class LightBackgroundColor implements BackgroundColor {

    public String getColor() {
        return "white";
    }
}

