
/*
    Builder Design Pattern
*/
public class Main {
    
    public static void main(String[] args) {
        
        BuildDirector director = new BuildDirector();
        ComputerBuilder laptopBuilder = new LaptopBuilder();
        ComputerBuilder desktopBuilder = new DesktopBuilder();
        
        director.setComputerBuilder(laptopBuilder);
        director.constructComputer();
        
        ComputerProduct laptop1 = director.getComputerProduct();
        System.out.println("Laptop=" + laptop1);
        
        director.setComputerBuilder(desktopBuilder);
        director.constructComputer();
        
        ComputerProduct desktop1 = director.getComputerProduct();
        System.out.println("Desktop=" + desktop1);
    }
    
}
