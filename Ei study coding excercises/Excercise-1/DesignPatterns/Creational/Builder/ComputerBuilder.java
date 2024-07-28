public interface ComputerBuilder {
    void buildCpu();
    void buildGpu();
    void buildRam();
    Computer getComputer();
}