/*
Daniel Balser
program will calculate how many slices of pizza per diameter of pizza
 */
package pizza2;
import javax.swing.*;

public class Pizza2 {// start class
        static int diameter;
        static double area;
        static int SizeSlice;
        static int num_slices;
        
    public static void main(String[] args) {// start main method
     
        String s1;
        
        /*diameter= 18;
        System.out.println("Enter the diameter of the pizza");
        diameter= kb.nextInt();
        */
        s1= JOptionPane.showInputDialog("Enter the diameter of the pizza");
        diameter= Integer.parseInt(s1);
        
        /*SizeSlice= 30;
        System.out.println("Enter the size of slice");
        SizeSlice= kb.nextInt();
        */
        s1= JOptionPane.showInputDialog("Enter the size of slice");
        SizeSlice= Integer.parseInt(s1);
        
        
        area= 3.14 * (diameter/2) * (diameter/2);
       
     // call calculate method
       Calculate();
       
    }// end main method
    
    public static void Calculate() {// start Calculate method
        
        
        num_slices= (int) area/SizeSlice;
        JOptionPane.showMessageDialog(null,"the number of slices for an " + diameter + " inch pie is " + num_slices);
        
    }// end Calculate method
}// end class


