/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionmultiple;

/**
 *
 * @author tiago.lucas
 */
public class ExceptionMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int a = args.length;
            System.out.println("a= "+a);
            int b = 10/a;
            int c[] = {1};
            c[10]=100;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: "+e);
        }
        System.out.println("After try/catch blocks");
    }
    
}
