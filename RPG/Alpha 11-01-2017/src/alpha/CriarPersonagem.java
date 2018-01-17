package alpha;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Jogador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CriarPersonagem {
    
    public Jogador cadastro(){
        Jogador jogador = new Jogador();
            jogador.setHP(100);
            jogador.setAuxHP(100);
            jogador.setAtaque(30);        
            jogador.setDefesa(40);
            jogador.setAgilidade(4);     
            jogador.setItem((Arma)FlyFactoryItem.get("Espada Caveira"));
        String[] options = {"Homem", "Mulher"};
        int input = JOptionPane.showOptionDialog(null ,"O seu personagem é:",
            "-PERSONAGEM-", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            
        switch(input){
            case 0:
                jogador.setIcone("src/imagens/jogador1.png");
                break;
            case 1:
                jogador.setIcone("src/imagens/jogador2.jpg");
                break;
            default:
                break;
        }
        ImageIcon icon = new ImageIcon(jogador.getIcone()); 
        String nome = (String)JOptionPane.showInputDialog(null, "Qual o seu nome?", "-PERSONAGEM-", JOptionPane.DEFAULT_OPTION, icon, null, null);    
        jogador.setNome(nome);
        return jogador;
    }
}
