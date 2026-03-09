package loose.oose.fis.documents;

import java.util.Arrays;

public class Json extends Document{

private String [] text;

    public Json(String[] text) {
        super(text);
        this.text=text;

    }

    @Override
    public String[] analizeaza() {
        String [] rezultat=new String[text.length];
        int cnt=0;
        for(int i=0;i<text.length;i++) {
            if (text[i]!=null && !text[i].endsWith(":"))
                rezultat[cnt++] = text[i];


        }

            return rezultat;
    }

    @Override
    public String toString() {
        return "Json: "+Arrays.toString(text)+"\n";
    }
}
