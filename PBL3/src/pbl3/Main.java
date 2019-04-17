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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dispositivo dispcel = new Celular();
        //Celular disp = new Celular();
        //Notebook disp = new Notebook();
        //Desktop disp = new Desktop();
        Tablet disp = new Tablet();
        //Dispositivo disp = new Dispositivo();
        Lista lista = new Lista();
        Paragrafo paragrafo = new Paragrafo();
        Link link = new Link();
        link.setTamanho(20);
        link.setCor("Verde");
        paragrafo.setCor("Vermelho");
        paragrafo.setTamanho(10);
        lista.setCor("Azul");
        lista.setTamanho(50);
        System.out.println("Link Tam:"+link.getTamanho());
        System.out.println("Lista Tam:"+lista.getTamanho());
        System.out.println("Paragrafo Tam:"+paragrafo.getTamanho());
        disp.addConteudo(link);
        disp.addConteudo(lista);
        disp.addConteudo(paragrafo);
        System.out.println("-----------------------------");
        for(int i=0;i<disp.getConteudos().size();i++){
            System.out.println("Tamanho Elemento "+(i+1)+":"+disp.getConteudos().get(i).proportion(disp.identify(disp)));
        }
        
        
        
        
    }
    
}
