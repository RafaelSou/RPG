package interações;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import personagens.Jogador;

public class Taverneiro {
    int input = 0;
    String nome = "Bill, o Taverneiro";
    
    public int dialogoTaverna(Jogador jogador, int cont){
        ImageIcon icon = new ImageIcon("src/imagens/taverneiro2.png");
        
        while(input != 2){
            String[] options = {"Saudações", "Buscar informação.", "voltar."};
        
            input = JOptionPane.showOptionDialog(null,"HA! Como vai, posso ajuda-lo em alguma coisa?", nome,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]);    
  
            switch(input){
                case 0: //Perguntar sobre o cavaleiro.
                    if(cont == 0){
                        String[] options2 = {"Falar sobre a carta.","Voltar."};
                        int input2 = JOptionPane.showOptionDialog(null ,"'Ah.. Aquele cavaleiro é meu filho Zepp, "
                            + "\nele está de partida para aquelas Ilha maldita!'"
                            + "\nCOF!!COF!!"
                            + "\n'Desculpe, mas... é que meu outro filho... "
                            + "\numa vez também partiu e nunca mais retornou..."
                            + "\nSó estou preocupado.'",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options2, options2[0]);
                        cont = 1; //marca se o personagem já teve o diálogo sobre o irmão.        
                        switch(input2){
                            case 0: //Buscar informações.
                                JOptionPane.showOptionDialog(null ,"'Entendo... "
                                    + "\nVocê também vai..."
                                    + "\nBom, tudo que posso fazer é desejar boa sorte..."
                                    + "\nAh! você pode falar com meu filho, quem sabe"
                                    + "\nele não pode ajuda-lo.'",
                                    nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                                break;  
                            default:
                                break;
                        }
                    }else{
                        JOptionPane.showOptionDialog(null ,"Fale com meu filho,"
                                + "\n talvez ele possa ajuda-lo'",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                    }     
                    break;
                case 1://Falar direto sobre a carta.
                    if(cont == 0){
                        String[] options3 = {"Falar sobre a carta.","Voltar."};
                        int input3 = JOptionPane.showOptionDialog(null ,"Entendo... Você vai para aquele lugar maldito..."
                            + "\nSe eu puder te dar um conselho, não se arrisque por aquelas bandas... ",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options3, options3[0]);        
                        switch(input3){
                            case 0: //Buscar informações.
                                JOptionPane.showOptionDialog(null ,"Hum...então você vai recusar meu conselho..."
                                    + "\nBom..."
                                    + "\nEsta vendo o Cavaleiro nos fundos? tente falar com ele, "
                                    + "\nele também está de partida para Belford.",
                                    nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                                break;  
                            default:
                                break;
                        }
                    }else{
                        JOptionPane.showOptionDialog(null ,"'HA! Como eu disse... "
                                + "\nFale com Zepp, "
                                + "\ntalvez ele possa ajuda-lo'",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                    }        
                    break;  
                default:
                    break;
            }  
        }
        return cont;
    }
}
