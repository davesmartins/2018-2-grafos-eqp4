/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria.dos.grafos.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GrafoToDot {

    public static String exportaGrafoDot(Grafo grafo) {
        if (grafo.getNome() == null || grafo.getNome().equals("")) {
            return "Grafo sem nome";
        } else {
            return criaDotDocument(grafo);

        }

    }

    private static String criaDotDocument(Grafo grafo) {
        String dotGraph = "", aux = "";
        double valor = 0;
        boolean direct = false;

        for (Vertice vertice : grafo.getVertices()) {
            if (vertice.ligacoes.size() > 0) {
                for (Aresta aresta : vertice.ligacoes) {
                    valor = aresta.getValor();
                    if (valor != 0) {
                        aux = " [label = \"" + valor + "\" ];\n";

                    } else {
                        aux = ";\n";
                    }
                    if (aresta.isDirecionado()) {
                        dotGraph += " " + vertice.getNome() + " -> " + aresta.getNomeDestino() + aux;
                        direct = true;
                    } else {
                        dotGraph += " " + vertice.getNome() + " -- " + aresta.getNomeDestino() + aux;
                    }
                }
                dotGraph += "\n";
            }
        }

        dotGraph += " }";

        if (direct) {
            dotGraph = "digraph " + grafo.getNome() + " {\n" + dotGraph;
        } else {
            dotGraph = "graph " + grafo.getNome() + " {\n" + dotGraph;
        }
        return dotGraph;
    }

}
