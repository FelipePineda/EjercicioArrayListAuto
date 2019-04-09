/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolistas;

import java.util.ArrayList;

/**
 *
 * @author FELIPE
 */
public class Pila <E> extends ArrayList {

    public void Aplir(Auto auto) {
        this.add(0, auto);
    }

    public void Desaplir() {
        if (!this.isEmpty()) {
            this.remove(0);
        }
    }
}
