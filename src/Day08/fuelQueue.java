package Day08;


public class fuelQueue implements Comparable<fuelQueue>{

    int ticketId;
    int priority;

    fuelQueue (int ticketId, int priority) {

        this.ticketId = ticketId;
        this.priority = priority;
    }

    @Override
    public int compareTo(fuelQueue a) {
        return Integer.compare(a.priority , this.priority);
    }

    @Override
    public String toString() {
        return this.ticketId + " Priority " + this.priority;
    }
}


