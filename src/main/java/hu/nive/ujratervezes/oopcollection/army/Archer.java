package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    private int health = 50;
    private int damage = 20;
    private boolean shield;

    public int doDamage(){
        return this.damage;
    }

    public int getHitPoints(){
        return 0;
    }

    public void sufferDamage(int damage){

    }



}