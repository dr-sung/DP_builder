/*
participant: ConcreteBuilder
*/
public class DesktopBuilder extends ComputerBuilder {
    @Override
    public void buildCPU() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("21 inch LED Screen");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("12GB DDR");
    }

    @Override
    public void buildBattery() {
        computer.setBattery("no battery");
    }
}
