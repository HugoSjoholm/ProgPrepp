public class SetArrayValuesPart3 {
    public static void main(String[] args) {
        int[] orginal = { 0, -12, 200, -13, 67, 10, 10, 1, 200, -200, -10, -10};
        //Set the value of the orignal[] array to a bunch of intresting things!
        int input = Integer.parseInt(args[0]);

        PrintArray(orginal);

        //Make an array that has a length of 10 and fill it with random intagers between 100-1000. Alltså tresiffrig. 
        //Print and double check the operation
        System.out.println("\n10 long array with tripple digit numbers");
 

        //Make an array that as a random lenght of at least 10 but a maximum possible lenght of n (specified by user). Fill this with random values that is ±n (same number specified by user)
        //Print and double check the operation
        System.out.println("\nRandomg length array with random values");


        //Swap the first and last element of the previous random array. 
        // Print and double check the operation
        System.out.println("\nSwap first and last elements of Random array");


        //Clone the original[] array to another array. This will be used later. 
        // Print and double check the operation
        System.out.println("\nCopy Original Array to Copy");


        //Destructivley over write the values in cloned array with the values from the random array. Tip: to avoid index out of bounds errors, make sure to keep track of which array has the limiting lenght 
        // Print and double check the operation
        System.out.println("\nCopy Random Array to Copy");


        //"move" all values of the cloned array to the "left"/lower.
        // Print and double check the operation
        System.out.println("\nShift values of the Copied list lower (to the left)");


        //Set all negative values of the clone to 0
        // Print and double check the operation
        System.out.println("\nSet all negative values to 0");


        //Sort the whole array using the same swap technuiqe as you did in "Swap the first and last element". Tip: research bubble sort!
        // Print and double check the operation
        System.out.println("\nBased on the swap logic, sort the whole random Array");


    }
    
    public static void PrintArray(int[] array) {
       
    }
}
