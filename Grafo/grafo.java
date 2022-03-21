package Grafo;
import java.io.IOException;
import Grafo.Verticefile;

public class grafo{
public static void main(String[] args) {
    Verticefile r = new Verticefile();
    r.openFile();
    r.readFile();
    r.closeFile();
   
}

}