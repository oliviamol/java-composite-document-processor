import loose.oose.fis.documents.Document;
import loose.oose.fis.documents.Json;
import loose.oose.fis.documents.XML;
import loose.oose.fis.processors.Procesor;
import loose.oose.fis.processors.ProcesorCautare;
import loose.oose.fis.processors.ProcesorCompus;


public class Main {
    public static void main(String[] args) {
        String [] rez={"<tag1>", "8", "</tag1>", "<tag2>", "7", "</tag2>"};
        String [] rez2={"key1:", "6", ",", "key2:", "8", ",", "key3:", "3"};
        Document xml=new XML(rez);
        Document json=new Json(rez2);

        Procesor sp1 = new ProcesorCautare("2");
        Procesor sp2 = new ProcesorCautare("3");
        Procesor sp3 = new  ProcesorCautare("8");

        Procesor cp1 = new ProcesorCompus(new Procesor[]{sp1, sp2});
        Procesor cp2 = new ProcesorCompus(new Procesor[]{sp3,cp1});
        Document[] documente = {xml, json};
        int result = cp2.proceseaza(documente);

        System.out.println(result);




        }
    }
