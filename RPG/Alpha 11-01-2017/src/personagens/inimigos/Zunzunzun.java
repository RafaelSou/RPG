package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Zunzunzun extends Inimigo{
    public Zunzunzun(){
        this.setIcone("src/imagens/Krute.png");
        this.setNome("Zunzunzun");
        this.setHP(50);
        this.setAtaque(10);
        this.setDefesa(10);
        this.setAgilidade(10);
        this.setItem((Arma)FlyFactoryItem.get("Lança Celeste"));
        this.setXP(500);
    }
}
