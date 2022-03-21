package Grafo;

import java.io.File;
import java.util.Scanner;

public class Verticefile {
    private Scanner x;


    public void openFile(){
        try{
            x = new Scanner(new File("/Users/Matheus/.vscode/Grafos/Grafo/vertices.txt"));
        }catch(Exception e){
            System.out.println("Not finding the file");
        }
    }

    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
        
            System.out.println("O id é "+a+" e seu nome é "+b);
        }
    }

    public void closeFile(){
        x.close();
    }
    
}

