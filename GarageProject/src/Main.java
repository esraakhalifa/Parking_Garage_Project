import java.util.Calendar;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        /*Create a garage object and add some slots to it to test
         * this will be later done in a main class using a for loop
         * with details as input from the user*/
        Garage g = new Garage("Giza","Imbab",7,"first come first served");
        g.addSlots(40, 70);
        g.addSlots(40, 70);//active
        g.addSlots(4, 7);
        g.addSlots(4, 7);//active
        g.addSlots(4, 7);
        g.addSlots(4, 7);
        g.addSlots(4, 7);//active
        //g.display();

        /*Set some slots to active to test display function*/
        g.slots[1].setStatus(true);
        g.slots[3].setStatus(true);
        g.slots[6].setStatus(true);
       // g.displayActiveSlots();
        Vehicle v1 = new Vehicle("Giza","Imbaba",500, 55, 35);
        g.searchSlot(v1);
    }

}
