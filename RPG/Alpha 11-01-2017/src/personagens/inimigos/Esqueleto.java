package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Esqueleto extends Inimigo{
    public Esqueleto(){
        this.setIcone("src/imagens/Skull.jpg");
        this.setNome("Esqueleto");
        this.setItem((Arma)FlyFactoryItem.get("Espada Caveira"));
        this.setNomeATQ(this.item.getNome());
        this.setHP(90);
        this.setAuxHP(90);
        this.setAtaque(35 + this.item.getAtq());
        this.setDefesa(15 + this.item.getDef());
        this.setAgilidade(2);
        this.setXP(500);
    }
}
