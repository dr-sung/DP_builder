/*
participant: Director
*/
public class BuildDirector {
    
    private ComputerBuilder computerBuilder;
    
    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    
    public ComputerProduct getComputerProduct() {
        return computerBuilder.getComputer();
    }
    
    public void constructComputer() {
        computerBuilder.createComputerProduct();
        computerBuilder.buildCPU();
        computerBuilder.buildScreen();
        computerBuilder.buildMemory();
        computerBuilder.buildBattery();
    }
    
}
