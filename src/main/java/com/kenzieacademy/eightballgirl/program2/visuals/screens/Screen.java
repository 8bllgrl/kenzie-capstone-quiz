package com.kenzieacademy.eightballgirl.program2.visuals.screens;

import com.kenzieacademy.eightballgirl.program2.main.Main;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class Screen {

    //Description:

    //variables
    public static int width;
    public static int height;

    //constructors

    //methods
    public void init(final int width, final int height) {
        this.width = width;
        this.height = height;
        //children
        //buttons
    }

    public void render(Graphics2D g2) {
        g2.fillRect(width / 2, height / 2, 50, 50);
    }

    public void update(){
        //repaint.
    }
    public void keyTyped(KeyEvent e) {

        System.out.println("A Generic Screen KeyTyped Method was called.");

    }
    //getters & setters
}
