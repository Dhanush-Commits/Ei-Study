public class PrototypePatternDemo {
    public static void main(String[] args) {
        WordDocument originalDoc = new WordDocument();
        originalDoc.setContent("This is the original document.");

        WordDocument clonedDoc = (WordDocument) originalDoc.clone();
        clonedDoc.setContent("This is the cloned document.");

        System.out.println("Original Document: " + originalDoc.toString());
        System.out.println("Cloned Document: " + clonedDoc.toString());
    }
}