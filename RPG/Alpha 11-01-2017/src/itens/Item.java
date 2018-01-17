package itens;

public abstract class Item {
    protected String nome, icon;
    protected int BonusAtq, BonusDef, RodadasBonus;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getBonusAtq() {
        return BonusAtq;
    }

    public void setBonusAtq(int BonusAtq) {
        this.BonusAtq = BonusAtq;
    }

    public int getBonusDef() {
        return BonusDef;
    }

    public void setBonusDef(int BonusDef) {
        this.BonusDef = BonusDef;
    }

    public int getRodadasBonus() {
        return RodadasBonus;
    }

    public void setRodadasBonus(int RodadasBonus) {
        this.RodadasBonus = RodadasBonus;
    }
    
    
}
