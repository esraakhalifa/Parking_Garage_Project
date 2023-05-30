import java.util.Calendar;
public class Slot {
	int slot_id;
	int width, depth;
	boolean active;
	Vehicle vehicle_in_slot=new Vehicle("","",0,0,0);
	Calendar start_time;
	
	//Constructor to initialize a slot with needed info
	public Slot(){}
	public Slot(int w, int d, int id) {
		width = w;
		depth = d;
		this.slot_id =id;
		active= false;
	}

	public void reserveSlot()
	{
		this.setStatus(true);
		start_time = Calendar.getInstance();

	}
	public void setStatus(boolean state) {
		active = state;
	}
	
	public boolean getStatus() {
		return active;
	}
	
	public void printSlotinfo() {
		System.out.println("Slots width and depth are: "+width+" "+depth+"\nvehicle id: "+vehicle_in_slot.v_id);
	}

	public int getDepth() {
		return depth;
	}

	public int getWidth() {
		return width;
	}

}
