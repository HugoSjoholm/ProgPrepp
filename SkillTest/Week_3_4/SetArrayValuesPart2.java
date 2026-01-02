public class SetArrayValuesPart2 {
    public static void main(String[] args) {
        int[] intList = { 0, -12, 200, 67, 0, 0, 1, 200};

        for (int i = 0; i < intList.length; i++) {
            intList[i] = 67;
        }
        PrintArray(intList);

        for (int i = 0; i < intList.length; i++) {
            intList[i] = i;
        }
        PrintArray(intList);

        for (int i = 0; i < intList.length; i++) {
            intList[i] = (int)Math.pow(i, 2.5);
        }
        PrintArray(intList);

        for (int i = 0; i < intList.length; i++) {
            intList[i] = (int)(Math.random()*100);
        }
        PrintArray(intList);

        for (int i = 0; i < intList.length; i++) {
            intList[i] = intList.length - i;
        }
        PrintArray(intList);


    }
    
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
