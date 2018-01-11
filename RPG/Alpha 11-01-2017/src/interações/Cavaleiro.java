package interações;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import personagens.Jogador;

public class Cavaleiro {
    int input, input1 = 0;
    String nome = "Zepp, o Cavaleiro";
    
    public int dialogoTaverna(Jogador jogador, int cont_irmao, int cont_cavaleiro){
        System.out.println("Cont.tavernerio="+cont_irmao);
        ImageIcon icon = new ImageIcon("src/imagens/Cavaleiro.png");
        while(input != 2){
        
            String[] options = {"Se apresentar","Buscar informações","voltar"};
            input = JOptionPane.showOptionDialog(null,"Ham... O que você quer?!", nome,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]);    
  
            switch(input){
                case 0: //Saudações
                    if(cont_cavaleiro == 0){
                        if(cont_irmao != 1){
                            String[] options2 = {"'Estou indo para Dungeon'","voltar"};
                            input1 = JOptionPane.showOptionDialog(null ,"'Ham... saudações "+jogador.nome +", meu nome é Zepp, sou"
                                + "\no Capitão da Guarda de Lua Prata, minha terra natal. "
                                + "\nBem...O que você faz nesse navio?'",
                                nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options2, options2[0]);
                            switch(input1){
                                case 0: 
                                    JOptionPane.showOptionDialog(null ,"'Entendo... Eu também estou indo, mas não busco glória"
                                        + "\nou riquezas apenas... JUSTIÇA...'",
                                        nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                                    break;
                                default:
                                    break;
                            }
                        }else{
                        while(input1 != 2){  
                            String[] options2 = {"'Estou indo para Dungeon'","Falar sobre o irmão","voltar"};
                            input1 = JOptionPane.showOptionDialog(null ,"'Ham... saudações viajante, meu nome é Zepp, sou"
                                + "\no Capitão da Guarda de Lua Prata, minha terra natal. "
                                + "\nBem...O que você faz nesse navio?'",
                                nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options2, options2[0]);
                            switch(input1){
                                case 0: 
                                    JOptionPane.showOptionDialog(null ,"'Entendo... Eu também estou indo, mas diferente de "
                                        + "\noutros, não busco uma aventura... glórias"
                                        + "\nou riquezas apenas... JUSTIÇA...'",
                                        nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                                    break;
                                case 1:
                                    JOptionPane.showOptionDialog(null ,"......"
                                        + "\n'Meu irmão era um grande cavaleiro, na verdade o melhor"
                                        + "\nde nossa terra natal...Ele era conhecido como Cavaleiro"
                                        + "\nde Prata, que empunhava a Lamina Lunar...'",
                                        nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                                    break;    
                                default:
                                    break;
                            }
                        }  
                        }
                    }else{
                        JOptionPane.showOptionDialog(null ,"'Conversaremos amanhã.'",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                    }                    
                    break;
                case 1://Buscar Informções
                    if(cont_cavaleiro == 0){
                        JOptionPane.showOptionDialog(null ,"'Bem, amanhã de manhã quando o navio chegar a ilha,"
                            + "\n eu o acompanharei até a dungeon... mas ao chagar lá, é cada um por sí..."
                            + "\nNão é nada pessoal mas, é algo que tenho que fazer sozinho.'",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                        cont_cavaleiro = 1; //marca se o personagem já teve esse diálogo.
                    }else{
                        JOptionPane.showOptionDialog(null ,"'Amnhã nos encontramos no convés, até.'",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                    }        
                    break;  
                default:
                    break;
            }
        }
        return cont_cavaleiro;
    }
}