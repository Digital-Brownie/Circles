/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Circles {
    
    private static final double PI = 3.14;
    
    private double radius;
    private double circumference;
    
    private double input;
    private String function;

    public static void classFunction() 
    {
        System.out.println("This class finds the radius and the cicumferenece of a given circle");
    }

    public Circles(double input, String function) {
        this.input = input;
        this.function = function;
    }

    public Circles(String function) {
        this.function = function;
        this.input = 0;
    }

    public Circles(double radius, double circumference, String function) {
        this.radius = radius;
        this.circumference = circumference;
        this.function = function;
    }

    public Circles() {
        this.input = 0;
        this.function = "circ";        
    }
    
    //Two Getters

    public double getRadius() {
        double result = 0;
        
        if (this.function.equalsIgnoreCase("rad")) {
            result = this.input;
            this.radius = this.input;
        }
        else if (this.function.equalsIgnoreCase("circ")) {
            result = (this.input / (2 * PI ));
            this.radius = result;
        }
        
        return result;
    }

    public double getCircumference() {
        double result = -1;
        
        if (this.function.equalsIgnoreCase("circ")) {
            result = this.input;
            this.circumference = this.input;
        }
        else if (this.function.equalsIgnoreCase("rad")) {
            result = ((2 * PI) * this.input);
            this.circumference = result;
        }        
        return result;
    }
    
    //Three Setters
     
    public void setFunctionAndInput(String function, double input) {
        this.function = function;
        this.input = input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public void setFunction(String function) {
        this.function = function;
    }
    
    //input Method to get input from the user
    
    public static Circles getInput()
    {
        double input;   
        String function;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the function to be performed");
        function = scn.next();
        
        System.out.println("Enter the input value");
        input = scn.nextDouble();
        
        return new Circles(input, function);        
    }
    
    //Display Methods
    public void DisplayCircumferenceAndRadius()
    {
        System.out.println("Radius: " + this.radius);
        System.out.println("Circumference: " + this.circumference);
    }
    
    
    
    
    

    
    
    
}
