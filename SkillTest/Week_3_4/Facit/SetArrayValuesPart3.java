public class SetArrayValuesPart3 {
    public static void main(String[] args) {
        int[] orginal = { 0, -12, 200, -13, 67, 10, 10, 1, 200, -200, -10, -10};
        int input = Integer.parseInt(args[0]);

        PrintArray(orginal);


        System.out.println("\n10 long array with tripple digit numbers");
        int[] tenArray = new int[10];        
        for (int i = 0; i < tenArray.length; i++) {
            tenArray[i] = (int) (Math.random() * 900) + 100;
        }
        PrintArray(tenArray);


        System.out.println("\nRandomg length array with random values");
        int[] randomArray = new int[ (int) (Math.random() * input) + 10];        
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)((Math.random() * 2 * input) - input);
        }
        PrintArray(randomArray);


        System.out.println("\nSwap first and last elements of Random array");
        int temp = 0; //temp kort för temporary. den är lika med noll för int måste defineras med ett värde.
        temp = randomArray[0];
        randomArray[0] = randomArray[randomArray.length - 1];
        randomArray[randomArray.length - 1] = temp;
        PrintArray(randomArray);


        System.out.println("\nCopy Original Array to Copy");
        int[] copyList = new int[orginal.length];
        for (int i = 0; i < copyList.length; i++) {
            copyList[i] = orginal[i];
        }
        PrintArray(copyList);


        System.out.println("\nCopy Random Array to Copy");
        int lenghtLimit = 0;

        if (copyList.length < randomArray.length) {
            lenghtLimit = copyList.length;
        }
        else {
            lenghtLimit = randomArray.length;
        }

        for (int i = 0; i < lenghtLimit; i++) {
            copyList[i] = randomArray[i];
        }
        PrintArray(copyList);


        System.out.println("\nShift values of the Copied list lower (to the left)");
        for (int i = 0; i < copyList.length - 1; i++) {
            copyList[i] = copyList[i + 1];
        }
        PrintArray(copyList);


        System.out.println("\nSet all negative values to 0");
        for (int i = 0; i < copyList.length; i++) {
            if (copyList[i] < 0) {
                copyList[i] = 0;
            }
        }
        PrintArray(copyList);


        System.out.println("\nBased on the swap logic, sort the whole random Array");
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray.length - 1; j++) {
                temp = randomArray[j];
                if (temp > randomArray[j + 1]) {
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j + 1] = temp;
                }

            }
        }
        PrintArray(randomArray);

    }
    
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
