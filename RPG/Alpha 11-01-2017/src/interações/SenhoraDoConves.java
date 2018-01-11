package interações;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personagens.Jogador;

public class SenhoraDoConves {
    int input = 0;
    String nome = "";
    
    public int dialogoConves(Jogador jogador, int cont){
        ImageIcon icon = new ImageIcon("src/imagens/taverneiro.png");
        
        while(input != 2){
            String[] options = {"Perguntar sobre o Cavaleiro.", "Buscar informação.", "voltar."};
        
            input = JOptionPane.showOptionDialog(null,"HA! Como vai, posso ajuda-lo em alguma coisa?", nome,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]);    
  
            switch(input){
                case 0: //Perguntar sobre o cavaleiro.
                    if(cont == 0){
                        String[] options2 = {"Falar sobre a carta.","Voltar."};
                        int input2 = JOptionPane.showOptionDialog(null ,"''",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options2, options2[0]);
                        cont = 1; //marca se o personagem já teve o diálogo sobre o irmão.        
                        switch(input2){
                            case 0: //Buscar informações.
                                JOptionPane.showOptionDialog(null ,"''",
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
                        int input3 = JOptionPane.showOptionDialog(null ,"''",
                            nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options3, options3[0]);        
                        switch(input3){
                            case 0: //Buscar informações.
                                JOptionPane.showOptionDialog(null ,"''",
                                    nome, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, null, null);
                                break;  
                            default:
                                break;
                        }
                    }else{
                        JOptionPane.showOptionDialog(null ,"''",
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
