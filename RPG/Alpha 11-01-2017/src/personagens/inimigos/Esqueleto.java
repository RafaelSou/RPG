package personagens.inimigos;

import flyweight.FlyFactoryItem;
import itens.Arma;
import personagens.Inimigo;

public class Esqueleto extends Inimigo{
    public Esqueleto(){
        this.setIcone("src/imagens/Skull.jpg");
        this.setNome("Esqueleto");
        this.setHP(90);
        this.setAtaque(35);
        this.setDefesa(15);
        this.setAgilidade(2);
        this.setItem((Arma)FlyFactoryItem.get("Espada de Madeira"));
        this.setXP(500);
    }
}
