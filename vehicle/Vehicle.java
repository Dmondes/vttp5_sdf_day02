package vehicle;

public class Vehicle  implements Ivehicle{
    private String model;
    private  String make;
    private Integer year;
    private Integer speed;

    public Vehicle() {
    }

    public Vehicle(String model, String make, Integer year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    
    public void start(){
        System.out.println("Vehicle started...");
    }
    public void stop(){
        this.speed = 0;
        System.out.println("vehicle stopped...");
    }
    public void accelerate(Integer increment){
        this.speed = this.speed + increment;
    }
    public void brake(Integer decrement){
        this.speed = this.speed - decrement;
    }
    public void honk(){
        System.out.println("Vehicle honked...");
    }

    

    
}
