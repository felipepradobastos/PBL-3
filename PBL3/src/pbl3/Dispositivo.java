/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl3;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Dispositivo{

    /**
     *
     */
    protected ArrayList<Html> conteudos;
    
    public Dispositivo(){
        conteudos = new ArrayList<>();
    }
    
    public int identify(Dispositivo disp){
        if(disp instanceof Celular){
            return 4;
        }
        if(disp instanceof Tablet){
            return 3;
        }
        if(disp instanceof Desktop){
            return 1;
        }
        if(disp instanceof Notebook){
            return 2;
        }
        return 0;
    }

    public ArrayList<Html> getConteudos() {
        return conteudos;
    }

    public void addConteudo(Html html) {
        this.conteudos.add(html);
    }
    
}
