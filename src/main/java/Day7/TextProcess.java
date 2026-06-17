package Day7;

public class TextProcess {
    public static void main(String[] args) {

//        String s = "hello big boy!";
//        System.out.println(s);
//        System.out.println(s.length()); // String.length()
//        System.out.println(s.toLowerCase()); //String.tolower case
//        System.out.println(s.toUpperCase());//String.touper case
//        System.out.println(s.charAt(5)); //String.charat()
//
//        //reference point object
//
//        String a = "Islam";
//        String b = "Islam";
//
//        System.out.println(a == b);
//
//        String c = new String("Islam"); // new object HEAP
//
//        System.out.println(a == c);
//
//        System.out.println(a.equals(c)); //compare values
//
//        String text = "i love JAVA, java is fun.";
//        String lower = text.toLowerCase();
//        System.out.println(lower);
//        String upper = text.toUpperCase();
//        System.out.println(upper);
//        System.out.println(text.indexOf('a')); // first occurance
//        System.out.println(text.lastIndexOf('a'));// last occurance

        countWords("i love JAVA, java is fun.");

        reversWords("i love JAVA, java is fun.");

    }

    //Method =. count number of words in a text

    // when should I use static

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contain %d words", numberOfWords); // format
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);

        }
    }

    private static void reversWords(String text) {
        String reversedtext = "";
        for (int i = text.length() - 1; i >= 0; i--) {

            reversedtext = reversedtext + text.charAt(i);
        }
        System.out.println(reversedtext);
    }
}