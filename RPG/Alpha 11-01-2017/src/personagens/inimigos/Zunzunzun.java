package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Zunzunzun extends Inimigo{
    public Zunzunzun(){
        this.setIcone("src/imagens/taverneiro2.png");
        this.setNome("Zunzunzun");
        this.setItem((Arma)FlyFactoryItem.get("Lança Celeste"));
        this.setNomeATQ("Garra de Fogo");
        this.setHP(50);
        this.setAuxHP(50);
        this.setAtaque(10 + this.item.getAtq());
        this.setDefesa(10 + this.item.getDef());
        this.setAgilidade(10);
        this.setXP(500);
    }
}
