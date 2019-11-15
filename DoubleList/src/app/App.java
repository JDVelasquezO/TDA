package app;

public class App {
    public static void main(String[] args) throws Exception {
        DoubleList doubleList = new DoubleList();
        doubleList.addFinish("Value");
        doubleList.addFinish("Value2");
        doubleList.addFinish("Value3");
        doubleList.addFinish("Value4");
        
        doubleList.delete(1);

        // for (int i = 0; i < doubleList.getLength(); i++) {
        //     System.out.println(
        //         doubleList.getValue(i)
        //     );
        // }
    }
}
