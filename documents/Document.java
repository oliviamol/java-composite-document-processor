package loose.oose.fis.documents;

import java.util.Arrays;

public abstract class Document {
    protected String [] text;

    public Document(String[] text) {
        this.text = text;
    }

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        return "Document{" +
                "text=" + Arrays.toString(text) +
                '}';
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }
}

