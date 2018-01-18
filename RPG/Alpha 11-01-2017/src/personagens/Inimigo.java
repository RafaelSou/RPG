package personagens;

public abstract class Inimigo extends Personagem {
   private String nomeATQ; 

    public String getNomeATQ() {
        return nomeATQ;
    }

    public void setNomeATQ(String nomeATQ) {
        this.nomeATQ = nomeATQ;
    }
    
   public void aleatorio(Jogador X){
        int n = (int)(Math.random()*10);
        if((n % 2) != 0){
            this.atacar(X);
        }else {
            this.defender(X);
        }
    }   

   @Override
    public void atacar(Personagem X) {
        Jogador Y = (Jogador) X;
        System.out.println("-"+this.getNome()+" atacou "+Y.getNome()+" com "+this.getNomeATQ()+"!");
        Y.setHP(Y.getHP() - this.getAtaque()); 
        this.setCont_atq(1);
        Y.setCont_atq(1);
    }

    @Override
    public void defender(Personagem X) {
        Jogador Y = (Jogador) X;
        this.setCont_def(1);
        
        if(Y.getCont_atq() != 0){
            float aux;
            
            if(this.getDefesa() > Y.getAtaque()){ //Defesa de X > Defesa de Y
                aux = (this.getDefesa() - Y.getAtaque());
                System.out.println("-D>A:"+aux);//FLAG
                Y.setHP(Y.getHP() - aux);// causa a diferença de dano ao atacante.
                this.setHP(this.getHP() + Y.getAtaque()); //anula o ataque.
            }else if(this.getDefesa() == Y.getAtaque()){ //Defesa de X == Defesa de Y
                    aux = (this.getDefesa() - Y.getAtaque());
                    System.out.println("-D=A:"+aux);
                    this.setHP(this.getHP() + Y.getAtaque()); //anula o ataque.
            }else{ //Ataque de Y > Defesa de X
                aux = (Y.getAtaque() - this.getDefesa());
                System.out.println("-D<A:"+aux);
                this.setHP(this.getHP() + Y.getAtaque()); // anula o ataque.
                this.setHP(this.getHP() - aux); // subtrai a diferença.
            }
            System.out.println("-"+this.getNome()+" defendeu");
        }else if(Y.getCont_def() == 1)
            System.out.println("-Ambos defenderam-");
    }  
}
