package OOP.Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;

    private String weapon;

    private int hitPoints;

    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {

        List<String> list = new ArrayList<String>();
        list.add(0, this.getName());
        list.add(1,  "" + this.getHitPoints());
        list.add(2, "" + this.getStrength());
        list.add(3, this.getWeapon());

        return list;
    }

    @Override
    public void read(List<String> list) {

        if(list != null && list.size() > 0){
            this.name = list.get(0);
            this.weapon = list.get(1);
            this.hitPoints = Integer.parseInt(list.get(2));
            this.strength = Integer.parseInt(list.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
