package mapas;

import alpha.Combate;
import flyweight.FlyFactoryInimigo;
import interações.Armadilhas;
import personagens.Jogador;

public class ControladorDeMapas {
   
    public void Entrar(Jogador jogador){
        
        MapaDaTaverna MT = new MapaDaTaverna();
        MT.iniciarTaverna(jogador);

        MapaConves MC = new MapaConves();
        MC.iniciarConves(jogador);
        
        Armadilhas A = new Armadilhas();
        A.Flechas(jogador);
        A.Verme(jogador);
        
        Combate C = new Combate();
        C.VS(jogador, FlyFactoryInimigo.get("Zunzunzun"));
        C.VS(jogador, FlyFactoryInimigo.get("Chu"));
        C.VS(jogador, FlyFactoryInimigo.get("Krute"));       
    }   
}
