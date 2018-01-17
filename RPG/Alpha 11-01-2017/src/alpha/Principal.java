package alpha;

import flyweight.FlyFactoryItem;
import itens.Arma;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import personagens.Jogador;
import mapas.ControladorDeMapas;

public class Principal{
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("src/imagens/menu.jpg");
        String[] options = {"START","EXIT"};
        int input = JOptionPane.showOptionDialog(null,null, "-MENU-",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]);
        
        if(input == 0){
            CriarPersonagem P = new CriarPersonagem(); 
            Jogador jogador = P.cadastro();
        
            jogador.mochila.addItem(FlyFactoryItem.get("Espada Caveira"));
            jogador.mochila.addItem(FlyFactoryItem.get("Machado"));
            jogador.mochila.printList();
         
            jogador.item = (Arma) jogador.mochila.rmvItem("Machado");
            jogador.mochila.printList();
        
            jogador.mochila.addItem(FlyFactoryItem.get("Cetro Necromante"));
            jogador.mochila.printList();
        
            System.out.println(jogador.item.getClass()); //Retorna a classe
        
            ControladorDeMapas M1 = new ControladorDeMapas();
            M1.Entrar(jogador);
        }  
    }     
}
