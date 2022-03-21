package Grafo.Captura;
import java.io.File;
import java.util.Scanner;

import Grafo.Objects.vertice;

public class Verticefile {
    private Scanner x;


    public void openFile(){
        try{
            x = new Scanner(new File("/Users/Matheus/.vscode/Grafos/Grafo/text/vertices.txt"));
        }catch(Exception e){
            System.out.println("Not finding the file");
        }
    }

    public void readFile(vertice[] vet){
        int count=0;
        while(x.hasNext()){

            vet[count].identificador = Integer.parseInt(x.next());
            vet[count].nome = x.next();
            if(count==6){
                return;
            }
            count++;
        }
    }

    private int parseInt(String next) {
        return 0;
    }

    public void closeFile(){
        x.close();
    }
    
}

