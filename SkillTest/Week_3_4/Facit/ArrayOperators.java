public class ArrayOperators {
    public static void main(String[] args) {
        //this one is more advanced. but fun! Here you will make a lot of different operators for arrays (but let's focus on int[] for now) that can be usefull!
        
        //make some methods that you can call upon an int[]
        //First() - returns the first value of the array
        //Last() - returns the last value of the array
        //Containes(x) - returns true/false if an array containes x
        //IndexOf(x) - returns the index of the first value x
        //Min() & Max() - return the minimum and maximum values of the array
        //Count(x) - number of elements with value x
        //Equals() - returns true/false if two arrays contains the same values in the same order. If they equal eachother
        //Sort() - *return* a sorted version of the array. For example, use bubble sort!
        //Reverse() - Reverse the given array. 
        
        //Push() - Append to the *end* of an array (the lenght *increases* by one)
        //Pop() - Discards *last* element (the lenght *decreases* by one)
        //Shift() - Discards *first* element (the lenght *decreases* by one)
        //Unshift() - (also called preend) Preends to the *start* of an array (the lenght *increases* by one)
        //InsertAt(index, value) - Adds an element with a value at a specified index (the lenght *increases* by one)
        //RemoveAt(index) - *Discards* a specific element (the lenght *decreases* by one)
        //Merge() - merge two arrays
        //Difference() - return an array containg the deffering elements between two arrays. {a,b,y,z,ä,ö} - {x,y,z,å,ä,ö} = {a,b,z,å}
        //Subarray() - extrax a range of values from the original array. 
        //Shuffel() - Randomly reorganise the array withoute overwriting data
        
        //int[] arr = new int[20];
        int[] list3 = { 10, 25, 45, 15, 67, 69, 429, 200, -500, -300, 9999, 1337};
        int[] list2 = { 10, -12, 200, 67, 0, 0, 1, 200};
        int[] list = { 10, -12, 200, 67, 0, 0, 1, 200};

        PrintArraysPart3.PrintArray(list);
        System.out.println();

        System.out.println(First(list));
        System.out.println(Last(list));
        System.out.println(Containes(list, 67));
        System.out.println(IndexOf(list, 67));
        System.out.println(Min(list));
        System.out.println(Max(list));
        System.out.println(Count(list, 200));
        System.out.println(Equals(list2, list));

        PrintArraysPart3.PrintArray(Sort(list));
        PrintArraysPart3.PrintArray(Reverse(list));
        PrintArraysPart3.PrintArray(Push(list, 99));
        PrintArraysPart3.PrintArray(Pop(list));
        PrintArraysPart3.PrintArray(Shift(list));
        PrintArraysPart3.PrintArray(Unshift(list, 99));
        PrintArraysPart3.PrintArray(InsertAt(list, 3, 99));
        PrintArraysPart3.PrintArray(RemoveAt(list, 3));
        PrintArraysPart3.PrintArray(Merge(list, list3));
        PrintArraysPart3.PrintArray(Difference(list, list3));
        PrintArraysPart3.PrintArray(Subarray(list, 2, 6));
        PrintArraysPart3.PrintArray(Shuffel(list));




    }
    public static int Last(int[] array) {
        return array[array.length - 1];
    }
    public static int First(int[] array) {
        return array[0];
    }
    public static boolean Containes(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
    public static int IndexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; //no index was found
    }
    public static int Min(int[] array) {
        int currentMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < currentMin) {
                currentMin = array[i];
            }
        }
        return currentMin;

    }
    
    public static int Max(int[] array) {
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > currentMax) {
                currentMax = array[i];
            }
        }
        return currentMax;

    }
    public static int Count(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }
    public static boolean Equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;

    }
    public static int[] Sort(int[] array) {
        int[] copy = CloneArray.clone(array);
        int swap = 0;

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    swap = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = swap;
                }
            }
        }
        return copy;

    }
    public static int[] Reverse(int[] array) {
        int[] rev = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            rev[i] = array[array.length - i - 1];
        }


        return rev;
    }
    public static int[] Push(int[] array, int value) {
        int[] newArr = new int[array.length + 1];
        
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[newArr.length - 1] = value;

        return newArr;
    }
    public static int[] Pop(int[] array) {
        int[] newArr = new int[array.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = array[i];
        }

        return newArr;
    }
    public static int[] Shift(int[] array) {
        int[] newArr = new int[array.length - 1];

        for (int i = 1; i < array.length; i++) {
            newArr[i - 1] = array[i];
        }

        return newArr;
    }
    public static int[] Unshift(int[] array, int value) {
        int[] newArr = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArr[i + 1] = array[i];
        }
        newArr[0] = value;

        return newArr;
    }
    public static int[] InsertAt(int[] array, int index, int value) {
        int[] newArr = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }

        newArr[index] = value;
        
        for (int i = index; i < array.length; i++) {
            newArr[i + 1] = array[i];
        }

        return newArr;

    }
    
    public static int[] RemoveAt(int[] array, int index) {
        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i >= index) {
                newArr[i] = array[i + 1];
            }
            else {
                newArr[i] = array[i];
            }
        }
        return newArr;

    }
    public static int[] Merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];


        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[i + arr1.length] = arr2[i];
        }


        return merged;
    }
    public static int[] Difference(int[] arr1, int[] arr2) {
        int maxLength = -1;
        int diffLenght = 0;

        int[] longDiff = new int[arr1.length + arr2.length];

        if (arr1.length > arr2.length) {
            maxLength = arr1.length;
            for (int i = 0; i < maxLength; i++) {
                if (!Containes(arr2, arr1[i])) {
                    longDiff[diffLenght] = arr1[i];
                    diffLenght++;
                }
            }

        }
        else {
            maxLength = arr2.length;
            for (int i = 0; i < maxLength; i++) {
                if (!Containes(arr1, arr2[i])) {
                    longDiff[diffLenght] = arr2[i];
                    diffLenght++;
                }
            }
        }

        int[] shortDiff = new int[diffLenght];

        for (int i = 0; i < shortDiff.length; i++) {
            shortDiff[i] = longDiff[i];
        }
        return shortDiff;

    }
    public static int[] Shuffel(int[] arr) {
        
        int[] shuffled = new int[arr.length];
        boolean[] isFilled = new boolean[arr.length];
        //isFilled starts filled with 0,0,...,0. when a spot is filled the corespending index in options gets set to 
        int rnd = (int) (Math.random() * arr.length);
        shuffled[rnd] = arr[rnd];
        isFilled[rnd] = true;

        for (int i = 1; i < arr.length; i++) {
            rnd = (int)(Math.random()*arr.length);
            while (isFilled[rnd] == true) {
                //System.out.println( i + " - rnd is " + rnd + " which is " + isFilled[rnd]);
                rnd = (int) (Math.random() * arr.length);
            }
            shuffled[rnd] = arr[i];
            isFilled[rnd] = true;
            //PrintArraysPart3.PrintArray(isFilled);
        }
        return shuffled;
    }
    public static int[] Subarray(int[] arr, int start, int end) {
        int[] subarr = new int[end - start];

        for (int i = start; i < end; i++) {
            subarr[i - start] = arr[i]; 
        }

        return subarr;

    }
}
