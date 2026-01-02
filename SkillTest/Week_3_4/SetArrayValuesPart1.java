public class SetArrayValuesPart1 {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        int[] intList = { 0, -12, 200, 67};
        int[] secondList = { 1, 1, 1, 1};
        System.out.println(intList[input] + ", " + secondList[input]);

        secondList[0] = 0;
        secondList[1] = 0;
        secondList[2] = 0;
        secondList[3] = 0;
        System.out.println(intList[input] + ", " + secondList[input]);

        secondList[0] = intList[0]; 
        secondList[1] = intList[1]; 
        secondList[2] = intList[2]; 
        secondList[3] = intList[3]; 
        PrintArray(secondList);
        
        intList[0] = 1337;
        intList[3] = 999;
        PrintArray(intList);
        


    }
    
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
