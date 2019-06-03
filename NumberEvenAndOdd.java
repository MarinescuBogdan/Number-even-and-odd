package Curs17.NumberEvenAndOdd;

public class NumberEvenAndOdd {

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 4, 9};
        int nrEven = 0;
        int nrOdd = 0;


        int position = array.length -1; //4


        while (position >= 0) {
            if (array[position] % 2 == 0) {
                nrEven++;
            } else {
                nrOdd++;
            }
            position = position - 1;
        }


        System.out.println("Nr. even: " + nrEven);
        System.out.println("Nr. odd: " + nrOdd);

    }
}



//        varianta cu for :


//        for (int i = 0; i < position; i++) {
//            if (array[i] % 2 != 0) {
//                nrOdd++;
//                System.out.println("Nr. odd: " + nrOdd);
//
//            }
//        }
//
//        for (int i = 0; i < position; i++) {
//            if (array[i] % 2 == 0) {
//                nrEven++;
//
//                System.out.println("Nr. even: " + nrEven);
//
//
//            }
//
//        }



