package org.example;

import javax.swing.*;
import java.awt.*;

public class Area extends Actor {

    public Area(int x, int y) {
        super(x, y);

        initArea();
    }

    private void initArea() {

        ImageIcon icon = new ImageIcon("src/main/resources/area.png");
        Image image = icon.getImage();
        setImage(image);
    }
}
