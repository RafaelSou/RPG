package alpha;

import itens.Arma;
import personagens.Jogador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 201604940041
 */
public class Drop {
    public void equiparDrop(Jogador jogador, Arma item){
        ImageIcon icon2 = new ImageIcon(item.getIcon());
        String[] options = {"Equipar", "Guardar"};
        int input2 = JOptionPane.showOptionDialog(null ,"O inimigo tinha um(a)"+item.getNome()
            +":\nATQ:"+item.getAtq()+"\nDEF:"+item.getDef()
            +".\nVocê deseja substituir a sua arma pelo(a)\n"
            +item.getNome()+" ou guardar na mochila?",
            jogador.getNome(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon2, options, options[0]);
             
        switch(input2){
            case 0:
                jogador.setItem(item);
                System.out.println(jogador.getNome()+" equipou "+jogador.item.getNome());
                break;
            case 1:
                jogador.mochila.addItem(item);
                break;
            default:
                break;
        }
    }
}
