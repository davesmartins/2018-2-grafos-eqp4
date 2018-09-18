/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

import java.util.ArrayList;

/**
 *
 * @author betto
 */
public class Grafo {

    ArrayList<Vertice> vertices;
    ArrayList<Aresta> arestas;
    private boolean conexo;

    public boolean isConexo() {
        return conexo;
    }

    public void setConexo() {
        verificaGrafoConexo();
    }
    
    

    public Grafo() {
        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    public Vertice adicionaVertice(String nome) {
        Vertice vertice = new Vertice(nome);
        vertices.add(vertice);
        return vertice;
    }

    public void adicionaVertice(Vertice vertice) {
        vertices.add(vertice);
    }

    public void removeVertice(Vertice vertice) {
        if (vertices.contains(vertice)) {
            for (int i = 0; i < this.vertices.size(); i++) {
                if (vertice.getNome().equals(this.arestas.get(i).getNomeOrigem()) || vertice.getNome().equals(this.arestas.get(i).getNomeDestino())) {
                    removeAresta(arestas.get(i));
                }
            }
            this.vertices.remove(vertice);
        }
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public Aresta adicionaAresta(Vertice origem, Vertice destino) {
        Aresta aresta = new Aresta(origem, destino);
        origem.adicionaLigacoes(aresta);
        arestas.add(aresta);
        return aresta;
    }

    public void adicionaAresta(Aresta aresta) {
        arestas.add(aresta);
    }

    public void removeAresta(Aresta aresta) {
        if (this.arestas.contains(aresta)) {
            this.arestas.remove(aresta);
            for (int i = 0; i > this.vertices.size(); i++) {
                if (this.vertices.get(i).getLigacoes().contains(aresta)) {
                    this.vertices.get(i).getLigacoes().remove(aresta);
                }
            }
        }
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }

    public ArrayList<Vertice> getVertices() {
        return (ArrayList<Vertice>) vertices.clone();
    }

    public ArrayList<Aresta> getArestas() {
        return (ArrayList<Aresta>) arestas.clone();
    }

    public boolean isAdjacente(Vertice vertice1, Vertice vertice2) {
        int i;
        for (i = 0; i < this.arestas.size(); i++) {
            if (this.arestas.get(i).isDirecionado()) {
                if (this.arestas.get(i).getNomeOrigem().equals(vertice1.getNome()) && this.arestas.get(i).getNomeDestino().equals(vertice2.getNome())) {
                    return true;
                }
            } else {
                if (this.arestas.get(i).getNomeOrigem().equals(vertice1.getNome()) && this.arestas.get(i).getNomeDestino().equals(vertice2.getNome())
                        || this.arestas.get(i).getNomeOrigem().equals(vertice2.getNome()) && this.arestas.get(i).getNomeDestino().equals(vertice1.getNome())) {
                    return true;
                }
            }

        }
        return false;
    }

    public int[][] getMatrizAdjacencia() {

        int n = this.getVertices().size();
        int m = this.getArestas().size();
        int[][] matrizAdjacencia = new int[n][n];
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                boolean teste = this.isAdjacente(this.getVertices().get(i), this.getVertices().get(j));
                if (teste) {
                    for (k = 0; k < m; k++) {
                        for (k = 0; k < m; k++) {
                            if (this.getArestas().get(k).isDirecionado()) {
                                if (this.arestas.get(k).getNomeOrigem().equals(this.getVertices().get(i).getNome())
                                        && this.arestas.get(k).getNomeDestino().equals(this.getVertices().get(j).getNome())) {
                                    matrizAdjacencia[i][j] = 1;

                                }
                            } else {
                                matrizAdjacencia[i][j] = 1;

                            }
                        }

                    }

                }
            }

        }
        return matrizAdjacencia;
    }

    private int getOrdem() {
        return this.vertices.size();
    }

    private int getGrau(Vertice vertice) {

        int cont = 0;
        int i;

        for (i = 0; i < this.arestas.size(); i++) {
            if (this.arestas.get(i).getDestino() == vertice) {
                cont++;
            }
        }

        int contAux = 0;

        for (i = 0; i < this.arestas.size(); i++) {
            if (this.arestas.get(i).getOrigem().getNome().equals(vertice.getNome())) {
                contAux++;
            }
        }

        return cont + contAux;
    }

    private void verificaGrafoConexo() {
        for (Vertice vertice : vertices) {
            /*
            Verifica se o vertice tem ligação com outro vertice
             */
            if (vertice.ligacoes.isEmpty() && !isVerticeTemConexao(vertice)) {
                conexo = false;
            }
        }

        conexo = true;
    }

    /*
	 * verifica se o vertice tem conexão com algum outro vertice
     */
    private boolean isVerticeTemConexao(Vertice vertice) {
        for (Vertice verticeInicio : vertices) {
            for (Aresta aresta : verticeInicio.ligacoes) {
                if (aresta.getOrigem().getNome().equals(vertice.getNome()) || 
                        aresta.getDestino().getNome().equals(vertice.getNome())) {
                    return true;
                }
            }
        }
        return false;
    }
}
