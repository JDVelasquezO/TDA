package app;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        
        Bill bill = new Bill("020506", "Daniel Velasquez");
        Bill bill2 = new Bill("020507", "Jose Orozco");
        Bill bill3 = new Bill("020508", "Gaby Ortiz");
        
        stack.push(bill);
        stack.push(bill2);
        stack.push(bill3);
        stack.pop();
        for (int i = 0; i < stack.getLength(); i++) {
            System.out.println(
                stack.getValue(i)
            );
        }
    }
}
