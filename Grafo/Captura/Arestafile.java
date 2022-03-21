package Grafo.Captura;

import java.io.File;
import java.util.Scanner;

import Grafo.Objects.aresta;

public class Arestafile {
    private Scanner y;


    public void openFile(){
        try{
            y = new Scanner(new File("/Users/Matheus/.vscode/Grafos/Grafo/text/arestas.txt"));
        }catch(Exception e){
            System.out.println("Not finding the file");
        }
    }

    public void readFile(aresta[] arest ){
        int i=0;
        while(y.hasNext()){
            
            arest[i].id = Integer.parseInt(y.next());
            arest[i].origem =Integer.parseInt(y.next());
            arest[i].destino=Integer.parseInt(y.next());
            arest[i].peso=Integer.parseInt(y.next());
            if(i==6){
                return;
            }
            i++;
        }
    }

    private int parseInt(String next) {
        return 0;
    }

    public void closeFile(){
        y.close();
    }
}
