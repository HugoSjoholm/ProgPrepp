public class PrintArraysPart2 {
    public static void main(String[] args) {
        int[] intList = { 0, -12, 200, 67, 0, 0, 1, 200 };
        int[] randomList = new int[20];
        
        for (int i = 0; i < randomList.length; i++) {
            randomList[i] = (int)(Math.random()*100-50);
        }

        System.out.println(" * Print int list! * ");
        PrintArray(intList);
        
        System.out.println(" * Print random int list! * ");
        PrintArray(randomList);

    }
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(); 
    }
}
