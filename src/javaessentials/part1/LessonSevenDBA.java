/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaessentials.part1;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.*;

/**
 *
 * @author pi
 */
class LessonSevenDBA extends JFrame implements ActionListener{
    
JLabel text, clicked;
JButton button, clickButton;
JPanel panel;
private boolean _clickMeMode = true;

JTextField textField; // Added so the constructor can intantiate it, and actionPerformed can access it.
   
 //This code lets you close the window
 static WindowListener l = new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
 };
    
LessonSevenDBA(){
    
    // The message and the button will both be toggled
    text = new JLabel("Text to save to file:");
    clicked = new JLabel("Text to retrieve from file:");

     button = new JButton("Save to File");
    //Add button as an event listener
     button.addActionListener(this);

     clickButton = new JButton("Read from File");
    //Add button as an event listener
     clickButton.addActionListener(this);

    // This is the field where the user types
     textField = new JTextField(20);
     
    //Create panel
     panel = new JPanel();
     panel.setLayout(new BorderLayout());
     panel.setBackground(Color.white);
     
    //Add label and button to panel
     getContentPane().add(panel);
     
     panel.add("North", text);
     panel.add(BorderLayout.CENTER, textField);
     panel.add(BorderLayout.SOUTH, button);
   }


public void actionPerformed(ActionEvent event){
  Object source = event.getSource();
  
  if(source == button){   // Either button
    //Variable to display text read from file
    String s = null; 
    
    if(_clickMeMode){
      try{
          
        //Code to write to file. First convert to a byte array, then write to the file.
        String text = textField.getText();
        byte b[] = text.getBytes();

        String outputFileName = 
                System.getProperty("user.home", 
          File.separatorChar + "home" + 
          File.separatorChar + "zelda") + 
          File.separatorChar + "text.txt";
          File outputFile = new File(outputFileName);
          FileOutputStream out = new 
                FileOutputStream(outputFile);
          out.write(b);
          out.close();

        //Code to read from file
        String inputFileName = 
                System.getProperty("user.home", 
          File.separatorChar + "home" + 
          File.separatorChar + "zelda") + 
          File.separatorChar + "text.txt";
          File inputFile = new File(inputFileName);
          FileInputStream in = new 
                FileInputStream(inputFile);

        byte bt[] = new 
                byte[(int)inputFile.length()];
        in.read(bt);
        s = new String(bt);
        in.close();
       }catch(java.io.IOException e){
        System.out.println("Cannot access text.txt");
      }
      
//Clear text field
      textField.setText("");
//Display text read from file
      text.setText("Text retrieved from file:");
      textField.setText(s);
      button.setText("Click Again");
      _clickMeMode = false;
    } else {
//Save text to file
      text.setText("Text to save to file:");
      textField.setText("");
      button.setText("Save to File");
      _clickMeMode = true;
    }
  }
}

public static void main(String[] args){
  //Create top-level frame
  LessonSevenDBA frame = new LessonSevenDBA();
  frame.setTitle("Example");
  //This code lets you close the window
  WindowListener l = new WindowAdapter() {
     public void windowClosing(WindowEvent e) {
       System.exit(0);
     }
  };
    frame.addWindowListener(l);
  //This code lets you see the frame
  frame.pack();
  frame.setVisible(true);
 }
}