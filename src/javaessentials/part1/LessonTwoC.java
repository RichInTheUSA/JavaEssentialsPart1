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
class LessonTwoC {
    
    static String a = "\nEntered Lesson TwoC\n";
    static String b = "  In this case, both the method is static, and the string is static\n";

    // Accessor method
    static String getText() {
        return a + b;
    }
    
    public static void main(String string){
        String retrievedText = getText();
        System.out.println(retrievedText);
    }
    
}
