public class ReverseArray {
    public static void main(String[] args) {
        int[] list = {0,-12,200,67,0,0,1,200};
        int[] reversedList = new int[list.length];
        
        //skriv en metod som printar ut allting i en array. Med hjälp av denna printa ut all i list[]
        //Sedan fyll reverseedList så att den slutligen är en omvänd version av list  {a,b,c} -> {c,b,a}

        printArray(list);

        System.out.println("reverse the list!!");
        for (int i = 0; i < reversedList.length; i++) {
            reversedList[i] = list[list.length - i - 1]; //Om denna logiken är svår att förstå rekomenderar att rita upp båda listor på papper och köra denna logik för hand
        }

        printArray(reversedList);

    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", "); //skriver ut dem på samma rad efter varandra
        }
        System.out.println(); //slutligen efter hela arrayn har printas gör den en ny rad. 
    }
}
