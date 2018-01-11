package alpha;

import item.Equipamento;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personagens.Inimigo;
import personagens.Jogador;

public class Combate2 {
    int aux_de_fuga = 0;
    /**
     *
     * @param jogador
     * @param inimigo
     */
    public void VS(Jogador jogador, Inimigo inimigo){
        ImageIcon iconInimigo = new ImageIcon(inimigo.icone);
        JOptionPane.showMessageDialog(null, jogador.nome+" entrou em COMBATE \n"
            + "contra "+inimigo.nome+"!", inimigo.nome, 0, iconInimigo);
        
        while(jogador.HP > 0 && inimigo.HP > 0){ // O loop continua até o HP de um dos dois for menor que zero.

            ImageIcon icon = new ImageIcon(jogador.icone);
            String[] options = {"Ação", "Mochila", "Fugir"};
            int input1 = JOptionPane.showOptionDialog(null ,"HP:" +jogador.HP+ "\nATQ:" +jogador.ataque+" + Mod.Arma:" +jogador.item.atq+ "\nEscolha a sua Ação:",
                jogador.nome + " Lv." +jogador.getLV(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
                
            switch(input1){
                case 0: // OPÇÃO: Ação
                    ImageIcon icon2 = new ImageIcon(jogador.icone);
                    String[] options2 = {"Atacar", "Defender", "Especial", "Voltar"};
                    int input = JOptionPane.showOptionDialog(null ,"HP:" +jogador.HP+ "\nATQ:" +jogador.ataque+" + Mod.Arma:" +jogador.item.atq+ "\nEscolha a sua Ação:",
                        jogador.nome + " Lv." +jogador.getLV(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon2, options2, options2[0]);
            
                    switch(input){
                        case 0: // ATACAR
                            jogador.atacar(inimigo);
                            inimigo.aleatorio(jogador); //Ação do inimigo.
                            break;
                        case 1:// DEFENDER
                            inimigo.aleatorio(jogador);
                            jogador.defender(inimigo);
                            break;
                        case 2:// ESPECIAL
                            System.out.println("Ação em desenvolvimento.");
                            break;
                        case 3: // VOLTAR
                            break;    
                        default:
                            System.out.println("-Comando Inválido");
                            break;
                    }
                    break;
                case 1: // OPÇÃO : Inventário
                    jogador.mochila.Imprimir();
                    String busca = (String)JOptionPane.showInputDialog(null, "Informe o Item:", "-MOCHILA-",
                    JOptionPane.DEFAULT_OPTION, null, null, null);
                    
                    if(jogador.mochila.searchEquip(busca) == true){
                        String[] options3 = {"Sim", "não"};
                        
                        int input3 = JOptionPane.showOptionDialog(null ,"Você deseja equipar o Item?",
                        "-MOCHILA-", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options3, options3[0]);
                        
                        switch(input3){
                            case 0:
                                System.out.println(jogador.nome+" guardou "+jogador.item.nome+" na mochila"
                                        + "\ne equipou "+busca);
                                jogador.mochila.addEquip(jogador.item);
                                jogador.item = (Equipamento) jogador.mochila.rmvEquip(busca);
                                break;
                            case 1:
                                break;
                        }
                    }else System.out.println("O Item não foi encontrado.");
                    
                    break;
                case 2: // OPÇÃO : Fugir
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
                System.out.println("\n[Vida do "+inimigo.nome+" = " +inimigo.HP+ "]");  
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