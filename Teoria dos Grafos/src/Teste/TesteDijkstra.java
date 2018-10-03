/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import teoria.dos.grafos.Model.Aresta;
import teoria.dos.grafos.Model.Dijkstra;
import teoria.dos.grafos.Model.Grafo;
import teoria.dos.grafos.Model.Vertice;

/**
 *
 * @author sothz
 */
public class TesteDijkstra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo garfo = new Grafo();

        Vertice no1 = new Vertice("um");
        Vertice no2 = new Vertice("dois");
        Vertice no3 = new Vertice("três");
        Vertice no4 = new Vertice("quatro");
        Vertice no5 = new Vertice("cinco");
        Vertice no6 = new Vertice("seis");
        Vertice no7 = new Vertice("sete");
        Aresta a1 = new Aresta(true, no1, no2, "one", 5);
        Aresta a2 = new Aresta(true, no2, no3, "two", 6);
        Aresta a3 = new Aresta(true, no3, no4, "three", 3);
        Aresta a4 = new Aresta(true, no4, no5, "four", 4);
        Aresta a5 = new Aresta(true, no5, no6, "five", 5);
        Aresta a6 = new Aresta(true, no6, no1, "six", 5);
        Aresta a7 = new Aresta(true, no1, no7, "seven", 5);
        Aresta a8 = new Aresta(true, no7, no4, "eight", 4);

        garfo.adicionaVertice(no1);
        garfo.adicionaVertice(no2);
        garfo.adicionaVertice(no3);
        garfo.adicionaVertice(no4);
        garfo.adicionaVertice(no5);
        garfo.adicionaVertice(no6);
        garfo.adicionaVertice(no7);
        
        garfo.adicionaAresta(a1);
        garfo.adicionaAresta(a2);
        garfo.adicionaAresta(a3);
        garfo.adicionaAresta(a4);
        garfo.adicionaAresta(a5);
        garfo.adicionaAresta(a6);
        garfo.adicionaAresta(a7);
        garfo.adicionaAresta(a8);
        
        Dijkstra digao = new Dijkstra(garfo);

        digao.execute(no1);
        System.out.println(digao.menorDistancia(no4));
    }

}
