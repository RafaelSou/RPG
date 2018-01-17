package alpha;

import personagens.Jogador;

public class TesteLevelUp {
    public void TesteXP(Jogador jogador, int X){
        jogador.setXP(jogador.getXP()+X);
        
        if((jogador.getXP() >= 500) && (jogador.getXP() < 1000) && (jogador.getLv() == 1)){
            jogador.UP();    
        }else if((jogador.getXP() >= 1000) && (jogador.getXP() < 2000) && (jogador.getLv() == 2)){
            jogador.UP();
            
        }else if((jogador.getXP() >= 1000) && (jogador.getXP() < 2000) && (jogador.getLv() == 3)){
            jogador.UP();
        }
        else if((jogador.getXP() >= 2000) && (jogador.getXP() < 3500) && (jogador.getLv() == 4)){
            jogador.UP();
        }
        else if((jogador.getXP() >= 3500) && (jogador.getLv() == 5)){
            jogador.UP();
        }   
    } 
}
