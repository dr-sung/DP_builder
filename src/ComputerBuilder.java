/*
participant: Builder
*/
public abstract class ComputerBuilder {
    
    protected ComputerProduct computer;
    
    public ComputerProduct getComputer() {
        return computer;
    }
    
    public void createComputerProduct() {
        computer = new ComputerProduct();
    }
    
    public abstract void buildCPU();
    public abstract void buildScreen();
    public abstract void buildMemory();
    public abstract void buildBattery();
    
}
