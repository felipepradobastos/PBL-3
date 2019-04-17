/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl3;

/**
 *
 * @author felip
 */
public class Link extends Html {
    public double proportion(int index){
        switch(index){
            case 1:
                return this.tamanho*2.2;
            case 2:
                return this.getTamanho()*2;
            case 3:
                return this.getTamanho();
            case 4:
                return this.getTamanho()*0.7;
        }
        return 0;
    }
}
