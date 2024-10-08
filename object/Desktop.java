package object;

public class Desktop extends Computer{
    private String operatingSystem;
    private Integer weight;
    private Boolean wateringCoolings;

    
    public Desktop(String CPU, String model, Integer RAM, Integer year) {
        super(CPU, model, RAM, year);
    }
    public Desktop() {
    }
    public Desktop(String CPU, String model, Integer RAM, Integer year, String operatingSystem, Integer weight,
            Boolean wateringCoolings) {
        super(CPU, model, RAM, year);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.wateringCoolings = wateringCoolings;
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
    public Boolean getWateringCoolings() {
        return wateringCoolings;
    }
    public void setWateringCoolings(Boolean wateringCoolings) {
        this.wateringCoolings = wateringCoolings;
    }

    @Override
    public void displaySpec() {
        System.out.println("This desktop specifications:");
        System.out.println(this.getModel());
        System.out.println(this.getCPU());
        System.out.println(this.getRAM());
        System.out.println(this.getYear());
        System.out.println(this.getOperatingSystem());
        System.out.println(this.getWeight());
        System.out.println("Water cooling System:" + this.getWateringCoolings());
    }
    
    
}
