
// RICH TEST

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaessentials.part1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author pi
 */
public class JavaEssentialsPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nEntered Lesson Two");
        System.out.println("  I'm a Simple Program");
        System.out.println("  This repo containst example code from https://www.oracle.com/technetwork/java/index-jsp-135888.html");
        System.out.println("  Code comments can be either double slashes // or C-style /* and */");
        System.out.println("  Java doc uses /** and */ to end. API documenatin is stored in a folder /doc/api under the installed platform.");
        
        LessonTwoA.main("");
        LessonTwoB.main("");
        LessonTwoC.main("");
        LessonTwoD.main("");

        System.out.println("\nEntered Lesson Three - Applets");
        System.out.println("  Applets need to be run from an applet viewer. Use 'run file' within the IDE");
        //LessonThreeApplets a = new LessonThreeApplets();
        
        System.out.println("\nEntered Lesson Four - Swing");
        System.out.println("  This opens an Jframe UI");
        
        LessonFourAppletsSwing frame = new LessonFourAppletsSwing();
        frame.setTitle("Example Jframe");
        frame.addWindowListener(LessonFourAppletsSwing.l);
        //This code lets you see the frame
        frame.pack();
        frame.setVisible(true);
        
        System.out.println("\nEntered Lesson Six - IO");
        System.out.println("  This opens an Jframe UI");
        
        LessonSixFileIO frame2 = new LessonSixFileIO();
        frame2.setTitle("Example Jframe");
        frame2.addWindowListener(LessonSixFileIO.l);
        //This code lets you see the frame
        frame2.pack();
        frame2.setVisible(true);
    }
    
}
