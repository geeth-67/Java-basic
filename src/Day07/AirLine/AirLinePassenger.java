package Day07.AirLine;

public class AirLinePassenger implements Comparable<AirLinePassenger>{

    String name;
    int  loyaltyPoints;

    AirLinePassenger(String name , int loyaltyPoints) {
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public int compareTo(AirLinePassenger a) {
        return Integer.compare(a.loyaltyPoints , this.loyaltyPoints);
    }

    @Override
    public String toString() {
        return this.name + " Loyalty points " + this.loyaltyPoints;
    }
}
