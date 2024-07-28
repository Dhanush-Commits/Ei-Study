public class Computer {
    private String cpu;
    private String gpu;
    private String ram;

    public Computer(String cpu, String gpu, String ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String toString() {
        return "Computer [CPU=" + cpu + ", GPU=" + gpu + ", RAM=" + ram + "]";
    }
}