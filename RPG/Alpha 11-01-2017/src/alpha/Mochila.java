package alpha;

import item.Equipamento;
import item.Item;
import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private final List<Item> lista = new ArrayList(10);
    
    public void addEquip(Equipamento X){
        this.lista.add(X);
    }
    
    public Item rmvEquip(String nome){
        for (int i = 0; i < this.lista.size(); i++) {
            if(nome == null ? this.lista.get(i).nome == null : nome.equals(this.lista.get(i).nome)){
                return this.lista.remove(i);
            }	
        }
        return null;
    }
    
    public boolean searchEquip(String nome){
        for (int i = 0; i < this.lista.size(); i++) {
            if(nome == null ? this.lista.get(i).nome == null : nome.equals(this.lista.get(i).nome)){
                return true;
            }	
        }
        return false;
    }
    
    public void Imprimir(){
        System.out.println("- INVENTÁRIO -");
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println("[Slot "+i+"] "+ this.lista.get(i).nome);	
        }
    }
}
