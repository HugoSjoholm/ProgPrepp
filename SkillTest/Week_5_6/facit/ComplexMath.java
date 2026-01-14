public class ComplexMath {
    public static void main(String[] args) {
        // this program and the class ComplexNum.java is apart of the same assigment. 
        // You will continously define the class CompledNum.java and in this program you will test that class
        
        // 1. Make four constructors in the ComplexNum class. 
        // * (float real, float imaginary) 
        // * (float real) 
        // * (int real, int imaginary)
        // * (int real) 
        // Make two complex numbers, num1 and num2, num1 should be defined with ints. num2 should be defined with floats (kinda decimals)
        // Print both x and y parts of num1 and num2 using dot notations (for example array.length)
        ComplexNum num1 = new ComplexNum(1, 2);
        ComplexNum num2 = new ComplexNum(1.5f, -1.447f);
        
        //System.out.println("1. Print both real and imaginary part of num1 and num2 using dot notation.");
        //System.out.println(num1.re + " " + num1.im); //Deta är utkomenterat eftersom att just denna kåd kommer ge errors när hela lösningen är färdig. 
        //System.out.println(num2.re + " " + num2.im);
        
        
        // 2. In the ComplexNum class make the variables re and im private. 
        // * private float re;
        // * private float im;
        // Then try to print num1 and num2 using the same way you did before. Does your previous code still work?
        
        //System.out.println("2. Print the variables inside num1 and num2 that you made private");
        //System.out.println(num1.re + " " + num1.im); //Deta är utkomenterat eftersom att just denna kåd kommer ge errors när hela lösningen är färdig. 
        //System.out.println(num2.re + " " + num2.im);
        
        // 3. In the ComplexNum class make get and set methods for both re and im. getReal(), setReal(), getImaginary(), setImaginary()
        // Then try to print both num1 and num2, but this time use getReal and getImaginary to ascces the variables.        
        System.out.println("3. Print num1 and num2, but now with getters");
        System.out.println(num1.getReal() + " " + num1.getImaginary());
        System.out.println(num2.getImaginary() + " " + num2.getImaginary());

        // 4. Change the values of both num1 and num2 using .setReal() and .setImaginary(). Then print and double check the change!
        System.out.println("4. Update/Change num1 and num2");

        num1.setReal(6.7f);
        num1.setImaginary(-13.37f);

        num2.setReal(5);
        num2.setImaginary(0);

        System.out.println(num1.getReal() + " " + num1.getImaginary());
        System.out.println(num2.getReal() + " " + num2.getImaginary());

        // 5. Up to this point we've been verifying our results using println() and asscessing both real and imaginary part. 
        // Write a method called toString() in the ComplexNum class. Then print both num1 and num2 like this
        // * System.out.println(num1);
        // > 6.7+13.37i   
        System.out.println("5. Print using toString(): ");
        System.out.println(num1);
        System.out.println(num2);
    

        // 6. Make a getAbs() methods that calculates |z| and returns the |z| of the complex number. Not the literal absolute value but rather the lenght of the number/vector
        // * |z| = √((real)²+(imaginary)²)
        System.out.println("6. Absolute value: ");
        System.out.println(num1.getAbsolute());
        System.out.println(num2.getAbsolute());

        // 7. In the ComplexNum class, make a getConjugate method that returns the konjugat as a new ComplexNum object/variable. 
        // Print the returned value of .getConjugate and compare it to num1 and num2. 
        System.out.println(" 7. Print the konjugat");
        System.out.println(num1.getConjugate());
        System.out.println(num2.getConjugate());


    }
}
