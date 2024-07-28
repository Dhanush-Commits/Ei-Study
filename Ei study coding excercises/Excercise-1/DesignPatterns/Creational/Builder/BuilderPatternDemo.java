public class BuilderPatternDemo {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new GamingComputerBuilder());
        director.buildComputer();
        Computer gamingComputer = director.getComputer();
        System.out.println("Gaming Computer: " + gamingComputer.toString());

        director = new ComputerDirector(new OfficeComputerBuilder());
        director.buildComputer();
        Computer officeComputer = director.getComputer();
        System.out.println("Office Computer: " + officeComputer.toString());
    }
}