/*
participant: Product
*/
public class ComputerProduct {
    
    private String cpu;
    private String screen;
    private String memory;
    private String battery;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
    
    @Override
    public String toString() {
        return "["+cpu+", "+screen+", "+memory+", "+battery+"]";
    }
    
}
