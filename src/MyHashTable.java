public class MyHashTable <K,V>{
    private class HashNode<K,V>{
        private K key; // key of values
        private V value; //value, can be identified by key
        private HashNode<K,V> next;

        public HashNode(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
    private HashNode<K,V>[] buckets;
    private int size; // size of buckets(Key-value pairs)
    private int numOfBuckets; // capacity

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
