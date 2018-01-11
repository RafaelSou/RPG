package alpha;
import personagens.Jogador;

public class LevelUp {
    public void TesteXP(Jogador jogador, int X){
        jogador.setXP(jogador.getXP()+X);
        if((jogador.getXP() >= 500) && (jogador.getXP() < 1000) && (jogador.cont_Lv == 1)){
            jogador.cont_Lv++;
            jogador.UP();
            
        }else if((jogador.getXP() >= 1000) && (jogador.getXP() < 2000) && (jogador.cont_Lv == 2)){
            jogador.cont_Lv++;
            jogador.UP();
            
        }else if((jogador.getXP() >= 1000) && (jogador.getXP() < 2000) && (jogador.cont_Lv == 3)){
            jogador.cont_Lv++;
            jogador.UP();
        }
        
    }
    
    
}
