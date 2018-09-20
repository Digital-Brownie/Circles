/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Student
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Circles.classFunction();
//        System.out.println("Circle 1's output");
//        System.out.println("");
//        
//        Circles circle1 = Circles.getInput();
//        
//        System.out.println("circ = " + circle1.getCircumference());
//        System.out.println("rad = " + circle1.getRadius());
//        circle1.DisplayCircumferenceAndRadius();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Circle 2's output");
        Circles circle2 = new Circles(7, "rad"); //(double input, String function)

        System.out.println("");
        System.out.println("Get Methods");
        System.out.println("Circle 2 circ: " + circle2.getCircumference());
        System.out.println("Circle 2 rad: " + circle2.getRadius());

        System.out.println("");
        System.out.println("Display Method");
        circle2.DisplayCircumferenceAndRadius();

        System.out.println("");
        System.out.println("Circle 3");
        System.out.println("");
        Circles circle3 = new Circles();

        circle3.setFunction("circ");
        circle3.setInput(27);

        circle3.getCircumference();
        circle3.getRadius();

        circle3.DisplayCircumferenceAndRadius();

    }

}
