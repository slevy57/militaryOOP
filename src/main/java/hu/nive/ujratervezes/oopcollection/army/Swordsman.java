package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    private int health = 100;
    private int damage = 10;
    private boolean shield;

    public Swordsman(boolean shield){
        this.shield = shield;
    }

    public int doDamage(){
        return this.damage;
    }

    public int getHitPoints(){
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {


    }
}