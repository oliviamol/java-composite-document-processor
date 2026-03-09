package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

public class ProcesorCautare implements Procesor {
    private String cautat;

    public ProcesorCautare(String cautat) {
        this.cautat = cautat;
    }

    @Override
    public int proceseaza(Document[] documents) {
        int cnt=0;
        for(int i=0;i< documents.length;i++) {
            String[] lista = documents[i].analizeaza();
            for (int j = 0; j < lista.length; j++)
                if(lista[j]!=null && lista[j].equals(this.cautat))
                    cnt++;
        }
        return cnt;

    }
}
