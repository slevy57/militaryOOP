package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private int health = 150;
    private int damage = 50;
    private boolean shield = true;


    public int doDamage(){
        return this.damage;
    }

    public int getHitPoints(){
        return 0;
    }

    @Override
    public void sufferDamage(int damage) {

    }
}