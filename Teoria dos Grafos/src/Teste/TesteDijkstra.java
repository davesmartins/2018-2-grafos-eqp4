/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import edu.ifet.grafos.graphview.GraphView;
import java.io.File;
import teoria.dos.grafos.Model.Aresta;
import teoria.dos.grafos.Model.Dijkstra;
import teoria.dos.grafos.Model.Grafo;
import teoria.dos.grafos.Model.GrafoToDot;
import teoria.dos.grafos.Model.Vertice;
import java.awt.*;
import javax.swing.*;
import teoria.dos.grafos.Model.Prim;

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

//        Vertice no1 = new Vertice("a u");
//        Vertice no2 = new Vertice("b");
//        Vertice no3 = new Vertice("c");
//        Vertice no4 = new Vertice("d");
//        Vertice no5 = new Vertice("e");
//        Vertice no6 = new Vertice("f");
//        Vertice no7 = new Vertice("g");
//        Aresta a1 = new Aresta(true, no1, no2, "a1", 5);
//        Aresta a2 = new Aresta(true, no2, no3, "a2", 6);
//        Aresta a3 = new Aresta(true, no3, no4, "a3", 3);
//        Aresta a4 = new Aresta(true, no4, no5, "a4", 4);
//        Aresta a5 = new Aresta(true, no5, no6, "a5", 5);
//        Aresta a6 = new Aresta(true, no6, no1, "a6", 5);
//        Aresta a8 = new Aresta(true, no7, no4, "a7", 0);
//        garfo.setDirecionado(true);
//        garfo.adicionaVertice(no1);
//        garfo.adicionaVertice(no2);
//        garfo.adicionaVertice(no3);
//        garfo.adicionaVertice(no4);
//        garfo.adicionaVertice(no5);
//        garfo.adicionaVertice(no6);
//        garfo.adicionaVertice(no7);
//        
//        garfo.adicionaAresta(a1);
//        garfo.adicionaAresta(a2);
//        garfo.adicionaAresta(a3);
//        garfo.adicionaAresta(a4);
//        garfo.adicionaAresta(a5);
//        garfo.adicionaAresta(a6);
//        garfo.adicionaAresta(a8);
//        Dijkstra digao = new Dijkstra(garfo);
//
//        digao.execute(no1);
//        System.out.println(digao.menorDistancia(no4));
        Vertice no1 = new Vertice("0");
        Vertice no2 = new Vertice("1");
        Vertice no3 = new Vertice("2");
        Vertice no4 = new Vertice("3");
        Vertice no5 = new Vertice("4");
        Vertice no6 = new Vertice("5");
        Aresta a1 = new Aresta(false, no1, no2, "a1", 5);
        Aresta a2 = new Aresta(false, no1, no6, "a2", 2);
        Aresta a3 = new Aresta(false, no2, no6, "a3", 4);
        Aresta a4 = new Aresta(false, no1, no5, "a4", 15);
        Aresta a5 = new Aresta(false, no2, no5, "a5", 22);
        Aresta a6 = new Aresta(false, no5, no3, "a6", 1);
        Aresta a7 = new Aresta(false, no2, no4, "a7", 9);
        Aresta a8 = new Aresta(false, no6, no4, "a8", 6);        
        Aresta a9 = new Aresta(false, no3, no4, "a9", 12);
        garfo.setDirecionado(true);
        garfo.adicionaVertice(no1);
        garfo.adicionaVertice(no2);
        garfo.adicionaVertice(no3);
        garfo.adicionaVertice(no4);
        garfo.adicionaVertice(no5);
        garfo.adicionaVertice(no6);

        garfo.adicionaAresta(a1);
        garfo.adicionaAresta(a2);
        garfo.adicionaAresta(a3);
        garfo.adicionaAresta(a4);
        garfo.adicionaAresta(a5);
        garfo.adicionaAresta(a6);
        garfo.adicionaAresta(a7);
        garfo.adicionaAresta(a8);
        garfo.adicionaAresta(a9);

        garfo.setNome("Grafao");
        
        Prim prim = new Prim();
        
        Grafo grafoReduzido = new Grafo();
        grafoReduzido = prim.getPrim(garfo);
        
        String g = GrafoToDot.exportaGrafoDot(grafoReduzido);

        // Criando um objeto da classe responsável por gerar a imagem do grafo
        GraphView gv = new GraphView();
//Lendo a String 
        gv.readString(g);
//Imprimindo a grafo em texto
        System.out.println(gv.getDotSource());
//Gerando uma imagem com o nome out.png 
        File out = new File("out.png");
        gv.writeGraphToFile(out);

        //janela do programa    
        JFrame frame = new JFrame("Carregar Imagem");
        //container onde serão adicionados todos componentes
        Container container = frame.getContentPane();

        //carrega a imagem passando o nome da mesma
        ImageIcon img = new ImageIcon("out.png");

        //pega a altura e largura
        int altura = img.getIconHeight();
        int largura = img.getIconWidth();

        //adiciona a imagem em um label
        JLabel label = new JLabel(img);
        //adiciona a altura e largura em outro label
        JLabel label2 = new JLabel("Altura: " + altura + "      Largura: " + largura);

        //cria o JPanel para adicionar os labels
        JPanel panel = new JPanel();
        panel.add(label, BorderLayout.NORTH);
        panel.add(label2, BorderLayout.SOUTH);

        //adiciona o panel no container
        container.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

        //pronto e simples
    }

}
