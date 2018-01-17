package interações;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import personagens.Jogador;

public class Armadilhas {
    private int Dano;
    
    public void Flechas(Jogador x){
        String nome = "-Rajada de Flechas!-";
        Dano = 5;
        
        ImageIcon icon = new ImageIcon("src/imagens/flechas.png");
        JOptionPane.showMessageDialog(null, "Enquanto andava, você pisa em algo que se move, então sente "
                + "\ndiversos mecanismos serem ativados abaixo de seus pés!!!"
                + "\nUma grande saraivada de Flexas é disparada em sua direção!!!", "-???-", 0, icon);
        
        int n = (int)(Math.random()*10);
        System.out.println("FLAG Armadilha:"+n);
        if(n > x.getAgilidade()){
            JOptionPane.showMessageDialog(null, "Você caiu na armadilha e levou "+Dano+" de Dano!!!", nome, 0, icon);
            x.setHP(x.getHP() - Dano);
        }else {
            JOptionPane.showMessageDialog(null, "Você conseguiu desviar da armadilha!", nome, 0, icon);
        }
    }
    
    public void Verme(Jogador x){
        Dano = 10;
        String nome = "-Emboscada!-";
        
        ImageIcon icon = new ImageIcon("src/imagens/verme.png");
        JOptionPane.showMessageDialog(null, "Após a batalha, você sente a presença de alguma coisa..."
                + "\nE saindo do chão!!! grandes tentáculos tentam agarra-lo!!! ", "-???-", 0, icon);
        
        int n = (int)(Math.random()*10);
        System.out.println("FLAG Tentáculos:"+n);
        if(n > x.getAgilidade()){
            JOptionPane.showMessageDialog(null, "O verme morde você"
                    + "\ne causa "+Dano+" de Dano!!!", nome, 0, icon);
            x.setHP(x.getHP() - Dano);
        }else {
            JOptionPane.showMessageDialog(null, "Você conseguiu desviar e cortar os tentáculos!!!"
                    + "\nCom isso, o veneno fica empregnado em sua arma!"
                    + "\nBONUS (+5 Ataque) por 3 turnos de combate.", nome, 0, icon);
            x.item.setBonusAtq(x.item.getBonusAtq() + 5);
            x.item.setRodadasBonus(x.item.getRodadasBonus() + 3);
        }
    }    
}
