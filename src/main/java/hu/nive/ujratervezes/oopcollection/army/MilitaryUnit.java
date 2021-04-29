package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int health;
    private int damage;
    private boolean shield;

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);

}
