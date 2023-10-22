package rol;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/** CLASE QUE HEREDA DE PERSONAJE  **/
public class Warrior extends Character {

/**
 *@warriorUp
 * LABELS DE LOS PERSONSJES**/
    private JLabel warriorUp;
    private JLabel warriorLeft;
    private JLabel warrior;
    private JLabel warriorRight;
    private JLabel warriorDown;

    public Warrior(int idCharacter, String name, int hp, int mana, String genero, double dinero, int strenght, int inteligence, int dexterity, int defense, int mdefense, int speed, int xposition, int yposition, ArrayList<Item> bag) {
        super(idCharacter, name, hp, mana, genero, dinero, strenght, inteligence, dexterity, defense, mdefense, speed, xposition, yposition, bag);
    }

/** MOVIMIENTO HACIA ABAJO**/
    @Override
    public int moveDown(JLabel characterdown, int speed, JLabel warrior, JLabel warriorUp, JLabel warriorRight, JLabel warriorLeft) {

        int x = warrior.getX();
        int y = warrior.getY() + speed;


        //  y +=speed;


       // warrior.setLocation(x, y);

        //   warriorDown.setLocation(warrior.getX(), y); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(warriorUp, warriorLeft, warriorRight, warrior);
        characterdown.setVisible(true); // mostrar el label showwarriordown
        characterdown.setLocation(warrior.getX(), y);

        return y;
    }

/**este metodo hace que se mueva hacia arriba
 * @param warrior label principal del warrior
 * @param characterUp sprite del persnaje hacia arriba

 * @return devuelve la x nueva al main para que se mueva el sprite
 *
 * **/
    @Override
    public int moveUp(JLabel characterUp, int speed, JLabel warrior, JLabel warriorDown, JLabel warriorRight, JLabel warriorLeft) {

        int x = warrior.getX();
        int y = warrior.getY() - speed;


        //  y +=speed;


     //   warrior.setLocation(x, y);

        //   warriorDown.setLocation(warrior.getX(), y); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(warriorDown, warriorLeft, warriorRight, warrior);
        characterUp.setVisible(true); // mostrar el label showwarriordown
        characterUp.setLocation(warrior.getX(), y);

        return y;
    }


    @Override
    public int moveLeft(JLabel characterLeft, int speed, JLabel warrior, JLabel warriorDown, JLabel warriorRight, JLabel warriorUp) {
        int x = warrior.getX() - speed;
        int y = warrior.getY();

        //  warriorLeft.setLocation(x, warrior.getY()); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(warriorUp, warriorRight, warriorDown, warrior);
        characterLeft.setVisible(true); // mostrar el label showwarriordown
        characterLeft.setLocation(x, warrior.getY());
        return x;

    }


    @Override
    public int moveRight(JLabel characterRight, int speed, JLabel warrior, JLabel warriorDown, JLabel warriorLeft, JLabel warriorUp) {
    //public int moveRight(String img, int speed, JLabel warrior) {
        int x = warrior.getX() + speed;
        int y = warrior.getY();

         warriorLeft.setLocation(x, warrior.getY()); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(warriorUp, warriorLeft, warriorDown, warrior);
        characterRight.setVisible(true); // mostrar el label showwarriordown
        characterRight.setLocation(x, y);

        //ImageIcon imageicon = new ImageIcon(img);
     //   Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(warrior.getWidth(), warrior.getHeight(), Image.SCALE_DEFAULT));

        //warrior.setIcon(icon);
        return x;

    }

    /**
     *
     * @return devuelve el JLABEL del warrior
     */
    public static JLabel showwarrior() {
        final int sizelabel = 64;
        JLabel warrior = new JLabel();
        warrior.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/warrior/warrior_right.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(warrior.getWidth(), warrior.getHeight(), Image.SCALE_DEFAULT));

        warrior.setIcon(icon);

        warrior.setLocation(0, 64);


        return warrior;
        //  panelcenter.add(warrior,0);


    }

    public static JLabel showwarriordown() {
        JLabel warriorDown = new JLabel();
        final int sizelabel = 64;
        warriorDown = new JLabel();
        warriorDown.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/warrior/warrior_down.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(warriorDown.getWidth(), warriorDown.getHeight(), Image.SCALE_DEFAULT));

        warriorDown.setIcon(icon);
        warriorDown.setVisible(false);
        //  panelcenter.add(warriorDown,0);
        return warriorDown;
    }

    public static JLabel showwarriorup() {
        JLabel warriorUp = new JLabel();
        final int sizelabel = 64;

        warriorUp.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/warrior/warrior_up.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(warriorUp.getWidth(), warriorUp.getHeight(), Image.SCALE_DEFAULT));

        warriorUp.setIcon(icon);
        warriorUp.setVisible(false);
        // panelcenter.add(warriorUp,0);
        return warriorUp;
    }


    public static JLabel showwarriorright() {
        final int sizelabel = 64;
        JLabel warriorRight = new JLabel();
        warriorRight.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/warrior/warrior_right.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(warriorRight.getWidth(), warriorRight.getHeight(), Image.SCALE_DEFAULT));

        warriorRight.setIcon(icon);
        warriorRight.setVisible(false);
        //panelcenter.add(warriorRight,0);
        return warriorRight;
    }

    public static JLabel showwarriorleft() {
        final int sizelabel = 64;
        JLabel warriorLeft = new JLabel();
        warriorLeft.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/warrior/warrior_left.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(warriorLeft.getWidth(), warriorLeft.getHeight(), Image.SCALE_DEFAULT));

        warriorLeft.setIcon(icon);
        warriorLeft.setVisible(false);
        // panelcenter.add(warriorLeft,0);
        return warriorLeft;
    }

    /**
     * funcion para ver la posicion del pj en un print constantemente
     */
    public void showposition() {
        System.out.print("X  " + getXposition());
        System.out.println("  Y  " + getYposition() + "  ");


    }


}




