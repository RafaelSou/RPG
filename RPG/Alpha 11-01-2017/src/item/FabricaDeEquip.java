package item;

/**
 *
 * @author rafael
 */
public class FabricaDeEquip {
    Equipamento E1 = new Equipamento();
    Equipamento E2 = new Equipamento();
    Equipamento E3 = new Equipamento();
    Equipamento E4 = new Equipamento();
    Equipamento E5 = new Equipamento();
    
    
    /**
     *
     * @return ItemDeCombate:
     * @see nome_Espada_Caveira
     * @see ataque_12
     * @see defesa_04
     * @see peso_11
     */
    public Equipamento item1(){
        E1.nome = "Espada Caveira";
        E1.icon = "src/imagens/espada.png";
        E1.atq = 12;
        E1.def = 4;
        E1.peso = 2;
        return E1;
    }
    
    /**
     *
     * @return ItemDeCombate:
     * @see nome_Lança_Celeste
     * @see ataque_12
     * @see defesa_03
     * @see peso_12
     */
    public Equipamento  item2(){
        E2.nome = "Lança Celeste";
        E2.icon = "src/imagens/lança.png";
        E2.atq = 9;
        E2.def = 9;
        E2.peso = 3;
        return E2;
    }
    
    /**
     *
     * @return ItemDeCombate:
     * @see nome_Martelo_do_Ciclope
     * @see ataque_13
     * @see defesa_01
     * @see peso_5
     */
    public Equipamento  item3(){
        E3.nome = "Martelo do Ciclope";
        E3.icon = "src/imagens/martelo.png";
        E3.atq = 15;
        E3.def = 1;
        E3.peso = 5;
        return E3;
    }
    
    /**
     *
     * @return ItemDeCombate:
     * @see nome_Cetro_Necromante
     * @see ataque_4
     * @see defesa_14
     * @see peso_14
     */
    public Equipamento  item4(){
        E4.nome = "Cetro de Necromante";
        E4.icon = "src/imagens/cetro.png";
        E4.atq = -3;
        E4.def = 15;
        E4.peso = 4;
        return E4;
    }
    
    /**
     *
     * @return ItemDeCombate:
     * @see nome_Machado_Afiado
     * @see ataque_18
     * @see defesa_-5
     * @see peso_5
     */
    public Equipamento  item5(){
        E5.nome = "Machado";
        E5.icon = "src/imagens/machado.png";
        E5.atq = 20;
        E5.def = -10;
        E5.peso = 6;
        return E5;
    }
}
