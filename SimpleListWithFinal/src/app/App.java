package app;

public class App {
    public static void main(String[] args) throws Exception {
        List list = new List();
        list.insertStart("Perro");
        list.insertFinish("Gato");
        list.insertFinish("Pato");
        list.removeStart();
        list.removeEnd();

        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.getValue(i));
        }
    }
}
