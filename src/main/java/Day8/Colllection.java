package Day8;

import java.util.*;


public class Colllection {
    public static void main(String[] args) {
        // Arrays are fixed size - once created can't resize them
        // Collections are dynamic, more powerful, built in methodS

        String[] names = new String[3];

        names[0] = "Aya";
        names[1] = "Yassin";
        names[2] = "Ahmed";
        //  names [3]= "Islam"; out of index

        //collections solve this problem add, remove, search, sort

        /*

                            Collection (Interface)
                             |
      -------------------------------------------------
      |                       |                       |
   List                  Set                    Queue
      |                       |                       |
  ----------          ----------------       ----------------
  |    |    |          |      |      |       |              |
ArrayList LinkedList Vector HashSet LinkedHashSet TreeSet LinkedList PriorityQueue


                    Map (Interface)
                           |
      ------------------------------------------------
      |                  |               |           |
   HashMap         LinkedHashMap      TreeMap    Hashtable

         */


 /*
     Collection → Base interface for List, Set, and Queue.
     List → Ordered collection, allows duplicates.
     Set → No duplicate elements, no index.
     Queue → FIFO (First In, First Out) order. Examples: LinkedList, PriorityQueue.
     Map → Stores data as key-value pairs. Example: HashMap
  */

//        arraylistDemo();
//        hashSetDemo();
//        ListDemo();

//        vectorDemo();
//        queue();

        hashMapDemo();

    }

//ArrayList

    static void arraylistDemo() {
        ArrayList<String> list = new ArrayList<>(); // No size limit
        list.add("Ahmed");
        list.add("Ahmed");
        list.add("Marwa");
        list.add("Sasa");
        list.add("Doha");

        System.out.println(list);
        System.out.println(list.get(2));//Marwa
        System.out.println(list.size());//5
        System.out.println(list.getFirst());//ahmed
        System.out.println(list.getLast()); // doha

        list.remove("Ahmed"); //removes first occurrence of "ahmed"
        list.remove(3);
        System.out.println(list);

        for (String s : list)
            System.out.println(s);

        //Lambda Expression : A Lambda Expression in Java is a short way to implement a functional interface
        // (an interface with one abstract method) without creating a class, using the -> syntax.
        list.forEach(System.out::println);
        list.forEach(s -> System.out.println(s));

        System.out.println(list.contains("Marwa")); //true
        System.out.println(list.contains("Doha")); //false
        /*
        Dynamic sizing
        methods add(), get(), remove(), size(), and contains()
        Enhanced for-loop works seamlessly
         */
    }

    // HashSet (No duplicated )


    static void hashSetDemo() {

        HashSet<String> colors = new HashSet<>();
        // Set<String> colors = new HashSet<>(); طريقه اخري

        colors.add("Red");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");


        System.out.println(colors); // [Red, Blue, Green] - no Duplicate
    }

    // List => Array List , Linked list , Vector , Stack

    static void ListDemo() {

        LinkedList<Object> items = new LinkedList<>();
        items.add("Apple");
        items.add(2);
        items.add(2.6);
        items.add(true);

        System.out.println(items);
        System.out.println(items.get(2));
        System.out.println(items.size());
        System.out.println(items.getFirst());
        System.out.println(items.getLast());

    }

    static void vectorDemo() {
        Vector<String> v = new Vector<>();

        v.add("A");
        v.add("B");
        v.add("C");

        System.out.println(v);
    }

    static void stackDemo() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.pop());

    }
    // Linked list - Priority Queue

    static void queue() {

        Queue<Object> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add("ROUTE");
        q.add(4);
        q.add("JAVA");
        q.add("JAVA");

        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.remove()); // يحذف اول عنصر 1
        System.out.println(q.remove()); // 2
        System.out.println(q.peek());//   shows head without removing it
        System.out.println(q.poll()); //   shows first element and remove it

        q.add("Testing");
        System.out.println(q);

        q.addAll(List.of("A", "B", "C"));
        System.out.println(q);
    }

    static void hashMapDemo() {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "cairo");
        map.put(2, "sohag");
        map.put(3, "Berlin");
        map.put(4, "Berlin");
        map.put(5, "Dahab");
        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(entry.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.remove(2));
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("Dahab"));
        System.out.println(map.containsKey(3));

        map.forEach((k, v) -> System.out.println(k + " " + v));

        Map<String, Double> yara = new HashMap<>();
        yara.put("cairo", 1.0);
        yara.put("cairo", 1.0);

    }

}
