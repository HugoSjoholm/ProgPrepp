public class AvrageArray {
    public static void main(String[] args) {
        //make an empty array of n lenght. fill it with random posetive values
        //Make a method that will take in an array as input, calculate the avrage, and return the avrage. 
        int input = Integer.parseInt(args[0]);
        int[] randomIntArray = new int[input];
        double[] randomDoubleArray = new double[input];

        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = (int)(Math.random()*90 + 10);
        }  
        PrintArray(randomIntArray);

        for (int i = 0; i < randomDoubleArray.length; i++) {
            randomDoubleArray[i] = (Math.random() * 90 + 10);

        }
        PrintArray(randomDoubleArray);

    }
    public static double avrageArray(int[] array) {
        double avrage = 0;

        for (int i = 0; i < array.length; i++) {
            avrage += array[i];
        }

        avrage = avrage / array.length;

        return avrage;
    }
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    public static void PrintArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
