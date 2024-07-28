public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        level1.handleRequest("Level1");
        level1.handleRequest("Level2");
        level1.handleRequest("Level3");
        level1.handleRequest("Level4");
    }
}
