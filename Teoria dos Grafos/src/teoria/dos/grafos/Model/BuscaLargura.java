/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class BuscaLargura {
    
    private Grafo grafo;
    private ArrayList<Vertice> listaVertices;
    private ArrayList<Vertice> verticesVisitados;
    private ArrayList<Aresta> arestasEmLargura;
    
    public BuscaLargura(){
        grafo = new Grafo();
        listaVertices = new ArrayList<>();
        verticesVisitados = new ArrayList<>();
        arestasEmLargura = new ArrayList<>();
    }
    
    public String getLarguras(Grafo grafo, Vertice origem) {
        this.grafo = grafo;
        listaVertices.add(origem);
        for(int i = listaVertices.size(); i>=0; i--){
            //Func para pegar arestas em largura
            listaVertices.remove(i);
        }
        Grafo grafobfs = new Grafo(this.grafo.getNome(), this.grafo.getVertices(), this.arestasEmLargura);
        String bfs = GrafoToDot.exportaGrafoDot(grafo);
        return bfs;
    }
    
}
