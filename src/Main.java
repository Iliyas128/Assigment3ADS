import java.util.Random;


public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(1, "Value 1");
        bst.put(3, "Value 3");
        bst.put(7, "Value 7");
        bst.put(4, "Value 4");
        bst.put(2, "Value 2");


        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(1000);
            MyTestingClass object = new MyTestingClass(String.valueOf(id)); // Use id as the key for MyTestingClass
            table.put(object, "Value " + i);
        }

        table.printBucketSizes();
    }

}