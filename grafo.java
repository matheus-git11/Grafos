

import java.util.LinkedList;

import Grafo.Captura.Arestafile;
import Grafo.Captura.Verticefile;
import Grafo.Objects.aresta;
import Grafo.Objects.vertice;
import Grafo.Objects.Adj;

public class grafo{
public static void main(String[] args) {


    
    LinkedList<Adj> vert1 = new LinkedList<Adj>();
    LinkedList<Adj> vert2 = new LinkedList<Adj>();
    LinkedList<Adj> vert3 = new LinkedList<Adj>();
    LinkedList<Adj> vert4 = new LinkedList<Adj>();
    LinkedList<Adj> vert5 = new LinkedList<Adj>();
    LinkedList<Adj> vert6 = new LinkedList<Adj>();
    LinkedList<Adj> vert7 = new LinkedList<Adj>();
    


    vertice [] vet = new vertice[7];
    vertice v1 = new vertice();
    vertice v2 = new vertice();
    vertice v3 = new vertice();
    vertice v4 = new vertice();
    vertice v5 = new vertice();
    vertice v6 = new vertice();
    vertice v7 = new vertice();
     vet[0] = v1;
     vet[1] = v2;
     vet[2] = v3;
     vet[3] = v4;
     vet[4] = v5;
     vet[5] = v6;
     vet[6] = v7;
    
     aresta [] arest = new aresta[7];

    aresta a1 = new aresta();
    aresta a2 = new aresta();
    aresta a3 = new aresta();
    aresta a4 = new aresta();
    aresta a5 = new aresta();
    aresta a6= new aresta();
    aresta a7 = new aresta();

    arest[0] = a1;
    arest[1] = a2;
    arest[2] = a3;
    arest[3] = a4;
    arest[4] = a5;
    arest[5] = a6;
    arest[6] = a7;
    
    Verticefile r = new Verticefile();
    r.openFile();
    r.readFile(vet);
    r.closeFile();
   

    Arestafile are = new Arestafile();
    are.openFile();
    are.readFile(arest);
    are.closeFile();

 for(int i=0; i<=6;i++){
     System.out.println(vet[i].nome + vet[i].identificador);
 }

for(int i=0; i<=6;i++){
    System.out.println(arest[i].id +" "+ arest[i].origem +" "+ arest[i].destino +" "+ arest[i].peso );
}


for(int i=0;i<=6;i++){
    
     for(int count=0; count<=6 ; count++){
         if(arest[count].origem == vet[i].identificador){
            int resp=i;
        switch(resp){
                case 0:
                 Adj ligacao = new Adj();
                 ligacao.ligacao = arest[count].destino;
                 ligacao.valor = arest[count].peso;
                 vert1.add(ligacao);
              
                break;

                case 1:
                Adj ligacao1 = new Adj();
                 ligacao1.ligacao = arest[count].destino;
                 ligacao1.valor = arest[count].peso;
                 vert2.add(ligacao1);

                break;
 
                case 2:
                 Adj ligacao2 = new Adj();
                 ligacao2.ligacao = arest[count].destino;
                 ligacao2.valor = arest[count].peso;
                 vert3.add(ligacao2);
                break;

                case 3:
                Adj ligacao3 = new Adj();
                 ligacao3.ligacao = arest[count].destino;
                 ligacao3.valor = arest[count].peso;
                 vert4.add(ligacao3);
                break;

                case 4:
                Adj ligacao4= new Adj();
                 ligacao4.ligacao = arest[count].destino;
                 ligacao4.valor = arest[count].peso;
                 vert5.add(ligacao4);
                break;

                case 5:
                Adj ligacao5 = new Adj();
                 ligacao5.ligacao = arest[count].destino;
                 ligacao5.valor = arest[count].peso;
                 vert6.add(ligacao5);
                break;

                case 6:
                Adj ligacao6 = new Adj();
                 ligacao6.ligacao = arest[count].destino;
                 ligacao6.valor = arest[count].peso;
                 vert7.add(ligacao6);
                break;
        }
        }
     }   
}

for(int cont=0; cont<=6 ; cont++){
   int y = 0;

   switch(cont){
           

           case 0:
              y = 0;
            System.out.print("o Vertice V1 faz ");
            while(y<vert1.size()){
             System.out.print("Ligação com "+ vert1.get(y).ligacao+ " com ligação no valor de " +vert1.get(y).valor + " ,");
             y++;
            }
            System.out.println("e Ligação Null");

         
           break;
           case 1:
            y = 0;
           System.out.print("o Vertice V2 faz ");
           while(y<vert2.size()){
            System.out.print("Ligação com "+ vert2.get(y).ligacao+ " com ligação no valor de " +vert2.get(y).valor + " ,");
            y++;
           }
           System.out.println("e Ligação Null");

           break;

           case 2:
           y = 0;
           System.out.print("o Vertice V3 faz ");
           while(y<vert3.size()){
            System.out.print("Ligação com "+ vert3.get(y).ligacao+ " com ligação no valor de " +vert3.get(y).valor + " ,");
            y++;
           }
           System.out.println("e Ligação Null");
           break;

           case 3:
           y = 0;
           System.out.print("o Vertice V4 faz ");
           while(y<vert4.size()){
            System.out.print("Ligação com "+ vert4.get(y).ligacao+ " com ligação no valor de " +vert4.get(y).valor + " ,");
            y++;
           }
           System.out.println("e Ligação Null");
           break;

           case 4:
           y = 0;
           System.out.print("o Vertice V5 faz ");
           while(y<vert5.size()){
            System.out.print("Ligação com "+ vert5.get(y).ligacao+ " com ligação no valor de " +vert5.get(y).valor + " ,");
            y++;
           }
           System.out.println("e Ligação Null");
           break;

           case 5:
           y = 0;
           System.out.print("o Vertice V6 faz ");
           while(y<vert6.size()){
            System.out.print("Ligação com "+ vert6.get(y).ligacao+ " com ligação no valor de " +vert6.get(y).valor + " ,");
            y++;
           }
           System.out.println("e Ligação Null");
           break;

           case 6:
           y = 0;
           System.out.print("o Vertice V7 faz ");
           while(y<vert7.size()){
            System.out.print("Ligação com "+ vert7.get(y).ligacao+ " com ligação no valor de " +vert7.get(y).valor + " ,");
            y++;
           }
           System.out.println("e Ligação Null");
           break;

           default:
           break;
   }
}
}

}
