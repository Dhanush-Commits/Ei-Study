public class WordDocument implements Cloneable {
    private String content;

    public WordDocument() {
        this.content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public WordDocument clone() {
        try {
            return (WordDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "WordDocument [content=" + content + "]";
    }
}