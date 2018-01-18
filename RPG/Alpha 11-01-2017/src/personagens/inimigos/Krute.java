package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Krute extends Inimigo {
    public Krute(){
        this.setIcone("src/imagens/Krute.png");
        this.setNome("Krute");
        this.setItem((Arma)FlyFactoryItem.get("Bolinha do Amanhã"));
        this.setNomeATQ(this.item.getNome());
        this.setHP(80);
        this.setAuxHP(80);
        this.setAtaque(50 + this.item.getAtq());
        this.setDefesa(25 + this.item.getDef());
        this.setAgilidade(4);
        this.setXP(1000);
    }
}
