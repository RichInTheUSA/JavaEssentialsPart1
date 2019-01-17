/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaessentials.part1;

/**
 *
 * @author pi
 */
class LessonTwoD {
    
    String a,b;
    
    // Constructor
    LessonTwoD() {
        a = "\nEntered Lesson TwoD\n";
        b = "  In this example, we have a constructor and an assessor method.\n";
    }
    
    // Accessor method    
    String getText() {
        return a + b;
    }
    
    public static void main(String string){
        
        LessonTwoD myInstance = new LessonTwoD();
        String retrievedText = myInstance.getText();
        
        System.out.println(retrievedText);
    }
    
}
