public class Drone {
    private String id;
    private int x;
    private int y;
    private int battery;
    private String direction;


    public Drone(String id, int x, int y, int battery, String direction) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.battery = battery;
        this.direction = direction;
    }

    public String getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getBattery() {
        return battery;
    }

    public String getDirection() {
        return direction;
    }
}
