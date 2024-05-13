public class MyHashTable {

    private HashNode[] buckets; //array of Hash nodes
    private int size; // size of buckets(Key-value pairs)
    private int numOfBuckets; // capacity
    private class HashNode{
        private String key; // key of value(right now it is string,but it also can be integer)
        private Integer value; //value, can be identified by key
        private HashNode next;

        public HashNode(String key, Integer value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashTable(int capacity){
        this.numOfBuckets = capacity;
        buckets = new HashNode[capacity];
        size =0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        else{
            return false;
        }
    } 

}
