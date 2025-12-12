/* This is the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    /* Class attributes */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /*
     * constructor
     * param nCoffeOunces
     * param nSugarPackets
     * param nCreams
     * param nCups
     * param name
     * param address
     * param nFloors
     */
    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups, String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        Cafe cafe = new Cafe(100, 100, 100, 100, "Campus Cafe", "1 Chapin Way", 4);
    }

    /*
     * sells coffee
     * param size
     * param nSugarPackets
     * param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if((this.nCoffeeOunces -= size) <= 0){
            this.restock(100, 0, 0, 0);
        }
        if ((this.nSugarPackets -= nSugarPackets) <= 0) {
            this.restock(0, 100, 0, 0);
        }
        if ((this.nCreams -= nCreams) <= 0) {
            this.restock(0, 0, 100, 0);
        }
        if (this.nCups <= 1) {
            this.restock(0, 0, 0, 100);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    /*
     * restocks inventory
     * param nCoffeeOunces
     * param nSugarPackets
     * param nCreams
     * param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
}
