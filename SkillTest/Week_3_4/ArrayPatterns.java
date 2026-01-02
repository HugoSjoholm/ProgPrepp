public class ArrayPatterns {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        //fill arrays with some cool patterns!

        int[] fibonacciSequence = new int[input];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < fibonacciSequence.length; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        System.out.println(input + " Fibonacci numbers!");
        PrintArraysPart3.PrintArray(fibonacciSequence);

        //make n number of baby names
        String[] adjective = { "big", "small", "fast", "slow", "easy", "hard", "new", "old", "happy", "sad","bright", "dark", "clean", "dirty", "simple", "complex", "strong", "weak", "loud", "quiet", "hot", "cold", "full", "empty", "early", "late", "safe", "dangerous","correct", "incorrect"};
        String[] förnamn = {"Alma","Noah","Alice","William","Olivia","Hugo","Elsa","Liam","Vera","Adam"};
        String[] efternamn = {"Andersson","Johansson","Karlsson","Nilsson","Eriksson","Larsson","Olsson","Persson","Svensson","Gustafsson"};
        for (int i = 0; i < input; i++) {
            int random1 = (int)(Math.random() * förnamn.length);
            int random2 = (int)(Math.random() * efternamn.length);
            int random3 = (int)(Math.random() * adjective.length);

            System.out.println(adjective[random3] + " " + förnamn[random1] + " " + efternamn[random2]);
        }
        
        //generate a password of n length with random numbers and charakters
        int offset = (int)('1');
        char[] chars = new char[(int)('z') - offset + 1];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(i + (int)('1'));
        }
        PrintArraysPart3.PrintArray(chars);

        String password = "";

        for (int i = 0; i < input; i++) {
            password += chars[(int)(Math.random() * chars.length - 1)];
        }

        System.out.println("Your password is: " + password);



    }
}
