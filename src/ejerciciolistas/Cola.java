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
public class Cola<E> extends ArrayList {
    
    public void Encolar(Auto auto){
        this.add(auto);
    }
    
    public void Desencolar(){
        if (!this.isEmpty())
        this.remove(0);
    }
    
            
    
}
