public class PrintArraysPart3 {
    public static void main(String[] args) {
        int[] intList = { 0, -12, 200, 67, 0, 0, 1, 200 };
        String[] stringList = {"Hello World", "Hur är det med dig idag?", "6", "1337", "Slutligen"};
        double[] doubleList = {0.0, -20, -123.456, 6.7, 1337, 2, 10, 2};
        int[] randomList = new int[50];
        int[][] list2D = new int[10][10];

        System.out.println(" * Print int list!  * ");
        PrintArray(intList);

        System.out.println(" * Print string list! * ");
        PrintArray(stringList);

        System.out.println(" * Print double list! * ");
        PrintArray(doubleList);

        for (int i = 0; i < randomList.length; i++) {
            randomList[i] = (int)(Math.random()*100-50);
        }
        for (int x = 0; x < list2D.length; x++) {
            for (int y = 0; y < list2D[x].length; y++) {
                list2D[x][y] = (int)(Math.random()*10);
            }
        }

        System.out.println(" * Print random int list! * ");
        PrintArray(randomList);

        System.out.println(" * Print random 2D int list! * ");
        PrintArray(list2D);

    }
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(); 
    }
    public static void PrintArray(String[] array) {
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
    public static void PrintArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();        
    }
    public static void PrintArray(int[][] array) {

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(array[x][y] + ", ");
            }
            System.out.println();

        }
        System.out.println();

    }
    public static void PrintArray(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
