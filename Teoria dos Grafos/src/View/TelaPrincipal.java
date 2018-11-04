/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import edu.ifet.grafos.graphview.GraphView;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import teoria.dos.grafos.Model.Aresta;
import teoria.dos.grafos.Model.Grafo;
import teoria.dos.grafos.Model.Vertice;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import teoria.dos.grafos.Model.GrafoToDot;

/**
 *
 * @author Gabriel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private JFileChooser fileChooser;
    private CriarGrafo criarGrafo;
    private CriarVertice criarVertice;
    private CriarAresta criarAresta;
    private RemoverVertice removerVertice;
    private RemoverAresta removerAresta;
    private GrauUmVertice grauVertice;
    private AlgoritmosCaminho algoritmosCaminho;
    static private Grafo grafo;
    private String nomeArquivo;
    private boolean salvo;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        nomeArquivo = "";
        grafo = new Grafo();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneNovoGrafo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnCriarGrafo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVerGrafo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoGrafo = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        chkOrdem = new javax.swing.JCheckBox();
        chkGrau = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnCriarGrafo.setText("Criar Grafo");
        btnCriarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarGrafoActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar vértice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVerGrafo.setText("Informações");
        btnVerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGrafoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtInfoGrafo);

        jButton2.setText("Adicionar arestas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remover vértice");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remover aresta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        chkOrdem.setText("Ordem do grafo");

        chkGrau.setText("Grau dos vertices");

        jButton5.setText("Grau de um vértice");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Algorítmos de caminho");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Carregar grafo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Salvar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Visualizar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Limpar Grafo");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerGrafo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCriarGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkGrau, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkOrdem, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCriarGrafo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkGrau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOrdem))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerGrafo)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        jTabbedPaneNovoGrafo.addTab("Grafo", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneNovoGrafo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneNovoGrafo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo primeiro");
            this.btnCriarGrafoActionPerformed(evt);
        } else if (grafo.getVertices().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um vértice primeiro");
            this.jButton1ActionPerformed(evt);
        } else if (grafo.getArestas().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta primeiro");
            this.jButton2ActionPerformed(evt);
        } else {
            algoritmosCaminho = new AlgoritmosCaminho();
            algoritmosCaminho.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo primeiro");
            this.btnCriarGrafoActionPerformed(evt);
        } else if (grafo.getVertices().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um vértice primeiro");
            this.jButton1ActionPerformed(evt);
        } else {
            grauVertice = new GrauUmVertice();
            grauVertice.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo primeiro");
            this.btnCriarGrafoActionPerformed(evt);
        } else if (grafo.getVertices().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um vértice primeiro");
            this.jButton1ActionPerformed(evt);
        } else if (grafo.getArestas().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta primeiro");
            this.jButton2ActionPerformed(evt);
        } else {
            removerAresta = new RemoverAresta();
            removerAresta.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo primeiro");
            this.btnCriarGrafoActionPerformed(evt);
        } else if (grafo.getVertices().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um vértice primeiro");
            this.jButton1ActionPerformed(evt);
        } else {
            removerVertice = new RemoverVertice();
            removerVertice.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo primeiro");
            this.btnCriarGrafoActionPerformed(evt);
        } else if (grafo.getVertices().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um vértice primeiro");
            this.jButton1ActionPerformed(evt);
        } else {
            criarAresta = new CriarAresta();
            criarAresta.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGrafoActionPerformed
        informaçõesDoGrafo();
    }//GEN-LAST:event_btnVerGrafoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo primeiro");
            this.btnCriarGrafoActionPerformed(evt);
        } else {
            criarVertice = new CriarVertice();
            criarVertice.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCriarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarGrafoActionPerformed
        criarGrafo = new CriarGrafo();
        criarGrafo.setVisible(true);
    }//GEN-LAST:event_btnCriarGrafoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        informaçõesDoGrafo();
    }//GEN-LAST:event_formFocusGained

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.btnCriarGrafoActionPerformed(evt);
        } else {
            try {
                salvarGrafo();
                salvo = true;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (grafo.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um grafo antes");
            this.btnCriarGrafoActionPerformed(evt);
        } else if (grafo.getVertices().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar um vértice primeiro");
            this.jButton1ActionPerformed(evt);
        } else if (grafo.getArestas().size() == 0) {
            JOptionPane.showMessageDialog(null, "Você precisa criar uma aresta primeiro");
            this.jButton2ActionPerformed(evt);
        } else if(!salvo) {
            JOptionPane.showMessageDialog(null, "Você precisa salvar o grafo primeiro");
            this.jButton8ActionPerformed(evt);
        }else {
            mostrarGrafo();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter dotFilter = new FileNameExtensionFilter(
                "dot files (*.dot)", "dot");
        chooser.setFileFilter(dotFilter);
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                InputStream is = new FileInputStream(chooser.getSelectedFile().toString());
                BufferedReader buf = new BufferedReader(new InputStreamReader(is));
                String line = buf.readLine();
                StringBuilder sb = new StringBuilder();

                while (line != null) {
                    sb.append(line).append("\n");
                    line = buf.readLine();
                }

                String dotGraph = sb.toString();
                System.out.println(dotGraph);
                Grafo grafo = GrafoToDot.importaGrafoDot(dotGraph);
                this.setGrafo(grafo);
                salvo = true;
                nomeArquivo = chooser.getSelectedFile().toString();
                if (nomeArquivo.contains(".dot")) {
                    nomeArquivo = nomeArquivo.replace(".dot", "");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        grafo = new Grafo();
        txtInfoGrafo.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    public void salvarGrafo() throws FileNotFoundException {
        String dotGraph = "";

        if (nomeArquivo.equals("")) {
            dotGraph = GrafoToDot.exportaGrafoDot(grafo).toString();
            JFileChooser chooser = new JFileChooser();
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                //FileOutputStream arquivo = new FileOutputStream(chooser.getSelectedFile() + ".dot");
                nomeArquivo = chooser.getSelectedFile().toString();
                if (nomeArquivo.contains(".dot")) {
                    nomeArquivo = nomeArquivo.replace(".dot", "");
                }
                //File arquivo = new File(chooser.getSelectedFile() + ".dot");
                try (PrintWriter arquivo = new PrintWriter(nomeArquivo + ".dot")) {
                    arquivo.println(dotGraph);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        File out = new File(nomeArquivo + " - imagem.png");

        GraphView gv = new GraphView();
        gv.readString(dotGraph);
        gv.writeGraphToFile(out);
    }

    public void mostrarGrafo() {
        //janela do programa    
        JFrame frame = new JFrame("Imagem do Grafo");
        //container onde serão adicionados todos componentes
        Container container = frame.getContentPane();

        //carrega a imagem passando o nome da mesma
        if(nomeArquivo.contains(".dot")) nomeArquivo = nomeArquivo.replace("", ".dot");
        ImageIcon img = new ImageIcon(nomeArquivo + " - imagem.png");

        //adiciona a imagem em um label
        JLabel label = new JLabel(img);

        //cria o JPanel para adicionar os labels
        JPanel panel = new JPanel();
        panel.add(label, BorderLayout.NORTH);

        container.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

    }

    public void informaçõesDoGrafo() {
        String infoGrafo = "";

        grafo.verificaTudo();

        if (grafo == null) {
            grafo = new Grafo();
            infoGrafo = "O grafo ainda não existe";
        } else {
            int[][] matriz = grafo.getMatrizAdjacencia();
            int tamanhoMatriz = grafo.getVertices().size();
            ArrayList<Vertice> vertices = grafo.getVertices();
            ArrayList<Aresta> arestas = grafo.getArestas();
            int i, j;
            infoGrafo = "Nome do grafo: " + grafo.getNome();
            grafo.setConexo();
            if (grafo.isConexo()) {
                infoGrafo += " - Grafo conexo";
            } else {
                infoGrafo += " - Grafo não conexo";
            }
            if (grafo.isDirecionado()) {
                infoGrafo += " - direcionado";
            } else {
                infoGrafo += " - não direcionado";

            }

            if (grafo.isRegular()) {
                infoGrafo += " - regular";
            } else {
                infoGrafo += " - não regular";

            }
            if (grafo.isValorado()) {
                infoGrafo += " - valorado";
            } else {
                infoGrafo += " - não valorado";

            }

            if (chkOrdem.isSelected()) {
                infoGrafo += "\nOrdem do grafo: " + Integer.toString(grafo.getOrdem());
            }

            if (grafo.getVertices().size() > 0) {
                infoGrafo += "\nVertices:\n";
                for (i = 0; i < vertices.size(); i++) {
                    infoGrafo += " " + vertices.get(i).getNome();

                    if (chkGrau.isSelected()) {
                        infoGrafo += " - Grau do vértice: " + grafo.getGrau(vertices.get(i));
                    }
                    infoGrafo += "\n";
                }
            }

            if (grafo.getArestas().size() > 0) {
                infoGrafo += "\nArestas:\n";
                for (i = 0; i < arestas.size(); i++) {
                    infoGrafo += " " + arestas.get(i).getNome() + "("
                            + arestas.get(i).getNomeOrigem() + " - "
                            + arestas.get(i).getNomeDestino() + ") valor: "
                            + arestas.get(i).getValor()
                            + "\n";
                }
            }

            infoGrafo += "\nMatriz de adjacencias: \n";
            for (i = 0; i < tamanhoMatriz; i++) {
                for (j = 0; j < tamanhoMatriz; j++) {
                    infoGrafo += " " + Integer.toString(matriz[i][j]);
                }
                infoGrafo += "\n";
            }
            infoGrafo += "\n";
        }

        txtInfoGrafo.setText(infoGrafo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    static public Grafo getGrafo() {
        if (grafo == null) {
            grafo = new Grafo();
        }
        return grafo;
    }

    static public void setGrafo(Grafo grafo) {
        TelaPrincipal.grafo = grafo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarGrafo;
    private javax.swing.JButton btnVerGrafo;
    private javax.swing.JCheckBox chkGrau;
    private javax.swing.JCheckBox chkOrdem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneNovoGrafo;
    private javax.swing.JTextPane txtInfoGrafo;
    // End of variables declaration//GEN-END:variables
}
