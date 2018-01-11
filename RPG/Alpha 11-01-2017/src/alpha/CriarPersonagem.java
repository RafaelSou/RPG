package alpha;

import item.FabricaDeEquip;
import personagens.Jogador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CriarPersonagem {
    
    public Jogador cadastro(){
        FabricaDeEquip item = new FabricaDeEquip();
        Jogador jogador = new Jogador();
            jogador.HP = 100;
            jogador.ataque = 30;        
            jogador.defesa = 40;
            jogador.agilidade = 4;
            jogador.cont_Lv = 1;        
            jogador.equiparItem(item.item1());
        String[] options = {"Homem", "Mulher"};
        int input = JOptionPane.showOptionDialog(null ,"O seu personagem é:",
            "-PERSONAGEM-", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            
        switch(input){
            case 0:
                jogador.icone = "src/imagens/jogador1.png";
                break;
            case 1:
                jogador.icone = "src/imagens/jogador2.jpg";
                break;
            default:
                break;
        }
        ImageIcon icon = new ImageIcon(jogador.icone);
        jogador.nome = (String)JOptionPane.showInputDialog(null, "Qual o seu nome?", "-PERSONAGEM-", JOptionPane.DEFAULT_OPTION, icon, null, null);    
        return jogador;
    }
}
