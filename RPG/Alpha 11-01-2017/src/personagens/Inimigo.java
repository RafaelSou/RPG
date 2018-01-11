package personagens;

public class Inimigo extends Personagem {
    public void atacar(Jogador Y){
        System.out.println("-"+this.nome+" atacou "+Y.nome+" com "+this.item.nome+"!");
        Y.HP -= (this.ataque + this.item.atq); 
        this.cont_atq = Y.cont_atq = 1;
    }
    public void defender(Jogador Y){
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
    
   public void aleatorio(Jogador X){
        int n = (int)(Math.random()*10);
        if((n % 2) != 0){
            this.atacar(X);
        }else {
            this.defender(X);
        }
    }   
}
