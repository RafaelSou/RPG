package alpha;
//import java.util.Scanner;
import personagens.Jogador;
import personagens.Inimigo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Combate{
    int aux_de_fuga = 0;
    /**
     *
     * @param jogador
     * @param inimigo
     */
    public void VS(Jogador jogador, Inimigo inimigo){
        ImageIcon iconInimigo = new ImageIcon("src/imagens/Skull.jpg");
        JOptionPane.showMessageDialog(null, jogador.nome+" entrou em COMBATE \n"
                + "contra "+inimigo.nome+"!", inimigo.nome, 0, iconInimigo);
        
        while(jogador.HP > 0 && inimigo.HP > 0){ // O loop continua até o HP de um dos dois for menor que zero.
            
            ImageIcon icon = new ImageIcon(jogador.icone);
            String[] options = {"Atacar", "Defender", "Especial"};
            int input = JOptionPane.showOptionDialog(null ,"HP:" +jogador.HP+ "\nATQ:" +jogador.ataque+" + Mod.Arma:" +jogador.item.atq+ "\nEscolha a sua Ação:",
                jogador.nome + " Lv." +jogador.getLV(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
            
            
            // Atacar = 0; Defender = 1; System.out.println(input);
            switch(input){
                case 0:
                    jogador.atacar(inimigo);
                    inimigo.aleatorio(jogador); //Ação do inimigo.
                    break;
                case 1:
                    inimigo.aleatorio(jogador);
                    jogador.defender(inimigo);
                    break;
                case 2:
                    aux_de_fuga = jogador.fugir(inimigo);
                    System.out.println(aux_de_fuga);
                    break;
                default:
                    System.out.println("-Ação inválida...tente de novo.");
                    break;
            }
            
            if(aux_de_fuga != 0){ // se o jogador teve sucesso em fugir, o hp do inimigo é setado em 0 para sair do loop.
                inimigo.HP = 0;
            }else{
                jogador.cont_atq = jogador.cont_def = 0;
                inimigo.cont_atq = inimigo.cont_def = 0;
                System.out.println("[Vida do "+inimigo.nome+" = " +inimigo.HP+ "]");  
            }
        }
        if(aux_de_fuga == 0){    
            if((jogador.HP <= 0) && (inimigo.HP <= 0)){
                System.out.println(jogador.nome+" e "+inimigo.nome+" morreram em Combate!!!");
            }else if(jogador.HP>0){
                System.out.println(jogador.nome+" derrotou "+inimigo.nome+"!!");
                System.out.println(jogador.nome+" recebeu "+inimigo.getXP()+" de XP!!");
                
                LevelUp upar = new LevelUp();
                upar.TesteXP(jogador,inimigo.getXP());
                
                //SE O JOGADOR CONSEGUIU DERROTAR O INIMIGO, ELE PODE EQUIPAR A ARMA DO INIMIGO.
                Drop itemD = new Drop();
                itemD.equiparDrop(jogador, inimigo.item);   
            }else System.out.println("O "+inimigo.nome+" Derrotou você!!");
        }
    }    
}
