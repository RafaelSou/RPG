package itens;

import personagens.Jogador;

public class Artefato extends Item{
    private int BonusVida;
    
    public void efeito(Jogador jogador){
        jogador.setHP(jogador.getHP() + this.BonusVida);
        if(jogador.getHP() > jogador.getAuxHP()){
            jogador.setHP(jogador.getAuxHP());
        }
        jogador.item.setBonusAtq(jogador.item.getBonusAtq() + this.getBonusAtq());
        jogador.item.setBonusDef(jogador.item.getBonusDef() + this.getBonusDef());
        jogador.item.setRodadasBonus(this.getRodadasBonus());
    }
}
