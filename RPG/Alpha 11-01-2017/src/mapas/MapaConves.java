package mapas;
import javax.swing.JOptionPane;
import personagens.FabricaDeInimigo;
import personagens.Jogador;

public class MapaConves {
    String Navio = "-Navio, Oro Jackson-";
    
    public void iniciarConves(Jogador jogador){
    FabricaDeInimigo NPC = new FabricaDeInimigo();    
        
    String[] options = {"Direita", "Esquerda"};
        int input = JOptionPane.showOptionDialog(null,"Saindo da taverna, você observa o convés do Navio,"
                + "\niluminadopor lamparinas e pelo luar. Tomando à direita,"
                + "\nvocê vai seguir para sua cabine, Já na esquerda,"
                + "\nhá uma senhora sentada em frente a uma esfera com um brilho"
                + "\ncor de esmeralda... ela parece proferir algum tipo de encantamento...", Navio,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]); 
       
        switch(input){
                case 0: //
                    
                    break;
                case 1://
                    
                    break;    
                default:
                    break;
            }
    }    
}
