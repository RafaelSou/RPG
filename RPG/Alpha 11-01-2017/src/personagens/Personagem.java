package personagens;
import item.Equipamento;

public abstract class Personagem {
    
    public String nome;
    public String icone;
    public float HP;
    public float ataque;
    public float defesa; 
    public int agilidade;
    
    protected int XP;
    protected int Lv;
    public int cont_Lv;
    public int cont_def=0;
    public int cont_atq=0;
    
    public Equipamento item;
    
    
    
    public void atacar(Personagem Y){ //this ataca Y.
        
    }
    
    public void defender(Personagem Y){// this defende Y
        
    }
    
    public void equiparItem(Equipamento item){
         this.item = item;
    }
    
    public int getLV(){
        return this.Lv;
    }
    public void setLV(int lv){
        this.Lv = lv;
    }
    public int getXP(){
        return this.XP;
    }
    public void setXP(int xp){
        this.XP = xp;
    }
    
}
