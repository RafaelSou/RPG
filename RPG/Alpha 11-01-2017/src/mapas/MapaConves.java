package mapas;
import interações.Lunalla;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personagens.Jogador;

public class MapaConves {
    private final String Navio = "-Navio, Oro Jackson-";
    private int input,cont_Lunalla;
    
    public void iniciarConves(Jogador jogador){
    ImageIcon icon = new ImageIcon(jogador.getIcone());
    JOptionPane.showMessageDialog(null, "Saindo da taverna, você observa o convés do Navio,"
                + "\niluminadopor lamparinas e pelo luar. Tomando à direita,"
                + "\nvocê vai seguir para sua cabine, Já na esquerda,"
                + "\nhá uma figura sentada em frente a uma esfera com um brilho"
                + "\ncor de Luar... ela parece proferir algum tipo de encantamento...", Navio, 0, icon);
    
    while(input != 1){
        String[] options = {"Direita", "Esquerda"};
        input = JOptionPane.showOptionDialog(null,"Para que lado você vai?", Navio,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,icon, options, options[0]); 
       
        switch(input){
            case 0: //
                Lunalla L = new Lunalla();
                cont_Lunalla = L.dialogoConves(jogador, cont_Lunalla);
                break;   
            default:
                break;
        }
    }    
    }    
}
