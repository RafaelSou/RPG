package alpha;

import item.Equipamento;
import personagens.Jogador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 201604940041
 */
public class Drop {
    public void equiparDrop(Jogador jogador, Equipamento item){
        ImageIcon icon2 = new ImageIcon(item.icon);
                String[] options = {"Sim", "Não"};
                int input2 = JOptionPane.showOptionDialog(null ,"O inimigo tinha um(a) "+item.nome
                        +": \nATQ:"+item.atq+"\nDEF:"+item.def+"\nPESO:"+item.peso
                        +".\n Você deseja substituir a sua arma pelo(a)\n"
                        +item.nome+"?",
                jogador.nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon2, options, options[0]);
             
                switch(input2){
                case 0:
                    jogador.equiparItem(item);
                    System.out.println(jogador.nome+" equipou "+jogador.item.nome);
                    break;
                default:
                    break;
            }
    }
}
