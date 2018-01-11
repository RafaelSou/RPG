package personagens;
import item.FabricaDeEquip;

public class FabricaDeInimigo {
    Inimigo NPC = new Inimigo();
    FabricaDeEquip Item = new FabricaDeEquip();

    /**
     * @return Inimigo
     * @see nome->Demogorgon
     * @see HP->95
     * @see Atq->35
     * @see Def->35
     * @see Agl->2
     */
    public Inimigo Inimigo1(){
        NPC.HP = 90;
        NPC.ataque = 35;
        NPC.defesa = 15;
        NPC.agilidade = 2;
        NPC.nome = "Demogorgon";
        NPC.icone = "src/imagens/Skull.jpg";
        NPC.equiparItem(Item.item1());
        NPC.setXP(500);
        return NPC;
    }
    
    /**
     * @return Inimigo
     * @see nome->Krute
     * @see HP->60
     * @see Atq->50
     * @see Def->350
     * @see Agl->4
     */
    public Inimigo Inimigo2(){
        NPC.HP = 80;
        NPC.ataque = 50;
        NPC.defesa = 50;
        NPC.agilidade = 4;
        NPC.nome = "Krute";
        NPC.icone = "src/imagens/BolinhaDoAmanha.png";
        NPC.equiparItem(Item.item2());
        NPC.setXP(1000);
        return NPC;
    }
    
    /**
     * @return Inimigo
     * @see nome->Zunzunzun
     * @see HP->50
     * @see Atq->10
     * @see Def->10
     * @see Agl->10
     */
    public Inimigo Inimigo3(){
        NPC.HP = 50;
        NPC.ataque = 10;
        NPC.defesa = 10;
        NPC.agilidade = 10;
        NPC.nome = "Zunzunzun";
        NPC.icone = "src/imagens/Skull.jpg";
        NPC.equiparItem(Item.item3());
        NPC.setXP(250);
        return NPC;
    }
    
    /**
     * @return Inimigo
     * @see nome->Rei_Caveira
     * @see HP->60
     * @see Atq->60
     * @see Def->0
     * @see Agl->2
     */
    public Inimigo Inimigo4(){
        NPC.HP = 60;
        NPC.ataque = 60;
        NPC.defesa = 0;
        NPC.agilidade = 2;
        NPC.nome = "Rei Caveira";
        NPC.icone = "src/imagens/Skull.jpg";
        NPC.equiparItem(Item.item4());
        NPC.setXP(2000);
        return NPC;
    }
    
}
