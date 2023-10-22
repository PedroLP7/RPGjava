package rol;

import javax.swing.*;
import java.awt.*;

public class Skeleton  {
private JLabel skeleton;



    private int xskeleton;
    private int yskeleton;

    private int direction;



    public Skeleton(int xskeleton, int yskeleton, JLabel skeleton, int direction) {
        this.xskeleton = xskeleton;
        this.yskeleton = yskeleton;
        this.skeleton = skeleton;
        this.direction = direction;
    }



    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getXskeleton() {
        return xskeleton;
    }

    public void setXskeleton(int xskeleton) {
        this.xskeleton = xskeleton;
    }

    public int getYskeleton() {
        return yskeleton;
    }

    public void setYskeleton(int yskeleton) {
        this.yskeleton = yskeleton;
    }

    public JLabel getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(JLabel skeleton) {
        this.skeleton = skeleton;
    }


    public static JLabel showskeleton() {
         String IMG_RIGHTsk = "src/images/skeleton/skeleton_right.gif";
         String IMG_LEFTsk ="src/images/skeleton/skeleton_left.gif";
         String IMG_UPsk ="\src/images/skeleton/skeleton_up.gif";
         String IMG_DOWNsk="\src/images/skeleton/skeleton_down.gif";
        final int sizelabel = 64;
       JLabel skeleton = new JLabel();
        skeleton.setSize(sizelabel, sizelabel);
        ImageIcon imageicon = new ImageIcon(IMG_RIGHTsk);
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));

        skeleton.setIcon(icon);




        System.out.println("X " + skeleton.getX() + "  Y" + skeleton.getY());
        // System.out.println("x " +randomIntX+"y "+randomIntY);
return skeleton;
//direccion 0 es drecha y 1 izuierda

    }


    public static JLabel showskeleton2() {
        String IMG_RIGHTsk = "src/images/skeleton/skeleton_right.gif";
        String IMG_LEFTsk ="src/images/skeleton/skeleton_left.gif";
        String IMG_UPsk ="src/images/skeleton/skeleton_up.gif";
        String IMG_DOWNsk="src/images/skeleton/skeleton_down.gif";
        final int sizelabel = 64;
        JLabel skeleton3 = new JLabel();
        skeleton3.setSize(sizelabel, sizelabel);
        skeleton3.setLocation(350,0);
        ImageIcon imageicon = new ImageIcon(IMG_DOWNsk);
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton3.getWidth(), skeleton3.getHeight(), Image.SCALE_DEFAULT));

        skeleton3.setIcon(icon);




        System.out.println("X " + skeleton3.getX() + "  Y" + skeleton3.getY());
        // System.out.println("x " +randomIntX+"y "+randomIntY);
        return skeleton3;
//direccion 0 es drecha y 1 izuierda

    }

    public static JLabel showSkeleton3() {



        String IMG_RIGHTsk = "src/images/skeleton/skeleton_right.gif";
        String IMG_LEFTsk ="src/images/skeleton/skeleton_left.gif";
        String IMG_UPsk ="src/images/skeleton/skeleton_up.gif";
        String IMG_DOWNsk="src/images/skeleton/skeleton_down.gif";
        final int sizelabel = 64;
        JLabel skeleton2 = new JLabel();
        skeleton2.setSize(sizelabel, sizelabel);
        skeleton2.setLocation(300,544);
        ImageIcon imageicon = new ImageIcon(IMG_UPsk);
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton2.getWidth(), skeleton2.getHeight(), Image.SCALE_DEFAULT));

        skeleton2.setIcon(icon);




        System.out.println("X " + skeleton2.getX() + "  Y" + skeleton2.getY());
        // System.out.println("x " +randomIntX+"y "+randomIntY);
        return skeleton2;

    }


}
