package mapas;

import alpha.Combate2;
import interações.Armadilhas;
import personagens.FabricaDeInimigo;
import personagens.Jogador;

public class ControladorDeMapas {
    FabricaDeInimigo NPC = new FabricaDeInimigo();
    
    public void Entrar(Jogador jogador){
        
        MapaDaTaverna MT = new MapaDaTaverna();
        MT.iniciarTaverna(jogador);

        MapaConves MC = new MapaConves();
        MC.iniciarConves(jogador);
        
        Armadilhas A = new Armadilhas();
        A.Flechas(jogador);
        A.Verme(jogador);
        
        Combate2 C = new Combate2();
        C.VS(jogador, NPC.Inimigo3());
        C.VS(jogador, NPC.Inimigo4());
        C.VS(jogador, NPC.Inimigo2());       
    }   
}
