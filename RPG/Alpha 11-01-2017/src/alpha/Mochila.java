package alpha;

import itens.Item;
import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private final List<Item> lista;

    public Mochila() {
        this.lista = new ArrayList(10);
    }
    
    public void addItem(Item X){
        this.lista.add(X);
    }
    
    public Item rmvItem(String nome){
        for (int i = 0; i < this.lista.size(); i++) {
            if(nome == null ? this.lista.get(i).getNome() == null : nome.equals(this.lista.get(i).getNome())){
                return this.lista.remove(i);
            }	
        }
        return null;
    }
    
    public boolean searchItem(String nome){
        for (int i = 0; i < this.lista.size(); i++) {
            if(nome == null ? this.lista.get(i).getNome() == null : nome.equals(this.lista.get(i).getNome())){
                return true;
            }	
        }
        return false;
    }
    
    public void printList(){
        System.out.println("- INVENTÁRIO -");
        for (int i = 0; i < this.lista.size(); i++) {
            //System.out.println("[Slot "+i+"] "+ this.lista.get(i).toString());
            System.out.println("[Slot "+i+"] "+ this.lista.get(i).getNome());
        }
    }
}
