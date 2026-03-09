package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

public class ProcesorCompus implements Procesor{
    Procesor[] procesoare;

    public ProcesorCompus(Procesor[] procesoare) {
        this.procesoare = procesoare;
    }

    @Override
    public int proceseaza(Document[] documents) {
        int cnt=0;
        for(int i=0;i<procesoare.length;i++)
            if(procesoare[i]!=null)
            cnt=cnt+procesoare[i].proceseaza(documents);
        return cnt;
    }
}
