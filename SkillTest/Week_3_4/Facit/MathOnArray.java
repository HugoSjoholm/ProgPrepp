public class MathOnArray {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);

        int[] list = { 0, -12, 200, 67, 0, 0, 1, 200 };
        printArray(list);


        switch (operator) {
            case '+':
                System.out.println("Do the operations!");
                for (int i = 0; i < list.length; i++) {
                    list[i] = list[i] + number;
                }                
                break;
            case '-':
                System.out.println("Do the operations!");
                for (int i = 0; i < list.length; i++) {
                    list[i] = list[i] - number;
                }
                break;
            case '*':
                System.out.println("Do the operations!");
                for (int i = 0; i < list.length; i++) {
                    list[i] = list[i] * number;
                }
                break;
            case '/':
                System.out.println("Do the operations!");
                for (int i = 0; i < list.length; i++) {
                    list[i] = list[i] / number;
                }
                break;

            default:
                System.out.println("Fel operator! Försök igen med någon av dessa: +  -  *  /");
                System.out.println("Exempel: java OperatorOnArray.java 10 *");
                break;
        }

        printArray(list);

    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", "); // skriver ut dem på samma rad efter varandra
        }
        System.out.println(); // slutligen efter hela arrayn har printas gör den en ny rad.
    }
}
