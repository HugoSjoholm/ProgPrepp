public class PrintArraysPart3 {
    public static void main(String[] args) {
        int[] intList = { 0, -12, 200, 67, 0, 0, 1, 200 };
        String[] stringList = {"Hello World", "Hur är det med dig idag?", "6", "1337", "Slutligen"};
        double[] doubleList = {0.0, -20, -123.456, 6.7, 1337, 2, 10, 2};
        int[] randomList = new int[50];
        int[][] list2D = new int[10][10];
        //make methods to print each of these arrays. It's important that all methods have the same methods name!
        //the empty methods should be filled with random values.

        System.out.println(" * Print int list!  * ");
        PrintArray(intList);

        System.out.println(" * Print string list! * ");
        PrintArray(stringList);

        System.out.println(" * Print double list! * ");
        PrintArray(doubleList);

    

        System.out.println(" * Print random int list! * ");
        PrintArray(randomList);

        System.out.println(" * Print random 2D int list! * ");
        PrintArray(list2D);

    }
    
}
