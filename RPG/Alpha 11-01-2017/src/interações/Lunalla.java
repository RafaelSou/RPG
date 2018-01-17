package interações;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personagens.Jogador;

public class Lunalla {
    private int input = 0;
    private final String nome = "Lunalla";
    
    public int dialogoConves(Jogador jogador, int cont){
        ImageIcon icon = new ImageIcon("src/imagens/Lunalla.png");
        if(cont == 0){
        JOptionPane.showMessageDialog(null, "... "
                + "\n'Eu estava ansiosa pelo nosso encontro... "+jogador.getNome()
                + ".\nSente-se, vamos conversar'.", nome, 0, icon);
        
        while(input != 1){
            String[] options = {"'Você me conhece?'", "voltar"};
            
            if(cont == 0){
            input = JOptionPane.showOptionDialog(null,"A moça misteriosa aguarda em silêncio...", "-Moça Misteriosa-",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]);    
            }else   input = JOptionPane.showOptionDialog(null,nome+" aguarda em silêncio...", nome,
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]);
                
            switch(input){
                case 0: //Saudações
                    if(cont == 0){
                        String[] options2 = {"'Como assim?'", "voltar"};
                        int input2 = JOptionPane.showOptionDialog(null,"'"+jogador.getNome()+", eu sou "+nome+", e você"
                                + "\nnão faz ideia de quantas luas esperei por você...'", "-"+nome+"-",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options2, options2[0]); 
                        switch(input2){
                            case 0:
                                JOptionPane.showMessageDialog(null, "'Bom... eu não posso falar muito agora..."
                                        + "\nMeu tempo aqui já está acabando, na verdade"
                                        + "\neu só queria ver você antes fosse para a ilha."
                                        + "\nAh sim, só mais uma coisa, quando a hora chegar,"
                                        + "\nvocê terá que fazer uma escolha... e lembre-se, nem sempre"
                                        + "\no caminho fácil é o correto...'", nome, 0, icon);
                                cont=1;
                                break;
                            default:
                                break;
                        }
                    }else JOptionPane.showMessageDialog(null, "'Boa sorte... "
                            + "\ne espero que possa ver você de novo'.", nome, 0, icon);
                            input=1;
                    break;
                default:    
                    break;
            }  
        }
        }else JOptionPane.showMessageDialog(null, "Você olha na direção em que ela estava..."
                + "\nMas ela sumiu...", nome, 0, icon);
        return cont;
    }
}
