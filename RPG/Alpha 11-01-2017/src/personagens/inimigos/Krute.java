package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Krute extends Inimigo {
    public Krute(){
        this.setIcone("src/imagens/Krute.png");
        this.setNome("Krute");
        this.setHP(80);
        this.setAtaque(50);
        this.setDefesa(25);
        this.setAgilidade(4);
        this.setItem((Arma)FlyFactoryItem.get("Bolinha do Amanhã"));
        this.setXP(1000);
    }
}
