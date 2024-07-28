public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void buildComputer() {
        builder.buildCpu();
        builder.buildGpu();
        builder.buildRam();
    }

    public Computer getComputer() {
        return builder.getComputer();
    }
}