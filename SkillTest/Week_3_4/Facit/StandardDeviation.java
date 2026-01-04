public class StandardDeviation {
    public static void main(String[] args) {
        //Using the avrage from AvrageArray.java (if you're smart, you can acsses it using dot notation!) calculate the standard deviation. 
        //do this for both a randomly filled array and this pre made data set. Doubble check your result using this site!
        //https://www.calculatorsoup.com/calculators/statistics/standard-deviation-calculator.php
        int input = Integer.parseInt(args[0]);
        int[] randomArray = new int[input];
        int[] definedArray = {87, 14, 392, 56, 241, 9, 178, 64, 301, 22, 415, 97, 6, 259, 134, 48, 372, 81, 190, 27, 503, 116, 39, 284, 75, 421, 168, 12, 355, 94, 207, 61, 489, 33, 142, 268, 19, 326, 58, 401, 211, 7, 359, 125, 46, 287, 92, 174, 318, 21};


        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)((int)(Math.random()*90 + 10));
        }


        System.out.println("random avrage and standard deviation is " + AvrageArray.avrageArray(randomArray) + " ±" + stdDeviation(randomArray));
        System.out.println("random avrage and standard deviation is " + AvrageArray.avrageArray(definedArray) + " ±" + stdDeviation(definedArray));

    }
    public static double stdDeviation(int[] arr) {
        double deviation = 0;
        double avrage = AvrageArray.avrageArray(arr);
        double sumOfSquares = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfSquares += Math.pow((avrage - arr[i]) , 2);
        }

        deviation = Math.sqrt(sumOfSquares / (arr.length - 1));

        return deviation;
    }
}
