package Grafo;


public class grafo{
public static void main(String[] args) {
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


}
}