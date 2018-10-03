/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Gabriel
 */
public class Dijkstra {

    private Grafo grafo;
    private HashMap<String, Double> distancias;

    public Dijkstra(Grafo grafo) {
        this.grafo = grafo;
        this.distancias = new HashMap();
    }

    public Dijkstra() {

    }

    public void execute(Vertice origem) {
        int i;

        for (i = 0; i < this.grafo.getVertices().size(); i++) {
            this.distancias.put(grafo.getVertices().get(i).getNome(), Double.MAX_VALUE);
        }

        int indice = this.grafo.getIndiceVertice(origem.getNome());
        this.distancias.put(this.grafo.getVertices().get(indice).getNome(), 0.0);
        ArrayList<Vertice> verticesJaVisitados = new ArrayList();
        verticesJaVisitados.add(this.grafo.getVertices().get(indice));
        visitarTodosNos(this.grafo.getVertices().get(indice).getNome(), 0, verticesJaVisitados);
    }

    private double calcularDistancia(String nomeInicio, String nomeDestino) {
        int i;
        for (i = 0; i < this.grafo.getArestas().size(); i++) {
            if (this.grafo.getArestas().get(i).isDirecionado()) {
                if (this.grafo.getArestas().get(i).getOrigem().getNome().equals(nomeInicio) && this.grafo.getArestas().get(i).getDestino().getNome().equals(nomeDestino)) {
                    return this.grafo.getArestas().get(i).getValor();
                }
            } else if ((this.grafo.getArestas().get(i).getOrigem().getNome().equals(nomeInicio) && this.grafo.getArestas().get(i).getDestino().getNome().equals(nomeDestino))
                    || (this.grafo.getArestas().get(i).getOrigem().getNome().equals(nomeInicio) && this.grafo.getArestas().get(i).getDestino().getNome().equals(nomeDestino))) {
                return this.grafo.getArestas().get(i).getValor();
            }
        }
        return Double.MAX_VALUE;
    }

    private void visitarTodosNos(String noId, double distanciaAnterior, ArrayList<Vertice> nosJaVisitados) {

        ArrayList<Vertice> alcancaveis;
        int indice, i;
        indice = this.grafo.getIndiceVertice(noId);
        alcancaveis = this.grafo.getNosAdjacentes(this.grafo.getVertices().get(indice));
        alcancaveis.removeAll(nosJaVisitados);

        for (i = 0; i < alcancaveis.size(); i++) {
            double distancia = calcularDistancia(noId, alcancaveis.get(i).getNome());

            if (distancia + distanciaAnterior < this.distancias.get(alcancaveis.get(i).getNome())) {
                this.distancias.put(alcancaveis.get(i).getNome(), distancia + distanciaAnterior);
            }
        }

        for (i = 0; i < alcancaveis.size(); i++) {
            nosJaVisitados.add(alcancaveis.get(i));
            visitarTodosNos(alcancaveis.get(i).getNome(), this.distancias.get(alcancaveis.get(i).getValor()), nosJaVisitados);
            nosJaVisitados.remove(alcancaveis.get(i));
        }
    }

    public double menorDistancia(Vertice destino) {
        if (this.distancias.get(destino.getNome()) != null) {
            return this.distancias.get(destino.getValor());
        } else {
            return -1;
        }
    }

    public HashMap getDistancias() {
        return this.distancias;
    }

    public Grafo getGrafo() {
        return this.grafo;
    }
}
