package Day7;

public class Array {
    public static void main(String[] args) {
//        System.out.println("Hello Word");


//  Assignment in Session

//        String[] b = {"mostafa", "mohamed", "ali", "ahmed", "islam"};
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//        b[4] = "abdo";
//        System.out.println("\n*************************");
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");}


        // Array != normal variable ,  it is a collection of variables of same type

        // int x = 5,10,20
        // x تشاور علي مكان تخزين ال 5

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // non-primitive type
////        System.out.println(arr[3]); //4
//
//        // Array: fixed size order by index - start count from zero
//
//        arr[0] = 5;

//        arr[10] = 5;  invalid -> out of bounds

//        arr[0] = 5.5; 5.5; invalid - > incompatible types: possible lossy conversion from double to int

//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.println(arr[i]);
//
//        }

//        System.out.println("********************************");
//
//        for (int i : arr)
//        {
//            System.out.println(i);
//        }
//        int[] numbers = new int[5]; // fixed size  كل القيم هنا بصفر
//        System.out.println(numbers[0]); //0
//
//        numbers[0] = 5;
//        System.out.println(numbers[0]); //5
//
//        numbers[1] = 6;
//        System.out.println(numbers[1]); //6
//
//        numbers[1] = 7;
//        System.out.println(numbers[1]); //7


        LinearSearch obj = new LinearSearch();
        obj.search();

    }
}

