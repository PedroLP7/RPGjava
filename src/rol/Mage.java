package rol;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Mage extends  Character{

    private JLabel magetUp;
    private JLabel mageLeft;
    private JLabel mage;
    private JLabel mageRight;
    private JLabel mageDown;

    public Mage(int idCharacter, String name, int hp, int mana, String genero, double dinero, int strenght, int inteligence,
                int dexterity, int defense, int mdefense, int speed, int xposition, int yposition, ArrayList<Item> bag) {
        super(idCharacter, name, hp, mana, genero, dinero, strenght, inteligence, dexterity, defense, mdefense, speed, xposition, yposition, bag);
    }


    public static JLabel showmage() {
        final int sizelabel = 64;
        JLabel mage= new JLabel();
        mage.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/wizard/wizard_right.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(mage.getWidth(),  mage.getHeight(), Image.SCALE_DEFAULT));

        mage.setIcon(icon);

        mage.setLocation(0, 64);


        return  mage;
        //  panelcenter.add(warrior,0);


    }
    public static JLabel showmagedown() {
        JLabel  mageDown = new JLabel();
        final int sizelabel = 64;
        mageDown = new JLabel();
        mageDown.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/wizard/wizard_down.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(mageDown.getWidth(),  mageDown.getHeight(), Image.SCALE_DEFAULT));

        mageDown.setIcon(icon);
        mageDown.setVisible(false);
        //  panelcenter.add(warriorDown,0);
        return  mageDown;
    }

    public static JLabel showmageup() {
        JLabel  mageUp = new JLabel();
        final int sizelabel = 64;

        mageUp.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/wizard/wizard_up.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(mageUp.getWidth(),  mageUp.getHeight(), Image.SCALE_DEFAULT));

        mageUp.setIcon(icon);
        mageUp.setVisible(false);
        // panelcenter.add(warriorUp,0);
        return  mageUp;
    }

    public static JLabel showmageright() {
        final int sizelabel = 64;
        JLabel  mageRight = new JLabel();
        mageRight.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/wizard/wizard_right.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance( mageRight.getWidth(),  mageRight.getHeight(), Image.SCALE_DEFAULT));

        mageRight.setIcon(icon);
        mageRight.setVisible(false);
        //panelcenter.add(warriorRight,0);
        return  mageRight;
    }

    public static JLabel showmageleft() {
        final int sizelabel = 64;
        JLabel  mageLeft = new JLabel();
        mageLeft.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon("src/images/wizard/wizard_left.gif");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance( mageLeft.getWidth(),  mageLeft.getHeight(), Image.SCALE_DEFAULT));

        mageLeft.setIcon(icon);
        mageLeft.setVisible(false);
        // panelcenter.add(warriorLeft,0);
        return  mageLeft;
    }

    public void showposition() {
        System.out.print("X  " + getXposition());
        System.out.println("  Y  " + getYposition() + "  ");


    }















    @Override
    public int moveUp(JLabel characterUp, int speed, JLabel mage, JLabel mageDown, JLabel mageRight, JLabel mageLeft) {
        int x = mage.getX();
        int y = mage.getY() - speed;


        //  y +=speed;


        //   warrior.setLocation(x, y);

        //   warriorDown.setLocation(warrior.getX(), y); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(mageDown, mageLeft, mageRight, mage);
        characterUp.setVisible(true); // mostrar el label showwarriordown
        characterUp.setLocation(mage.getX(), y);

        return y;
    }

    @Override
    public int moveDown(JLabel characterdown, int speed, JLabel mage, JLabel mageUp, JLabel mageRight, JLabel mageLeft) {
        int x = mage.getX();
        int y = mage.getY() + speed;




        //  y +=speed;


        // warrior.setLocation(x, y);

        //   warriorDown.setLocation(warrior.getX(), y); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(mageUp, mageLeft, mageRight, mage);
        characterdown.setVisible(true); // mostrar el label showwarriordown
        characterdown.setLocation(mage.getX(), y);

        return y;
    }

    @Override
    public int moveRight(JLabel characterRight, int speed, JLabel mage, JLabel mageDown, JLabel mageLeft, JLabel mageUp) {
        int x = mage.getX() + speed;
        int y = mage.getY();

        //  warriorLeft.setLocation(x, warrior.getY()); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(mageUp, mageLeft, mageDown, mage);
        characterRight.setVisible(true); // mostrar el label showwarriordown
        characterRight.setLocation(x,mage.getY());
        return x;
    }

    @Override
    public int moveLeft(JLabel characterLeft, int speed, JLabel mage, JLabel mageDown, JLabel mageRight, JLabel mageUp) {
        int x = mage.getX() - speed;
        int y = mage.getY();

        //  warriorLeft.setLocation(x, warrior.getY()); // establecer la nueva ubicación del guerrero
        Character.cleanSprite(mageUp, mageRight, mageDown, mage);
        characterLeft.setVisible(true); // mostrar el label showwarriordown
        characterLeft.setLocation(x,mage.getY());
        return x;
    }
}
