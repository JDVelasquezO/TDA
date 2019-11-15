package app;

public class App {
    public static void main(String[] args) throws Exception {
        DoubleCircularList doubleCircularList = new DoubleCircularList();
        doubleCircularList.add("Perro");
        doubleCircularList.add("Gato");
        doubleCircularList.add("Loro");
        doubleCircularList.add("Pato");

        doubleCircularList.delete(0);

        for (int i = 0; i < doubleCircularList.getLength(); i++) {
            System.out.println(doubleCircularList.getValue(i));
        }
    }
}
