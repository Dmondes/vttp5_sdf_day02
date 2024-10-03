package object;
public class Computer{
    private String model;
    private String CPU;
    private Integer RAM;
    private Integer year;

    public Computer(String CPU, String model, Integer RAM, Integer year) {
        this.CPU = CPU;
        this.model = model;
        this.RAM = RAM;
        this.year = year;
    }

    public Computer(){
        this.CPU = "2Ghz dual core";
        this.model = "Acer note3";
        this.RAM = 64;
        this.year = 2022;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String cPU) {
        CPU = cPU;
    }
    public Integer getRAM() {
        return RAM;
    }
    public void setRAM(Integer rAM) {
        RAM = rAM;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public void startup() {
        System.out.println("Computer powered up...");
    }

    public void shutdown() {
        System.out.println("Shutting down Computer...");
    }

    public void displaySpec() {
        System.out.println("This computer specifications:");
        System.out.println(this.model);
        System.out.println(this.CPU);
        System.out.println(this.RAM);
        System.out.println(this.year);
    }


    
}