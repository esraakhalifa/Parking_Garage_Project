public class Vehicle {
     int v_id;
     String driver_name;
     String driver_password;
     String model_name;
     String driver_city;
     String driver_area;
     int model_year;
    int depth;
    int width;
    public Vehicle(String driver_city,String driver_area,int id,int depth,int width)
    {
        v_id =id;
        this.width=width;
        this.depth=depth;
        this.driver_area = driver_area;
        this.driver_city=driver_city;
    }
    public void setV_id(int v_id)
    {
        this.v_id = v_id;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getV_id() {
        return v_id;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
