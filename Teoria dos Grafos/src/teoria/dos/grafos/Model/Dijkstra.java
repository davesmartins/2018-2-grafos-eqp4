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
    private HashMap<String, Float> distancias;

    public Dijkstra(Grafo grafo) {
        this.grafo = grafo;
        this.distancias = new HashMap();
    }


    public Dijkstra() {

    }

    public void execute(Vertice origem) {
        int i;

        for (i = 0; i < this.grafo.getVertices().size(); i++) {
            this.distancias.put(grafo.getVertices().get(i).getId(), Float.MAX_VALUE);
        }

        int indice = this.grafo.getIndiceVerticePorId(origem.getId());
        this.distancias.put(this.grafo.getVertices().get(indice).getId(), 0F);
        ArrayList<Vertice> nosJaVisitados = new ArrayList();
        nosJaVisitados.add(this.grafo.getVertices().get(indice));
        visitarTodosNos(this.grafo.getVertices().get(indice).getId(), 0, nosJaVisitados);
    }

    private float calcularDistancia(String inicioId, String alvoId) {
        int i;
        for (i = 0; i < this.grafo.getEdges().size(); i++) {
            if (this.grafo.getEdges().get(i).getDirected()) {
                if (this.grafo.getEdges().get(i).getSource().getId().equals(inicioId) && this.grafo.getEdges().get(i).getTarget().getId().equals(alvoId)) {
                    return Float.parseFloat(this.grafo.getEdges().get(i).getData().getData());
                }
            } else if ((this.grafo.getEdges().get(i).getSource().getId().equals(inicioId) && this.grafo.getEdges().get(i).getTarget().getId().equals(alvoId))
                    || (this.grafo.getEdges().get(i).getSource().getId().equals(alvoId) && this.grafo.getEdges().get(i).getTarget().getId().equals(inicioId))) {
                return Float.parseFloat(this.grafo.getEdges().get(i).getData().getData());
            }
        }
        return Float.MAX_VALUE;
    }

    private void visitarTodosNos(String noId, float distanciaAnterior, ArrayList<Vertice> nosJaVisitados) {

        ArrayList<Vertice> alcancaveis;
        int indice, i;
        indice = this.grafo.getIndiceVerticePorId(noId);
        alcancaveis = this.grafo.getNosAdjacentes(this.grafo.getVertices().get(indice));
        alcancaveis.removeAll(nosJaVisitados);

        for (i = 0; i < alcancaveis.size(); i++) {
            float distancia = calcularDistancia(noId, alcancaveis.get(i).getId());

            if (distancia+distanciaAnterior < this.distancias.get(alcancaveis.get(i).getId())) {
                this.distancias.put(alcancaveis.get(i).getId(), distancia+distanciaAnterior);
            }
        }
        
        for (i = 0; i < alcancaveis.size(); i++) {
            nosJaVisitados.add(alcancaveis.get(i));
            visitarTodosNos(alcancaveis.get(i).getId(), this.distancias.get(alcancaveis.get(i).getId()), nosJaVisitados);
            nosJaVisitados.remove(alcancaveis.get(i));
        }
    }

    public float menorDistancia(Vertice destino) {
        if (this.distancias.get(destino.getId()) != null) {
            return this.distancias.get(destino.getId());
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
