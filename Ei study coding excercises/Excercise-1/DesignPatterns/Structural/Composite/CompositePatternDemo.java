public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.jpg");
        File file3 = new File("file3.docx");

        Directory directory1 = new Directory("Documents");
        directory1.add(file1);
        directory1.add(file3);

        Directory directory2 = new Directory("Pictures");
        directory2.add(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.add(directory1);
        rootDirectory.add(directory2);

        rootDirectory.print();
    }
}