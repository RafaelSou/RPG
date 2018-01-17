package flyweight;

import java.util.HashMap;
import java.util.Map;
import personagens.Inimigo;
import personagens.inimigos.Esqueleto;
import personagens.inimigos.Krute;
import personagens.inimigos.Chu;
import personagens.inimigos.Zunzunzun;

public class FlyFactoryInimigo {
    private static final Map<String, Inimigo> inimigo = new HashMap<>();
    
    static{
        inimigo.put("Krute", new Krute());
        inimigo.put("Esqueleto", new Esqueleto());
        inimigo.put("Zunzunzun", new Zunzunzun());
        inimigo.put("Chu", new Chu());
    }
   
    public static Inimigo get(String nome){
        return inimigo.get(nome);
    }
}
