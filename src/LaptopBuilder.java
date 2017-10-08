/*
participant: ConcreteBuilder
*/
public class LaptopBuilder extends ComputerBuilder {

    @Override
    public void buildCPU() {
        computer.setCpu("Mobile Intel");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("15 inch Mobile Screen");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8GB DDR");
    }

    @Override
    public void buildBattery() {
        computer.setBattery("1.5A Lithim Battery");
    }
    
}
