package alpha;

import itens.Arma;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personagens.Inimigo;
import personagens.Jogador;

public class Combate {
    private int aux_de_fuga = 0;
    /**
     *
     * @param jogador
     * @param inimigo
     */
    public void VS(Jogador jogador, Inimigo inimigo){
        if(jogador.getHP() > 0){
            
        ImageIcon iconInimigo = new ImageIcon(inimigo.getIcone());
        JOptionPane.showMessageDialog(null, jogador.getNome()+" entrou em COMBATE \n"
            + "contra "+inimigo.getNome()+"!", inimigo.getNome(), 0, iconInimigo);
        
        while(jogador.getHP() > 0 && inimigo.getHP() > 0){ // O loop continua até o HP de um dos dois for menor que zero.

            ImageIcon icon = new ImageIcon(jogador.getIcone());
            String[] options = {"Ação", "Mochila", "Fugir"};
            int input1 = JOptionPane.showOptionDialog(null ,"HP:" +jogador.getHP()+ "\nATQ:" +jogador.getAtaque()+" + Mod.Arma:" +jogador.item.getAtq()+ "\nEscolha a sua Ação:",
                jogador.getNome() + " Lv." +jogador.getLv(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);
                
            switch(input1){
                case 0: // OPÇÃO: Ação
                    ImageIcon icon2 = new ImageIcon(jogador.getIcone());
                    String[] options2 = {"Atacar", "Defender", "Especial", "Voltar"};
                    int input = JOptionPane.showOptionDialog(null ,"HP:" +jogador.getHP()+ "\nATQ:" +jogador.getAtaque()+" + Mod.Arma:" +jogador.item.getAtq()+ "\nEscolha a sua Ação:",
                        jogador.getNome() + " Lv." +jogador.getLv(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon2, options2, options2[0]);
            
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
                    jogador.mochila.printList();
                    String busca = (String)JOptionPane.showInputDialog(null, "Informe o Item:", "-MOCHILA-",
                    JOptionPane.DEFAULT_OPTION, null, null, null);
                    
                    if(jogador.mochila.searchItem(busca) == true){
                        String[] options3 = {"Sim", "não"};
                        int input3 = JOptionPane.showOptionDialog(null ,"Você deseja equipar o Item?",
                        "-MOCHILA-", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options3, options3[0]);
                        
                        switch(input3){
                            case 0:
                                System.out.println(jogador.getNome()+" guardou "+jogador.item.getNome()+" na mochila"
                                        + "\ne equipou "+busca);
                                jogador.mochila.addItem(jogador.item);
                                jogador.item = (Arma) jogador.mochila.rmvItem(busca);
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
                inimigo.setHP(0);
            }else{
                jogador.setCont_atq(0);
                jogador.setCont_def(0);
                inimigo.setCont_atq(0);
                inimigo.setCont_def(0);
                System.out.println("\n[Vida do "+inimigo.getNome()+" = " +inimigo.getHP()+ "]");  
            }
        }
        if(aux_de_fuga == 0){    
            if((jogador.getHP() <= 0) && (inimigo.getHP() <= 0)){
                System.out.println(jogador.getNome()+" e "+inimigo.getNome()+" morreram em Combate!!!");
            }else if(jogador.getHP()>=0){
                System.out.println(jogador.getNome()+" derrotou "+inimigo.getNome()+"!!");
                System.out.println(jogador.getNome()+" recebeu "+inimigo.getXP()+" de XP!!");
                
                TesteLevelUp upar = new TesteLevelUp();
                upar.TesteXP(jogador,inimigo.getXP());
                
                //SE O JOGADOR CONSEGUIU DERROTAR O INIMIGO, ELE PODE EQUIPAR A ARMA DO INIMIGO.
                Drop itemD = new Drop();
                itemD.equiparDrop(jogador, inimigo.item);   
            }else System.out.println("O "+inimigo.getNome()+" Derrotou você!!");
        }    
    }
    }
}