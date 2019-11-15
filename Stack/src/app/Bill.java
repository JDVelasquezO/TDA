package app;

/**
 * Bill
 */
public class Bill {

    private String number, clientName;

    public Bill (String number, String clientName) {
        setNumber(number); setClientName(clientName);
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "La factura es con numero " + number + " y cliente " + clientName;
    }
}