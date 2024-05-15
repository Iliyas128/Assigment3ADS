public class MyTestingClass {
    private String key;

    public MyTestingClass(String key) {
        this.key = key;
    }

    public int customHashCode() {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args) {
        MyTestingClass obj = new MyTestingClass("test");
        System.out.println("Custom HashCode: " + obj.customHashCode());
    }
}

