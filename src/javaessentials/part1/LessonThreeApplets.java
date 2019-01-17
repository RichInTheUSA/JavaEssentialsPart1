/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaessentials.part1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author pi
 */
public class LessonThreeApplets extends Applet{
    
    String a = "\nEntered Lesson Three Applets\n";
    String b;

    public LessonThreeApplets() {
        this.b = "  I'm a simple applet\n My methods are init(), start(), stop(), destroy() and paint()";
        this.start();
    }
    
    @Override
    public void init() {
        System.out.println("Init...");
        b = "I'm a simple applet";
        setBackground(Color.cyan);
    }
    
    @Override
    public void start() {
        System.out.println("Starting...");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroying...");
    }
    
    @Override
    public void paint(Graphics g) {
        System.out.println("Paint");
        g.setColor(Color.blue);
        g.drawRect(0,0,
                getSize().width -1,
                getSize().height -1);
        g.setColor(Color.blue);
        g.drawString(b, 15,25);
    }
   
}
