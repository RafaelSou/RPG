package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Chu extends Inimigo{
    public Chu(){
        this.setIcone("src/imagens/Chu.png");
        this.setNome("Chu");
        this.setItem((Arma)FlyFactoryItem.get("Cetro Necromante"));
        this.setNomeATQ(this.item.getNome());
        this.setHP(60);
        this.setAuxHP(60);
        this.setAtaque(60 + this.item.getAtq());
        this.setDefesa(0 + this.item.getDef());
        this.setAgilidade(4);
        this.setXP(2000);
    }
}
