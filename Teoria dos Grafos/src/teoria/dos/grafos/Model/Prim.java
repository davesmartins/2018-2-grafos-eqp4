/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gabriel
 */
public class Prim {

    private ArrayList<Aresta> arestas;
    private ArrayList<Aresta> arestasAdicionadas;
    private ArrayList<Vertice> vertices;
    private ArrayList<Vertice> verticesAdicionadas;

    public Prim() {
        this.arestas = new ArrayList();
        this.arestasAdicionadas = new ArrayList();
        this.vertices = new ArrayList();
        this.verticesAdicionadas = new ArrayList();
    }

    public Grafo getPrim(Grafo grafo) {

        vertices = grafo.getVertices();

        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).getLigacoes().clear();
        }

        arestas = grafo.getArestas();

        verticesAdicionadas.add(vertices.get(0));

        while (verticesAdicionadas.size() != vertices.size()) {
            for (int i = 0; i < arestas.size(); i++) {
                if (verticesAdicionadas.contains(arestas.get(i).getOrigem())
                        && !verticesAdicionadas.contains(arestas.get(i).getDestino())) {
                    arestasAdicionadas.add(arestas.get(i));
                    verticesAdicionadas.add(arestas.get(i).getDestino());
                    vertices.get(getIndiceVertice(arestas.get(i).getOrigem().getNome())).adicionaLigacoes(arestas.get(i));
                    arestas.remove(i);
                    break;

                } else if (verticesAdicionadas.contains(arestas.get(i).getDestino())
                        && !verticesAdicionadas.contains(arestas.get(i).getOrigem())) {
                    arestasAdicionadas.add(arestas.get(i));
                    verticesAdicionadas.add(arestas.get(i).getOrigem());
                    vertices.get(getIndiceVertice(arestas.get(i).getDestino().getNome())).adicionaLigacoes(arestas.get(i));
                    arestas.remove(i);
                    break;
                }
            }
        }

        Grafo novoGrafo = new Grafo("Grafinho", vertices, arestasAdicionadas);

        return novoGrafo;
    }

    public int getIndiceVertice(String nome) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getNome() == nome) {
                return i;
            }
        }
        return 0;
    }
}