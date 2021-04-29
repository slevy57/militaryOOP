package hu.nive.ujratervezes.oopcollection.army;

import java.util.List;

public class Army {

    private List<MilitaryUnit> units;

    public void addUnit(MilitaryUnit militaryUnit){
        units.add(militaryUnit);
    }

    public int getArmySize(){
        return units.size();
    }

    public void damageAll(int damage){

    }

    public int getArmyDamage(){
        return 0;
    }


}