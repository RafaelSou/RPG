package itens.armas;

import itens.Arma;

public class LançaCeleste extends Arma{
    public LançaCeleste(){
        this.nome="Lança Celeste";
        this.icon="src/imagens/lança.png";
        this.atq=9; 
        this.def=12;
        this.BonusAtq=0;
        this.BonusDef=0;
        this.RodadasBonus=0;
    }
}
