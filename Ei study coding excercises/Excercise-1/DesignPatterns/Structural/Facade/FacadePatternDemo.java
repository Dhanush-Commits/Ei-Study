public class FacadePatternDemo {
    public static void main(String[] args) {
        HomeAutomationFacade homeFacade = new HomeAutomationFacade();
        homeFacade.turnOnAll();
        homeFacade.turnOffAll();
    }
}