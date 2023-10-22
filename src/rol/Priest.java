package rol;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Priest extends Character{
    private JLabel priestUp;
    private JLabel priestLeft;
    private JLabel priest;
    private JLabel priestRight;
    private JLabel priestDown;

    public Priest(int idCharacter, String name, int hp, int mana, String genero, double dinero, int strenght, int inteligence, int dexterity, int defense, int mdefense, int speed, int xposition, int yposition, ArrayList<Item> bag) {
        super(idCharacter, name, hp, mana, genero, dinero, strenght, inteligence, dexterity, defense, mdefense, speed, xposition, yposition, bag);
    }

    @Override
    public int moveUp(JLabel characterUp, int speed, JLabel priest, JLabel priestDown, JLabel priestRight, JLabel priestLeft) {
        int x = priest.getX();
        int y = priest.getY() - speed;


        //  y +=speed;


        //   warrior.setLocation(x, y);

        //   warriorDown.setLocation(warrior.getX(), y); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(priestDown, priestLeft, priestRight, priest);
        characterUp.setVisible(true); // mostrar el label showwarriordown
        characterUp.setLocation(priest.getX(), y);

        return y;
    }

    @Override
    public int moveDown(JLabel characterdown, int speed, JLabel priest, JLabel priestUp, JLabel priestRight, JLabel priestLeft) {
        int x = priest.getX();
        int y = priest.getY() + speed;




        //  y +=speed;


        // warrior.setLocation(x, y);

        //   warriorDown.setLocation(warrior.getX(), y); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(priestUp, priestLeft, priestRight, priest);
        characterdown.setVisible(true); // mostrar el label showwarriordown
        characterdown.setLocation(priest.getX(), y);

        return y;
    }

    @Override
    public int moveRight(JLabel characterRight, int speed, JLabel priest, JLabel priestDown, JLabel priestLeft, JLabel priestUp) {
        int x = priest.getX() + speed;
        int y = priest.getY();

        //  warriorLeft.setLocation(x, warrior.getY()); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(priestUp, priestLeft, priestDown, priest);
        characterRight.setVisible(true); // mostrar el label showwarriordown
        characterRight.setLocation(x,priest.getY());
        return x;

    }

    @Override
    public int moveLeft(JLabel characterLeft, int speed, JLabel priest, JLabel priestDown, JLabel priestRight, JLabel priestUp) {
        int x = priest.getX() - speed;
        int y = priest.getY();

        //  warriorLeft.setLocation(x, warrior.getY()); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(priestUp, priestRight, priestDown, priest);
        characterLeft.setVisible(true); // mostrar el label showwarriordown
        characterLeft.setLocation(x, priest.getY());
        return x;

    }






    public static JLabel showwpriest() {
        final int sizelabel = 64;
        JLabel priest= new JLabel();
        priest.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/priest/priest_right.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(priest.getWidth(), priest.getHeight(), Image.SCALE_DEFAULT));

        priest.setIcon(icon);

        priest.setLocation(0, 64);


        return priest;
        //  panelcenter.add(warrior,0);


    }

    public static JLabel showpriestdown() {
        JLabel priestDown = new JLabel();
        final int sizelabel = 64;
        priestDown = new JLabel();
       priestDown.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/priest/priest_down.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(priestDown.getWidth(), priestDown.getHeight(), Image.SCALE_DEFAULT));

        priestDown.setIcon(icon);
        priestDown.setVisible(false);
        //  panelcenter.add(warriorDown,0);
        return priestDown;
    }

    public static JLabel showpriestup() {
        JLabel priestUp = new JLabel();
        final int sizelabel = 64;

        priestUp.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/priest/priest_up.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(priestUp.getWidth(), priestUp.getHeight(), Image.SCALE_DEFAULT));

        priestUp.setIcon(icon);
        priestUp.setVisible(false);
        // panelcenter.add(warriorUp,0);
        return priestUp;
    }


    public static JLabel showpriestight() {
        final int sizelabel = 64;
        JLabel priestRight = new JLabel();
        priestRight.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/priest/priest_right.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(priestRight.getWidth(), priestRight.getHeight(), Image.SCALE_DEFAULT));

        priestRight.setIcon(icon);
        priestRight.setVisible(false);
        //panelcenter.add(warriorRight,0);
        return priestRight;
    }

    public static JLabel showpriestleft() {
        final int sizelabel = 64;
        JLabel priestLeft = new JLabel();
        priestLeft.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/priest/priest_left.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(priestLeft.getWidth(), priestLeft.getHeight(), Image.SCALE_DEFAULT));

        priestLeft.setIcon(icon);
        priestLeft.setVisible(false);
        // panelcenter.add(warriorLeft,0);
        return priestLeft;
    }



    public void showposition() {
        System.out.print("X  " + getXposition());
        System.out.println("  Y  " + getYposition() + "  ");


    }











}
