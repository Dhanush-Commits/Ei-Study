public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer("", "", "");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i9");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA GeForce RTX 3080");
    }

    @Override
    public void buildRam() {
        computer.setRam("64GB DDR4");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}