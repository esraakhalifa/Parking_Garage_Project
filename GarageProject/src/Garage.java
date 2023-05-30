import java.util.Calendar;
public class Garage {
	int id, capacity, counter=0; //counter used to assign ids to parking slots 
	String name, city, area, slotConfig;
	Slot[] slots;
	
	//constructor to initialize garage with all needed info
	public Garage(String name, String city, String area, String slotConfig, int capacity, int id ) {
		this.name= name;
		this.city= city;
		this.area = area;
		this.slotConfig= slotConfig;
		this.capacity= capacity;
		this.id= id;
		
		slots = new Slot[this.capacity];
	}
	
	//constructor to initialize garage with capacity only for testing
	public Garage( String city, String area,int capacity,String slotConfig) {
		this.capacity = capacity;
		slots = new Slot[capacity];
		this.city=city;
		this.area=area;
		this.slotConfig= slotConfig;
	}
	
	//function to add slots to the garage
	public void addSlots(int w, int d) {
		slots[counter++] = new Slot(w,d, counter); //counter passed to slot as id after incrementing
	}
	
	//Display all slots in the garage
	public void display() {
		for(int i=1; i<=capacity; i++)
		{
			System.out.println("Slot "+i+": ");
			slots[i-1].printSlotinfo();
		}
	}
	
	/* This function displays the IDs of active slots*/
	public void displayActiveSlots() {
		for(int i=1; i<=capacity; i++)
		{
			if(slots[i-1].getStatus())
			{
				System.out.println("Slot ID: "+ slots[i-1].slot_id);
			}
		}
		
	}


	public int searchSlot(Vehicle v1) {
		if (this.slotConfig == "first come first served") {
			for (int i = 0; i < this.capacity; i++) {
				if (this.slots[i].width >= v1.width && this.slots[i].depth >= v1.depth && this.slots[i].active == false) {
					this.slots[i].vehicle_in_slot = v1;
					;
					this.slots[i].reserveSlot();
					System.out.println("Garage ID: " + (this.id+1));
					System.out.println("Slot ID: " + this.slots[i].slot_id);
					System.out.println(this.slots[i].start_time.get(Calendar.HOUR_OF_DAY) + ":" + this.slots[i].start_time.get(Calendar.MINUTE));
					return this.slots[i].slot_id;
				}

			}
			System.out.println("There is no available slots");
			return -1;
		} 
		else
		{
			if (v1.width <= 45 && v1.depth <= 100) {
				for (int i = 0; i < this.capacity; i++) {
					if (this.slots[i].width >= 25 && this.slots[i].width <= 45 && this.slots[i].depth >= 75 && this.slots[i].depth <= 100 && this.slots[i].active == false) {
						this.slots[i].vehicle_in_slot = v1;
						this.slots[i].reserveSlot();
						System.out.println("Garage ID: " + (this.id+1));
						System.out.println("Slot ID: " + this.slots[i].slot_id);
						System.out.println(this.slots[i].start_time.get(Calendar.HOUR_OF_DAY) + ":" + this.slots[i].start_time.get(Calendar.MINUTE));
						return this.slots[i].slot_id;
					}

				}
				System.out.println("There is no available slots");
				return -1;
			} else if (v1.width <=768 && v1.depth <= 197)
			{
				for (int i = 0; i < this.capacity; i++) {
					if (this.slots[i].width >= 68 && this.slots[i].width <= 78 && this.slots[i].depth >= 156 && this.slots[i].depth <= 197 && this.slots[i].active == false) {
						this.slots[i].vehicle_in_slot = v1;
						this.slots[i].reserveSlot();
						System.out.println("Garage ID: " + (this.id+1));
						System.out.println("Slot ID: " + this.slots[i].slot_id);
						System.out.println(this.slots[i].start_time.get(Calendar.HOUR_OF_DAY) + ":" + this.slots[i].start_time.get(Calendar.MINUTE));
						return this.slots[i].slot_id;
					}

				}
				System.out.println("There is no available slots");
				return -1;
			}

		}
		System.out.println("There is no available slots");
		return -1;
	}
}

