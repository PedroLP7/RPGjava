package rol;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Character {
    private int idCharacter;
    private String name;
    private int hp;
    private int mana;
    private String genero;
    private double dinero;
    private int strenght;
    private int inteligence;
    private int dexterity;
    private int defense;
    private int Mdefense;
    private int speed;
    private int xposition;
    private int yposition;
    private ArrayList<Item> bag;
    private JLabel sprite;



    public Character(int idCharacter, String name, int hp, int mana, String genero, double dinero, int strenght, int inteligence, int dexterity,
                     int defense, int mdefense, int speed, int xposition, int yposition, ArrayList<Item> bag) {
        this.idCharacter = idCharacter;
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.genero = genero;
        this.dinero = dinero;
        this.strenght = strenght;
        this.inteligence = inteligence;
        this.dexterity = dexterity;
        this.defense = defense;
        Mdefense = mdefense;
        this.speed = speed;
        this.xposition = xposition;
        this.yposition = yposition;
        this.bag = bag;
    }

    public static ArrayList<Item> itemlist() {
        ArrayList<Item> bag = new ArrayList<>();


        return bag;
    }

    public int getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(int idCharacter) {
        this.idCharacter = idCharacter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMdefense() {
        return Mdefense;
    }

    public void setMdefense(int mdefense) {
        Mdefense = mdefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getXposition() {
        return xposition;
    }

    public void setXposition(int xposition) {
        this.xposition = xposition;
    }

    public int getYposition() {
        return yposition;
    }

    public void setYposition(int yposition) {
        this.yposition = yposition;
    }

    public ArrayList<Item> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Item> bag) {
        this.bag = bag;
    }

    @Override
    public String toString() {
        return "Character{" +
                "idCharacter=" + idCharacter +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", genero='" + genero + '\'' +
                ", dinero=" + dinero +
                ", strenght=" + strenght +
                ", inteligence=" + inteligence +
                ", dexterity=" + dexterity +
                ", defense=" + defense +
                ", Mdefense=" + Mdefense +
                ", speed=" + speed +
                ", xposition=" + xposition +
                ", yposition=" + yposition +
                ", bag=" + bag +
                '}';
    }

    public static void cleanSprite(JLabel character, JLabel characterUp, JLabel characterdown, JLabel characterleft) {
        character.setVisible(false);
        characterUp.setVisible(false);
        characterleft.setVisible(false);
        characterdown.setVisible(false);

    }

   public abstract int moveUp(JLabel characterUp, int speed, JLabel warrior,JLabel warriorDown,JLabel warriorRight,JLabel warriorLeft);
   public abstract int  moveDown(JLabel characterdown, int speed, JLabel warrior,JLabel warriorUp,JLabel warriorRight,JLabel warriorLeft);
    public abstract  int moveRight(JLabel characterRight,int speed ,JLabel warrior,JLabel warriorDown,JLabel warriorLeft,JLabel warriorUp);
    public abstract  int moveLeft(JLabel characterLeft,int speed ,JLabel warrior,JLabel warriorDown,JLabel warriorRight,JLabel warriorUp);





}
