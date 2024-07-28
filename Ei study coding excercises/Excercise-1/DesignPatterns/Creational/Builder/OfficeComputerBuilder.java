public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        computer = new Computer("", "", "");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i5");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("Intel UHD Graphics 630");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}