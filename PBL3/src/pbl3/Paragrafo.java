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
public class Paragrafo extends Html{
        public void proportion(int index){
        switch(index){
            case 1:
                this.setTamanho((int) (this.getTamanho() * 2.5))
                        
                        ;
                break;
            case 2:
                this.setTamanho(this.getTamanho() * 2);
                break;
            case 3:
                break;
            case 4:
                this.setTamanho((int) (this.getTamanho() * 0.7));
                break;
        }
    }
}
