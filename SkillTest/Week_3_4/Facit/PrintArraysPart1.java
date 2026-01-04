public class PrintArraysPart1 {
    public static void main(String[] args) {
        int[] intList = { 0, -12, 200, 67, 0, 1};
        
        System.out.println(intList[0]);
        System.out.println(intList[1]);
        System.out.println(intList[2]);
        System.out.println(intList[3]);
        System.out.println(intList[4]);
        System.out.println(intList[5]);

        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + ", ");
        }
        System.out.println();
        
    }
}
