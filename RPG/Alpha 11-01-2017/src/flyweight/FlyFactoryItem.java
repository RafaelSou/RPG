package flyweight;

import itens.Item;
import itens.armas.BolinhaDoAmanhã;
import itens.armas.CetroNecromante;
import itens.armas.EspadaCaveira;
import itens.armas.LançaCeleste;
import itens.armas.Machado;
import itens.armas.MarteloDoCiclope;
import java.util.HashMap;
import java.util.Map;

public class FlyFactoryItem {
    private static final Map<String, Item> item = new HashMap<>();
    
    static{
        item.put("Espada Caveira", new EspadaCaveira());
        item.put("Lança Celeste", new LançaCeleste());
        item.put("Martelo do Ciclope", new MarteloDoCiclope());
        item.put("Cetro Necromante", new CetroNecromante());
        item.put("Machado", new Machado());
        item.put("Bolinha do Amanhã", new BolinhaDoAmanhã());
    }
    
    public static Item get(String nome){
        return item.get(nome);
    }
}
