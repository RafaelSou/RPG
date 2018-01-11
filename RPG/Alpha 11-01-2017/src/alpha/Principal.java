package alpha;

import item.Equipamento;
import item.FabricaDeEquip;
import personagens.Jogador;
import mapas.ControladorDeMapas;

public class Principal{
    public static void main(String[] args) {    
        CriarPersonagem P = new CriarPersonagem(); 
        Jogador jogador = P.cadastro();
        
        FabricaDeEquip F = new FabricaDeEquip();

        jogador.mochila.addEquip(F.item1());
        jogador.mochila.addEquip(F.item4());
        jogador.mochila.addEquip(F.item5());
        jogador.mochila.Imprimir();
         
        jogador.item = (Equipamento) jogador.mochila.rmvEquip("Machado");
        jogador.mochila.Imprimir();
        
        jogador.mochila.addEquip(F.item3());
        jogador.mochila.Imprimir();
       
        
        ControladorDeMapas M1 = new ControladorDeMapas();
        M1.Entrar(jogador);

        
    }     
}
