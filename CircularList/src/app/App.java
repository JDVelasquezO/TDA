package app;

public class App {
    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        Product product = new Product(0, "Angular", 45);
        Product product2 = new Product(1, "React", 100);
        Product product3 = new Product(2, "Vue", 150);
        
        circularList.add(product);
        circularList.add(product2);
        circularList.add(product3);

        // circularList.deleteForCounter(1);

        // circularList.searchName("Angular;React");
        
        int length = circularList.getLength();
        for (int i = 0; i < length; i++) {
            System.out.println(circularList.getValue(i));
        }
    }
}
