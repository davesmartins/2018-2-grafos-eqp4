/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos;

import teoria.dos.grafos.Model.Aresta;
import teoria.dos.grafos.Model.Grafo;
import teoria.dos.grafos.Model.Vertice;

/**
 *
 * @author betto
 */
public class TeoriaDosGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vertice a = new Vertice("a");
        Vertice b = new Vertice("b");
        Vertice c = new Vertice("c");
        Vertice d = new Vertice("d");
        Aresta aresta = new Aresta(a, b);
        Grafo grafo = new Grafo();
        grafo.adicionaVertice(a);
        grafo.adicionaVertice(b);
        grafo.adicionaVertice(c);
        grafo.adicionaVertice(d);
        grafo.adicionaAresta(aresta);
        grafo.adicionaAresta(c, d);
        grafo.adicionaAresta(b, d);

        System.out.println("vertice1:" + a.getNome() + " vertice 2:" + b.getNome() + " aresta de " + aresta.getNomeOrigem() + " ate " + aresta.getNomeDestino());
        
        int[][] matriz = grafo.getMatrizAdjacencia();
        
        for (int i = 0; i < grafo.getVertices().size(); i++) {
            for (int j = 0; j < grafo.getArestas().size(); j++) {
                System.out.println("" + matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

}
