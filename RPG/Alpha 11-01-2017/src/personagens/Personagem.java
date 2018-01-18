package personagens;

import itens.Arma;

public abstract class Personagem {
    
    private String nome;
    private String icone;
    private float HP;
    private float auxHP;
    private float ataque;
    private float defesa; 
    private int agilidade;
    
    private int XP;
    private int cont_def;
    private int cont_atq;
    public Arma item;
    
    public abstract void atacar(Personagem X);
    
    public abstract void defender(Personagem X);

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getXP() {
        return this.XP;
    }
    
    public void setXP(int xp) {
        this.XP = xp;
    }
    
    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public float getHP() {
        return HP;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }
    
    public float getAuxHP() {
        return auxHP;
    }

    public void setAuxHP(float auxHP) {
        this.auxHP = auxHP;
    }

    public int getCont_atq() {
        return cont_atq;
    }

    public void setCont_atq(int cont_atq) {
        this.cont_atq = cont_atq;
    }

    public int getCont_def() {
        return cont_def;
    }

    public void setCont_def(int cont_def) {
        this.cont_def = cont_def;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public Arma getItem() {
        return item;
    }

    public void setItem(Arma item) {
        this.item = item;
    }
}
