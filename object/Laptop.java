package object;

public class Laptop extends Computer{
    private String operatingSystem;
    private Integer weight;
    private String battery;
    private String screenSize;

    public Laptop(String CPU, String model, Integer RAM, Integer year) {
        super(CPU, model, RAM, year);
    }
    public Laptop() {
    }
    public Laptop(String CPU, String model, Integer RAM, Integer year, String operatingSystem, Integer weight,
            String battery, String screenSize) {
        super(CPU, model, RAM, year);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    @Override
    public void startup(){
        System.out.println("Laptop powered up ...");
    }
    @Override
    public void shutdown(){
        System.out.println("Shutting down Laptop ..");
    }
    @Override
    public void displaySpec() {
        System.out.println("This computer specifications:");
        System.out.println(this.operatingSystem);
        System.out.println(this.weight);
        System.out.println(this.battery);
        System.out.println(this.screenSize);
        System.out.println(this.getModel());
        System.out.println(this.getCPU());
        System.out.println(this.getRAM());
        System.out.println(this.getYear());
    }

}
