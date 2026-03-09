package loose.oose.fis.documents;

import java.util.Arrays;

public class XML extends Document{

    private String[] tag;

    public XML(String[] tag) {
        super(tag);
        this.tag=tag;

    }

    @Override
    public String[] analizeaza() {
        String []rezultat=new String[tag.length];
        int cnt=0;
        for(int i=0;i<tag.length;i++) {
            if (tag[i]!=null && !tag[i].startsWith("<"))
                rezultat[cnt++]=tag[i];


        }
        return rezultat;
    }

    @Override
    public String toString() {
        return "XML: "+Arrays.toString(tag)+"\n";
    }
}
