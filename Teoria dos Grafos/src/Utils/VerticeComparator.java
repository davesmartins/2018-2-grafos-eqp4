/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Comparator;
import teoria.dos.grafos.Model.Vertice;

/**
 *
 * @author Gabriel
 */
public class VerticeComparator implements Comparator<Vertice> {

    @Override
    public int compare(Vertice o1, Vertice o2) {
        if (o1.getLigacoes().size() > o2.getLigacoes().size()) {
            return -1;
        } else if (o1.getLigacoes().size() < o2.getLigacoes().size()) {
            return +1;
        } else {
            return 0;
        }
    }

}
