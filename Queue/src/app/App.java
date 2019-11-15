package app;

public class App {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        CircularList circularList = new CircularList();
        CircularList circularList2 = new CircularList();

        circularList.add("Angular");
        circularList.add("Vue");
        circularList.add("React");
        
        circularList2.add("Polymer");
        circularList2.add("Laravel");
        circularList2.add("Bootstrap");

        Offer offer = new Offer("Descripcion 1", "5%", "baja");
        offer.setProducts(circularList);
        Offer offer2 = new Offer("Descripcion 2", "10%", "alta");
        offer2.setProducts(circularList2);
        Offer offer3 = new Offer("Descripcion 3", "15%", "alta");

        priorityQueue.queuing(offer);
        priorityQueue.queuing(offer2);
        priorityQueue.queuing(offer3);
        priorityQueue.order();

        // priorityQueue.deleteStart();

        for (int i = 0; i < priorityQueue.getLength(); i++) {
            System.out.println(priorityQueue.getValue(i));
        }
    }
}
