package personagens;

import alpha.Mochila;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jogador extends Personagem{
    public Mochila mochila;
    private int Lv;
    private float auxHP;
    
    public Jogador() {
        this.Lv = 1;
        this.mochila = new Mochila();
    }

    @Override
    public void atacar(Personagem X) { Inimigo Y = (Inimigo)X;
        if(this.item.getRodadasBonus() == 0){
            this.item.setBonusAtq(0);
            this.item.setBonusDef(0);
        }else if(this.item.getRodadasBonus() > 0){
            this.item.setRodadasBonus(this.item.getRodadasBonus() - 1);
        }
        
        System.out.println("+ FLAG BONUS:"+this.item.getBonusAtq()+"  TURNOS:"+this.item.getRodadasBonus()); //FLAG BONUS E CONT.BONUS
        
        System.out.println("-"+this.getNome()+" atacou "+Y.getNome()+" com "+this.item.getNome()+"!");
        Y.setHP(Y.getHP() - (this.getAtaque() + this.item.getAtq() + this.item.getBonusAtq())); 
        this.setCont_atq(1);
        Y.setCont_atq(1);
    }

    @Override
    public void defender(Personagem X) { Inimigo Y = (Inimigo)X;
        this.setCont_def(1);
        
        if(Y.getCont_atq() != 0){
            float aux;
            
            if((this.getDefesa() + this.item.getDef()) > (Y.getAtaque() + Y.item.getAtq())){ //Defesa de X > Defesa de Y
                aux = (this.getDefesa() + this.item.getDef()) - (Y.getAtaque() + Y.item.getAtq());
                System.out.println("-D>A:"+aux);//FLAG
                Y.setHP(Y.getHP() - aux);// causa a diferença de dano ao atacante.
                this.setHP(this.getHP() + (Y.getAtaque() + Y.item.getAtq())); //anula o ataque.
            }else if((this.getDefesa() + this.item.getDef()) == (Y.getAtaque() + Y.item.getAtq())){ //Defesa de X == Defesa de Y
                    aux = (this.getDefesa() + this.item.getDef()) - (Y.getAtaque() + Y.item.getAtq());
                    System.out.println("-D=A:"+aux);
                    this.setHP(this.getHP() + (Y.getAtaque() + Y.item.getAtq())); //anula o ataque.
            }else{ //Ataque de Y > Defesa de X
                aux = (Y.getAtaque() + Y.item.getAtq()) - (this.getDefesa() + this.item.getDef());
                System.out.println("-D<A:"+aux);
                this.setHP(this.getHP() + (Y.getAtaque() + Y.item.getAtq())); // anula o ataque.
                this.setHP(this.getHP() - aux); // subtrai a diferença.
            }
            
            System.out.println("-"+this.getNome()+" defendeu");
        }else if(Y.getCont_def() == 1)
            System.out.println("-Ambos defenderam-");
    }
    
    public int fugir(Inimigo Y){ //X tenta figir de Y.
        int n = (int) (Math.random()*10);
        System.out.println(this.getNome()+" tenta fugir do combate!");
        if(this.getAgilidade() > Y.getAgilidade()){
            if((this.getAgilidade() - Y.getAgilidade()) >= n){
                System.out.println(this.getNome()+" teve sucesso em fugir!");
                return 1;
            }
        }
        System.out.println(this.getNome()+" Falhou em fugir!");
        Y.aleatorio(this); //caso o jogador não consiga fugir, ele pode ser atacado pelo oponente.
        return 0; 
    }
    
    public void UP(){
       this.setLv(this.getLv() + 1);
       this.setHP(this.getHP() + 10);
       this.auxHP += 10;
       this.setAtaque(this.getAtaque() + 10);
       this.setDefesa(this.getDefesa() + 10);
       this.setAgilidade(this.getAgilidade() + 1);
       ImageIcon icon = new ImageIcon(this.getIcone());
       JOptionPane.showMessageDialog(null, this.getNome()+" upou para o Lv." +this.getLv()
               + "\nHP +10 :" +this.getHP()
               + "\nATAQUE +10 :" +this.getAtaque()
               + "\nDEFESA +10 :" +this.getDefesa()
               + "\nAGILIDADE +1 :" +this.getAgilidade(), this.getNome()+ " Lv." +this.getLv(), 0, icon);
    }
    
    public float getAuxHP() {
        return auxHP;
    }

    public void setAuxHP(float auxHP) {
        this.auxHP = auxHP;
    }
    
    public int getLv() {
        return this.Lv;
    }
    
    private void setLv(int lv){
        this.Lv = lv;
    }
}
