package personagens;
import alpha.Mochila;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jogador extends Personagem{
    public Mochila mochila;

    public Jogador() {
        this.mochila = new Mochila();
    }
    
    public void atacar(Inimigo Y){
        if(this.item.cont_bonus == 0){
            this.item.bonus_ATQ = 0;
            this.item.bonus_DEF = 0;
        }else if(this.item.cont_bonus > 0){
            this.item.cont_bonus--;
        }
        
        System.out.println("+ FLAG BONUS:"+this.item.bonus_ATQ+"  TURNOS:"+this.item.cont_bonus); //FLAG BONUS E CONT.BONUS
        
        System.out.println("-"+this.nome+" atacou "+Y.nome+" com "+this.item.nome+"!");
        Y.HP -= (this.ataque + this.item.atq + this.item.bonus_ATQ); 
        this.cont_atq = Y.cont_atq = 1;
    }
    public void defender(Inimigo Y){
        this.cont_def = 1;
        
        if(Y.cont_atq != 0){
            float aux;
            
            if((this.defesa + this.item.def) > (Y.ataque + Y.item.atq)){ //Defesa de X > Defesa de Y
                aux = (this.defesa + this.item.def) - (Y.ataque + Y.item.atq);
                System.out.println("-D>A:"+aux);//FLAG
                Y.HP-=aux;// causa a diferença de dano ao atacante.
                this.HP+=(Y.ataque + Y.item.atq); //anula o ataque.
            }else if((this.defesa + this.item.def) == (Y.ataque + Y.item.atq)){ //Defesa de X == Defesa de Y
                    aux = (this.defesa + this.item.def) - (Y.ataque + Y.item.atq);
                    System.out.println("-D=A:"+aux);
                    this.HP+=(Y.ataque + Y.item.atq); //anula o ataque.
            }else{ //Ataque de Y > Defesa de X
                aux = (Y.ataque + Y.item.atq) - (this.defesa + this.item.def);
                System.out.println("-D<A:"+aux);
                this.HP+=(Y.ataque + Y.item.atq); // anula o ataque.
                this.HP = this.HP - aux; // subtrai a diferença.
            }
            
            System.out.println("-"+this.nome+" defendeu");
        }else if(Y.cont_def == 1)
            System.out.println("-Ambos defenderam-");
    } 
   
    public int fugir(Inimigo Y){ //X tenta figir de Y.
        int n = (int) (Math.random()*10);
        System.out.println(this.nome+" tenta fugir do combate!");
        if(this.agilidade > Y.agilidade){
            if((this.agilidade-Y.agilidade) >= n){
                System.out.println(this.nome+" teve sucesso em fugir!");
                return 1;
            }
        }
        System.out.println(this.nome+" Falhou em fugir!");
        Y.aleatorio(this); //caso o jogador não consiga fugir, ele pode ser atacado pelo oponente.
        return 0; 
    }
    
    public void UP(){
       this.Lv++;
       this.HP += 10;
       this.ataque += 10;
       this.defesa += 10;
       this.agilidade += 1;
       ImageIcon icon = new ImageIcon(this.icone);
       JOptionPane.showMessageDialog(null, this.nome+" upou para o Lv." +this.Lv
               + "\nHP +10 :" +this.HP
               + "\nATAQUE +10 :" +this.ataque
               + "\nDEFESA +10 :" +this.defesa
               + "\nAGILIDADE +1 :" +this.agilidade, this.nome+ " Lv." +this.Lv, 0, icon);
    }
    
    public void Curar(){
        
    }
}
