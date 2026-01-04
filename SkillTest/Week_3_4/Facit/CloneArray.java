public class CloneArray {
    public static void main(String[] args) {
        //clone different tpyes of arrays. then modify the originals, print the clone and original and compare so they are different
        int[] intList = { 0, -12, 200, 67, 0, 0, 1, 200 };
        String[] stringList = { "Hello World", "Hur är det med dig idag?", "6", "1337", "Slutligen" };
        double[] doubleList = { 0.0, -20, -123.456, 6.7, 1337, 2, 10, 2 };

        int[] cloneIntList = clone(intList);
        String[] cloneStringList = clone(stringList);
        double[] cloneDoubleList = clone(doubleList);

        for (int i = 0; i < intList.length; i++) {
            intList[i] = i;
        }
        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = "Hellow wolrd" + i;
        }
        for (int i = 0; i < doubleList.length; i++) {
            doubleList[i] = i / doubleList.length;
        }


        PrintArraysPart3.PrintArray(intList);
        PrintArraysPart3.PrintArray(stringList);
        PrintArraysPart3.PrintArray(doubleList);
        
        PrintArraysPart3.PrintArray(cloneIntList);
        PrintArraysPart3.PrintArray(cloneStringList);
        PrintArraysPart3.PrintArray(cloneDoubleList);


    }




    public static int[] clone(int[] inputArr) {
        int[] cloneArr = new int[inputArr.length];

        for (int i = 0; i < cloneArr.length; i++) {
            cloneArr[i] = inputArr[i];
        }

        return cloneArr;
    }
    public static String[] clone(String[] inputArr) {
        String[] cloneArr = new String[inputArr.length];

        for (int i = 0; i < cloneArr.length; i++) {
            cloneArr[i] = inputArr[i];
        }

        return cloneArr;
    }
    public static double[] clone(double[] inputArr) {
        double[] cloneArr = new double[inputArr.length];

        for (int i = 0; i < cloneArr.length; i++) {
            cloneArr[i] = inputArr[i];
        }

        return cloneArr;
    }
}
