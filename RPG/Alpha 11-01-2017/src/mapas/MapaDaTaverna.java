 package mapas;
import interações.Cavaleiro;
import interações.Taverneiro;
import personagens.Jogador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MapaDaTaverna {
    private int input;
    private int cont_taverneiro, cont_cavaleiro; //cont_taverneiro marca se o dialogo sobre o irmão aconteceu.
    private final String lugar = "-Taverna, Bico de Pato-";
    
    public void iniciarTaverna(Jogador jogador){
        ImageIcon icon = new ImageIcon(jogador.getIcone());
        JOptionPane.showMessageDialog(null, "Devido a uma carta que recebeu de um antigo amigo, contendo relatos "
                + "\nsobre grandes TESOUROS e PERIGOS em uma certa Dungeon, na Ilha de Belford,"
                + "\nvocê decidiu partir em uma jornada ao encontro deste amigo. "
                + "\nE assim, você começa sua aventura onde incontáveis outras tiveram seu início,"
                + "\nem uma Taverna! E esta, diferente de outras, está localizada em um grande navio"
                + "\nque a muito tempo leva incontáveis aventureiros para à Gloria e para a Morte...", lugar, 0, icon);
        JOptionPane.showMessageDialog(null, "Você está encostado no balcão, apreciando a bebida,"
                + "\ne em meio aos diversos fregueses, alguns chamam sua atenção."
                + "\nNos fundos do salão, um Cavaleiro afía sua espada, com uma expressão de pesar"
                + "\nà esquerda, um grupo de camponeses conversam à mesa, com um certo tom de "
                + "\npreocupação e próximo a você, o taverneiro limpa o balção, com um olhar distante...", lugar, 0, icon);
        
        while(input != 3){
            String[] options = {"Falar com o Taverneiro", "Falar com os Camponeses",
                "Falar com o Cavaleiro","Sair da Taverna"};
        
            input = JOptionPane.showOptionDialog(null,"O que você vai fazer?", lugar,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon, options, options[0]);    
                     
            switch(input){
                case 0: //Falar com o Taberneiro
                    Taverneiro T = new Taverneiro();
                    cont_taverneiro = T.dialogoTaverna(jogador, cont_taverneiro);
                    break;
                case 1://Falar com os CamponesesNavio
                    
                    break;
                case 2://Falar com o Cavaleiro
                    Cavaleiro C = new Cavaleiro();
                    cont_cavaleiro = C.dialogoTaverna(jogador, cont_taverneiro,cont_cavaleiro);
                    break;
                case 3://Sair da Taverna
                    
                    break;    
                default:
                    break;
            }
        }
    }    
}
