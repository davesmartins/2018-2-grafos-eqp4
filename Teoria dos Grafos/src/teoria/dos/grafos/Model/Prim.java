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
    private ArrayList<String> nomeVerticesAdicionadas;

    public Prim() {
        this.arestas = new ArrayList();
        this.arestasAdicionadas = new ArrayList();
        this.vertices = new ArrayList();
        this.verticesAdicionadas = new ArrayList();
        this.nomeVerticesAdicionadas = new ArrayList();
    }

    public Grafo getPrim(Grafo grafo) {

        vertices = grafo.getVertices();

        for (int i = 0; i < vertices.size(); i++) {
            vertices.get(i).getLigacoes().clear();
        }

        arestas = grafo.getArestas();

        verticesAdicionadas.add(vertices.get(0));
        nomeVerticesAdicionadas.add(vertices.get(0).getNome());

        while (verticesAdicionadas.size() != vertices.size()) {
            for (int i = 0; i < arestas.size(); i++) {
                if (nomeVerticesAdicionadas.contains(arestas.get(i).getOrigem().getNome())
                        && !nomeVerticesAdicionadas.contains(arestas.get(i).getDestino().getNome())) {
                    arestasAdicionadas.add(arestas.get(i));
                    verticesAdicionadas.add(arestas.get(i).getDestino());
                    nomeVerticesAdicionadas.add(arestas.get(i).getDestino().getNome());
                    vertices.get(getIndiceVertice(arestas.get(i).getOrigem().getNome())).adicionaLigacoes(arestas.get(i));
                    arestas.remove(i);
                    break;

                }
                if (nomeVerticesAdicionadas.contains(arestas.get(i).getDestino().getNome())
                        && !nomeVerticesAdicionadas.contains(arestas.get(i).getOrigem().getNome())) {
                    arestasAdicionadas.add(arestas.get(i));
                    verticesAdicionadas.add(arestas.get(i).getOrigem());
                    nomeVerticesAdicionadas.add(arestas.get(i).getOrigem().getNome());
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
            if (vertices.get(i).getNome().contains(nome)) {
                return i;
            }
        }
        return 0;
    }
}
