public class HomeAutomationFacade {
    private Light light;
    private Fan fan;
    private Television television;

    public HomeAutomationFacade() {
        this.light = new Light();
        this.fan = new Fan();
        this.television = new Television();
    }

    public void turnOnAll() {
        light.turnOn();
        fan.turnOn();
        television.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        fan.turnOff();
        television.turnOff();
    }
}