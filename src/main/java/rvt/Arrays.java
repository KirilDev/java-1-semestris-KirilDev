package rvt;



public class Arrays {
    public static void main(String[] args){
        String[] stringArr = new String[5];
        /* Limits:
         * - Elements is limited only to one data type, if defined as an int, stays as an int. (type[] name = new type[lenght]; <- keyword new = making new object)
         * - Fixed amount of elements in an array. We're reserving somekind amount of RAM memory for our program. N-1 -> if lenght is 27, 26 elements.
         * - Illegal indexes: 1.5, -1 + j -> can't tell without more information (depends on the current value of j)
         * - null != ""  
         */

         /*
           int[] intArr = new int[5]; 
           System.out.println(Arrays.ToString(intArr));
         */

        /*
         * String[] arr = new String[5]
         * if (arr[4] == null){
         * //TODO: Do something
         * }
         */

         int x = 6;
         int[] intArray = new int[5];
         intArray[0] = 0;
         intArray[1] = 10;
         intArray[2] = 100;
         intArray[3] = x * getFour();
         intArray[4] = 10000;

        }
        public static int getFour(){
            return 4;
    }   
}
