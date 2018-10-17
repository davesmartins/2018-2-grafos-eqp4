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

    public static Grafo importaGrafoDot(String dotGraph) {
        Grafo grafo = new Grafo();
        Aresta aresta;
        if (dotGraph.contains("digraph")) {
            grafo.setDirecionado(true);
        } else {
            grafo.setDirecionado(false);
        }
        int i;
        String aux, aux2;
        String[] arrayAux;
        String[] arrayGrafo = dotGraph.split("\\{\n");

        //pegando o nome do grafo pelo espaço entre o tipo do grafo e o nome
        grafo.setNome(arrayGrafo[0].split(" ")[1]);

        //filtrando os vértices
        arrayAux = arrayGrafo[1].split(";\n ")[0].split(";\n");

        for (i = 0; i < arrayAux.length; i++) {
            grafo.adicionaVertice(arrayAux[i]);
        }
        
        arrayGrafo = arrayGrafo[1].split(";\n "); 
        
        arrayAux = arrayGrafo[1].split("];\n\n ");

        if (grafo.isDirecionado()) {
            aux = "->";
        } else {
            aux = "--";
        }

        for (i = 0; i < arrayAux.length -1; i++) {
            Vertice origem = new Vertice(arrayAux[i].split(aux)[0].trim());
            Vertice destino = new Vertice(arrayAux[i].split(aux)[1].split("\\[")[0].trim());

            aresta = new Aresta(origem, destino);
            aresta.setNome(arrayAux[i].split("name = \"")[1].split("\"")[0]);
            if(arrayAux[i].contains("label")){
                aresta.setValor(Double.parseDouble(arrayAux[i].split("label = \"")[1].split("\"")[0]));
            }
            grafo.adicionaAresta(aresta);
        }
        return grafo;
    }

    private static String criaDotDocument(Grafo grafo) {
        String dotGraph = "", aux = "";
        double valor = 0;
        boolean direct = false;

        for (Vertice vertice : grafo.getVertices()) {
            dotGraph += "" + vertice.getNome() + ";\n";
        }
        for (Vertice vertice : grafo.getVertices()) {
            if (vertice.ligacoes.size() > 0) {
                for (Aresta aresta : vertice.ligacoes) {
                    valor = aresta.getValor();
                    if (valor != 0) {
                        aux = " [label = \"" + valor + "\", name = \"" + aresta.getNome() + "\" ];";

                    } else {
                        aux = " [name = \"" + aresta.getNome() + "\" ];";
                    }
                    if (aresta.isDirecionado()) {
                        dotGraph += " " + vertice.getNome() + " -> " + aresta.getNomeDestino() + aux;
                        direct = true;
                    } else {
                        dotGraph += " " + vertice.getNome() + " -- " + aresta.getNomeDestino() + aux;
                    }
                    dotGraph += "\n\n";
                }
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

    public int getIndiceNoArray(String letra, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letra) {
                return i;
            }
        }
        return 0;
    }

}
