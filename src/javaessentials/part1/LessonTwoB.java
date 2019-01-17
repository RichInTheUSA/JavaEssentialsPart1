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
class LessonTwoB {
    
    String a = "\nEntered Lesson TwoB\n";
    String b = "  This string is not static";
    
    static String c = "  This string is static\n";

    
    String getText() {
        return a + b;
    }
        
    String getStaticText() {
        return c;
    }
    
    public static void main(String string){
        
        LessonTwoB myInstance = new LessonTwoB();
        
        String retrievedText = myInstance.getText();
        
        String retrievedStaticText = myInstance.getStaticText();
        
        System.out.println(retrievedText);
        System.out.println(retrievedStaticText);
    }
    
}
