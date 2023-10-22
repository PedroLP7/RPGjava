package rol;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.*;
import java.util.ArrayList;

public class Main2 {
    private JPanel panelmain;
    private JPanel panelcenter;

    private JPanel paneltitulo;

    private JButton buttonpause;


    private static JFrame frame;
    private JLabel warrior = Warrior.showwarrior();
    private JLabel warriorDown = Warrior.showwarriordown();
    private JLabel warriorUp = Warrior.showwarriorup();
    private JLabel warriorLeft = Warrior.showwarriorleft();
    private JLabel warriorRight = Warrior.showwarriorright();
    private JLabel priest = Priest.showwpriest();
    private JLabel priestRight = Priest.showpriestight();
    private JLabel priestLeft = Priest.showpriestleft();
    private JLabel priestUp = Priest.showpriestup();
    private JLabel priestDown = Priest.showpriestdown();
    private JLabel mage = Mage.showmage();
    private JLabel mageRight = Mage.showmageright();
    private JLabel mageLeft = Mage.showmageleft();
    private JLabel mageDown = Mage.showmagedown();
    private JLabel mageUp = Mage.showmageup();
    private JLabel skeleton = Skeleton.showskeleton();
    private JLabel skeleton2 = Skeleton.showskeleton2();
    private JLabel skeleton3 = Skeleton.showSkeleton3();
    private JLabel warriorattack;
    ArrayList<Item> itemlist = Character.itemlist();
    int screenWidth = 1100;
    int screenHeight = 600;
    int tileWidth = 32;
    int tileHeight = 32;
    int numCols = (int) Math.ceil(screenWidth / (double) tileWidth);
    int numRows = (int) Math.ceil(screenHeight / (double) tileHeight);
    private int seconds = 0;
    private JLabel labeltime;
    private JLabel labelgold;
    // private int hp = 3;
    private JLabel muros;
    private JLabel labelhp;
    private JLabel potionlabel;
    private JLabel swordlabel;
    private JLabel mitralabel;
    private int yskelet;
    private int xskelet;
    private int yskelet2;
    private int xskelet2;
    private int xskelet3;
    private int yskelet3;
    private JLabel vida;
    private JLabel vida2;
    private JLabel vida3;

    private String IMG_RIGHTsk = "src/images/skeleton/skeleton_right.gif";
    private String IMG_LEFTsk = "src/images/skeleton/skeleton_left.gif";
    private String IMG_UPsk = "src/images/skeleton/skeleton_up.gif";
    private String IMG_DOWNsk = "src/images/skeleton/skeleton_down.gif";
    private JLabel name;
    private String typechar;

    private final int sizelabel = 64;


    Warrior w1 = new Warrior(1, "pedro", 3, 23, "Hombre", 0, 0, 20,
            20, 20, 3, 20, 0, 0, itemlist);
    Item i1 = new Item(1, "Gold", 10, " gold nugget", false, false, labelgold);
    Item i2 = new Item(2, "Potion", 20, "restore hp", false, true, potionlabel);
    Item i3 = new Item(3, "Sword", 30, "dealdamage", true, false, swordlabel);
    Item i4 = new Item(4, "MItra", 30, "dealdamageformages", true, false, mitralabel);
    Priest p1 = new Priest(2, "pedro", 3, 23, "Hombre", 0, 30, 0,
            20, 20, 3, 20, 0, 0, itemlist);
    Mage m1 = new Mage(3, "pedro", 3, 23, "Hombre", 0, 30, 0,
            20, 20, 3, 20, 0, 0, itemlist);
    Skeleton s1 = new Skeleton(skeleton.getX(), skeleton.getY(), skeleton, 0);
    Skeleton s2 = new Skeleton(skeleton2.getX(), skeleton2.getY(), skeleton2, 2);
    Skeleton s3 = new Skeleton(skeleton3.getX(), skeleton3.getY(), skeleton3, 3);
    private int x = w1.getXposition();
    private int y = w1.getYposition();
    private int typechari;
    private JLabel labeloro;
    private JLabel labelorotxt;
    String db_url = "jdbc:mysql://localhost:3306/juego" +
            "";
    String user = "root";
    String passwd = "mysql";
    String query = "select * from jugador where nombre =?";

    String insertQy = "insert into jugador values (?,?,?)";


    public Main2() {
        panelmain = new JPanel(null); // establecer el layout en null
        panelmain.setPreferredSize(new Dimension(1100, 608));
        panelmain.setSize(panelmain.getPreferredSize());
        panelmain.setFocusable(true);

        showPaneltitulo();
        showpanelcenter();

        Timer t = new Timer(150, new TimerActionListener(s1, s2, s3));
        if (typechari == 0) {
            panelmain.addKeyListener(new movewarrior());
        } else if (typechari == 1) {
            panelmain.addKeyListener(new movemage());

        } else if (typechari == 2) {
            panelmain.addKeyListener(new movepriest());
        }

        buttonpause.addMouseListener(new buttonpauselistener(t));









        /*
        Timer t = new Timer(150, new TimerActionListener(s1, s2, s3));
        if (typechar.equalsIgnoreCase("warrior")) {
            panelmain.addKeyListener(new movewarrior());
        } else if (typechar.equalsIgnoreCase("mage")) {
            panelmain.addKeyListener(new movemage());

        } else if (typechar.equalsIgnoreCase("priest")) {
            panelmain.addKeyListener(new movepriest());
        }

        buttonpause.addMouseListener(new buttonpauselistener(t));

*/



/*
        String filename= "src/res/calcul.txt";
        BufferedReader br;
        String line;
        double suma =0;
        int cont =0;
        try {
            br = new BufferedReader(new FileReader(filename));
            while((line = br.readLine())!=null){
                suma += Double.valueOf(line);
                cont++;



            }
            System.out.println("media ="+suma/cont);
        } catch (FileNotFoundException e) {
            System.out.println("no se ha encontrado el fichero");

        } catch (IOException e) {
            System.out.println("error leyendo el fichero");
        }

*/













/*
PARA LEER UN FICHERO ENTERO
            Path path = Paths.get("src/res/dmo.txt");


            try {
                List<String> listalineas =  Files.readAllLines(path);
String uni = String.join("\n",listalineas);
                System.out.println(uni);
            } catch (IOException e) {
                System.out.println("error leyendo el fichero");
            }


*/
    }


    private void showPaneltitulo() {


        paneltitulo = new JPanel();
        paneltitulo.setLocation(0, 0);
        paneltitulo.setSize(panelmain.getWidth(), 36);
        paneltitulo.setBackground(Color.black);
        paneltitulo.setLayout(null);
        panelmain.add(paneltitulo);
//label de los segundos
        buttonpause = new JButton();
        buttonpause.setFocusPainted(false);
        buttonpause.setSize(new Dimension(115,32));
        buttonpause.setBackground(new Color(25, 18, 50));
        buttonpause.setText("Iniciar juego");
        buttonpause.setForeground(Color.white);
        buttonpause.setLocation(500,0);
        paneltitulo.add(buttonpause);






        //   labeltime = new JLabel();
        // labeltime.setText("0 segundos");
        //paneltitulo.add(labeltime);
        labelhp = new JLabel();
        labelhp.setSize(new Dimension(50,32));
        labelhp.setText(w1.getHp() + " vidas");
        labelhp.setForeground(Color.white);
       /// labelhp.setBounds(paneltitulo.getWidth()-labelhp.getWidth()-10,1,50,50);
        labelhp.setLocation(400,0);
      //  paneltitulo.add(labelhp);


        showvida1();
        showvida2();
        showvida3();

labeloro = new JLabel();
        labeloro = new JLabel();
        labeloro.setSize(32, 32);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/dollar.png");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labeloro.getWidth(), labeloro.getHeight(), Image.SCALE_DEFAULT));

        labeloro.setIcon(icon);
labeloro.setLocation(paneltitulo.getWidth()-200,0);
        paneltitulo.add(labeloro,0);

labelorotxt = new JLabel();
        labelorotxt.setSize(new Dimension(32,32));
        labelorotxt.setForeground(Color.white);
        labelorotxt.setText("0");
        labelorotxt.setLocation(panelmain.getWidth()-150,0);
        paneltitulo.add(labelorotxt);

    }

    private void showpanelcenter() {

        panelcenter = new JPanel();
        panelcenter.setSize(panelmain.getWidth(), panelmain.getHeight());
        panelcenter.setLocation(0, 36);
        panelcenter.setLayout(null);
        //panelcenter.setBackground(Color.white);
        panelmain.add(panelcenter);
        panelcenter.setFocusable(true);

        int x = 0;
        int y = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                JLabel background = new JLabel();
                background.setSize(tileWidth, tileHeight);
                ImageIcon imageicon = new ImageIcon("src/images/dungeon/tile001.png");
                Icon icon2 = new ImageIcon(imageicon.getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_DEFAULT));
                background.setIcon(icon2);
                background.setLocation(x, y); // establecer la ubicación
                panelcenter.add(background);
                x += tileWidth; // mover la posición x
            }
            x = 0; // restablecer la posición x
            y += tileHeight; // mover la posición y
        }

        showmur();

       /*
        muros = new JLabel();
        muros.setSize(64, 64);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/tile004.png");
        Icon icon2 = new ImageIcon(imageicon.getImage().getScaledInstance(muros.getWidth(), muros.getHeight(), Image.SCALE_DEFAULT));
        muros.setLocation(1040, 540);
        muros.setIcon(icon2);
        panelcenter.add(muros, 0);

        */

        typechari = askData2();
        //   typechar = askData();
        showCharacters();


        showgold();
        showpotion();
        showsword();
        showmitra();


        // showwarriorright();
        // showwarriorleft();


    }

    private void showmur() {

        muros = new JLabel();
        muros.setSize(64, 64);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/tile004.png");
        Icon icon2 = new ImageIcon(imageicon.getImage().getScaledInstance(muros.getWidth(), muros.getHeight(), Image.SCALE_DEFAULT));
        muros.setLocation(-200, -540);
        muros.setIcon(icon2);
        //  panelcenter.add(muros, 0);


    }


    private int askData2() {
        String[] opciones = {"Warrior", "Mage", "Priest"};
        int opcion = 0;
        boolean confirmacion = false;
        String typ = "";
        while (!confirmacion) {

            opcion = JOptionPane.showOptionDialog(null, "ELIGE pibe", "character selection", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, 0);


            String name = JOptionPane.showInputDialog("introduce your character's name");
            if (opcion == 0) {
                w1.setName(name);
                System.out.println(name);
                confirmacion = true;

            } else if (opcion == 1) {
                confirmacion = true;
                m1.setName(name);
                System.out.println("mage " + name);

            } else if (opcion == 2) {
                confirmacion = true;
                p1.setName(name);
                System.out.println("priest " + name);
            }


        }

        return opcion;

    }

    private String askData() {
        String[] opciones = {"Hola", "QUE", "TAL"};
        int opcion = 0;
        String typ = "";
        while (!typ.equalsIgnoreCase("mage") && !typ.equalsIgnoreCase("warrior") && !typ.equalsIgnoreCase("priest")) {
            typ = JOptionPane.showInputDialog("Type what character u want to use,\n Warrior\n Priest\n Mage");
            opcion = JOptionPane.showOptionDialog(null, "ELIGE pibe", "character selection", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

        }

        String name = JOptionPane.showInputDialog("introduce your character's name");
        if (typ.equalsIgnoreCase("warrior")) {
            w1.setName(name);
            System.out.println(name);
        } else if (typ.equalsIgnoreCase("mage")) {
            m1.setName(name);
            System.out.println("mage " + name);

        } else if (typ.equalsIgnoreCase("priest")) {

            p1.setName(name);
            System.out.println("priest " + name);
        }


        return typ;

    }


//creacion del label y del objeto esqueleto


    //DIRECCION 0 -->Derecha
    //DIRECCION 1 ---> IZQUIERDA
    // DIRECCION 2 ---->ABAJO
    // DIRECCION 3 ---> ARRIBA
    public void skeletonmove(Skeleton s1, Skeleton s2, Skeleton s3) {


        //esqueletos horizontales
        if (s1.getDirection() == 0) {
            yskelet = skeleton.getY();
            xskelet = skeleton.getX();

            xskelet += 20;
            skeleton.setLocation(xskelet, yskelet);
            s1.setYskeleton(yskelet);
            s1.setXskeleton(xskelet);
        } else if (s1.getDirection() == 1) {
            yskelet = skeleton.getY();
            xskelet = skeleton.getX();

            xskelet -= 20;
            skeleton.setLocation(xskelet, yskelet);
            s1.setYskeleton(yskelet);
            s1.setXskeleton(xskelet);
        }


        if (xskelet <= 0) {
            //  skeleton.setIcon(IMG_RIGHTsk);
            xskelet += 20;
            skeleton.setLocation(xskelet, skeleton.getY());
            ImageIcon imageicon = new ImageIcon(IMG_RIGHTsk);
            Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));
            skeleton.setIcon(icon);
            s1.setDirection(0);
        } else if (xskelet >= panelmain.getWidth() - skeleton.getWidth()) {
            //skeleton.setIcon(IMG_LEFTsk);
            //52
            ImageIcon imageicon = new ImageIcon(IMG_LEFTsk);
            Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));
            skeleton.setIcon(icon);
            s1.setDirection(1);


        }


// esqueleto vertical2


        if (s2.getDirection() == 2) {
            yskelet2 = skeleton2.getY();
            xskelet2 = skeleton2.getX();

            yskelet2 += 20;
            skeleton2.setLocation(xskelet2, yskelet2);
            s2.setYskeleton(yskelet2);
            s2.setXskeleton(xskelet2);

        } else if (s2.getDirection() == 3) {
            yskelet2 = skeleton2.getY();
            xskelet2 = skeleton2.getX();

            yskelet2 -= 20;
            skeleton2.setLocation(xskelet2, yskelet2);
            s2.setYskeleton(yskelet2);
            s2.setXskeleton(xskelet2);
        }


        if (yskelet2 <= 0) {
            //  skeleton.setIcon(IMG_RIGHTsk);
            //xskelet+=20;
            skeleton2.setLocation(xskelet2, skeleton2.getY());
            ImageIcon imageicon = new ImageIcon(IMG_DOWNsk);
            Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));
            skeleton2.setIcon(icon);
            s2.setDirection(2);
        } else if (yskelet2 >= panelmain.getHeight() - skeleton2.getHeight()) {
            //skeleton.setIcon(IMG_LEFTsk);
            //52
            ImageIcon imageicon = new ImageIcon(IMG_UPsk);
            Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));
            skeleton2.setIcon(icon);
            s2.setDirection(3);


        }

// esqueleto 3


        if (s3.getDirection() == 2) {
            yskelet3 = skeleton3.getY();
            xskelet3 = skeleton3.getX();

            yskelet3 += 20;
            skeleton3.setLocation(xskelet3, yskelet3);
            s3.setYskeleton(yskelet3);
            s3.setXskeleton(xskelet3);

        } else if (s3.getDirection() == 3) {
            yskelet3 = skeleton3.getY();
            xskelet3 = skeleton3.getX();

            yskelet3 -= 20;
            skeleton3.setLocation(xskelet3, yskelet3);
            s3.setYskeleton(yskelet3);
            s3.setXskeleton(xskelet3);
        }


        if (yskelet3 <= 0) {
            //  skeleton.setIcon(IMG_RIGHTsk);
            //xskelet+=20;
            skeleton3.setLocation(xskelet3, skeleton3.getY());
            ImageIcon imageicon = new ImageIcon(IMG_DOWNsk);
            Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));
            skeleton3.setIcon(icon);
            s3.setDirection(2);
        } else if (yskelet3 >= panelmain.getHeight() - skeleton3.getHeight()) {
            //skeleton.setIcon(IMG_LEFTsk);
            //52
            ImageIcon imageicon = new ImageIcon(IMG_UPsk);
            Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(skeleton.getWidth(), skeleton.getHeight(), Image.SCALE_DEFAULT));
            skeleton3.setIcon(icon);
            s3.setDirection(3);


        }

    }

    private void showvida1() {
        vida = new JLabel();
        vida.setSize(32, 32);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/heart.png");
        Icon icon2 = new ImageIcon(imageicon.getImage().getScaledInstance(vida.getWidth(), vida.getHeight(), Image.SCALE_DEFAULT));
        vida.setLocation(0, 0);
        vida.setIcon(icon2);
        paneltitulo.add(vida, 0);


    }

    private void showvida3() {
        vida3 = new JLabel();
        vida3.setSize(32, 32);
        ImageIcon imageicon4 = new ImageIcon("src/images/dungeon/heart.png");
        Icon icon4 = new ImageIcon(imageicon4.getImage().getScaledInstance(vida.getWidth(), vida.getHeight(), Image.SCALE_DEFAULT));
        vida3.setLocation(33, 0);
        vida3.setIcon(icon4);
        paneltitulo.add(vida3, 0);
    }


    private void showvida2() {
        vida2 = new JLabel();
        vida2.setSize(32, 32);
        ImageIcon imageicon3 = new ImageIcon("src/images/dungeon/heart.png");
        Icon icon3 = new ImageIcon(imageicon3.getImage().getScaledInstance(vida.getWidth(), vida.getHeight(), Image.SCALE_DEFAULT));

        vida2.setLocation(66, 0);
        vida2.setIcon(icon3);
        paneltitulo.add(vida2, 0);
    }

    private void showgold() {
        labelgold = new JLabel();
        labelgold.setSize(32, 32);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/dollar.png");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labelgold.getWidth(), labelgold.getHeight(), Image.SCALE_DEFAULT));

        labelgold.setIcon(icon);

        int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - labelgold.getWidth()));
        int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - labelgold.getHeight()));
        labelgold.setLocation(randomIntX, randomIntY);
        panelcenter.add(labelgold, 0);
        System.out.println("X " + labelgold.getX() + "  Y" + labelgold.getY());
        // System.out.println("x " +randomIntX+"y "+randomIntY);


    }


    private void showpotion() {
        potionlabel = new JLabel();
        potionlabel.setSize(32, 32);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/potion.png");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labelgold.getWidth(), labelgold.getHeight(), Image.SCALE_DEFAULT));

        potionlabel.setIcon(icon);

        int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - labelgold.getWidth()));
        int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - labelgold.getHeight()));
        labelgold.setLocation(randomIntX, randomIntY);
        panelcenter.add(potionlabel, 0);
        System.out.println("X " + potionlabel.getX() + "  Y" + potionlabel.getY());
        // System.out.println("x " +randomIntX+"y "+randomIntY);


    }


    private void showsword() {
        swordlabel = new JLabel();
        swordlabel.setSize(32, 32);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/sword.png");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labelgold.getWidth(), labelgold.getHeight(), Image.SCALE_DEFAULT));

        swordlabel.setIcon(icon);

        int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - labelgold.getWidth()));
        int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - labelgold.getHeight()));
        swordlabel.setLocation(randomIntX, randomIntY);
        panelcenter.add(swordlabel, 0);
        System.out.println("X " + swordlabel.getX() + "  Y" + swordlabel.getY());
        // System.out.println("x " +randomIntX+"y "+randomIntY);


    }

    private void showmitra() {
        mitralabel = new JLabel();
        mitralabel.setSize(32, 32);
        ImageIcon imageicon = new ImageIcon("src/images/dungeon/mitra.png");
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labelgold.getWidth(), labelgold.getHeight(), Image.SCALE_DEFAULT));

        mitralabel.setIcon(icon);

        int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - labelgold.getWidth()));
        int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - labelgold.getHeight()));
        mitralabel.setLocation(randomIntX, randomIntY);
        panelcenter.add(mitralabel, 0);

        // System.out.println("x " +randomIntX+"y "+randomIntY);


    }


    /**
     * MUESTRA LOS SPRITES
     **/
    public void showCharacters() {
        if (typechari == 0) {

            panelcenter.add(warrior, 0);
            panelcenter.add(warriorDown, 0);
            panelcenter.add(warriorUp, 0);
            panelcenter.add(warriorLeft, 0);
            panelcenter.add(warriorRight, 0);
        } else if (typechari == 1) {
            panelcenter.add(mage, 0);
            panelcenter.add(mageRight, 0);
            panelcenter.add(mageLeft, 0);
            panelcenter.add(mageDown, 0);
            panelcenter.add(mageUp, 0);

            System.out.println("has elegido mago");

        } else if (typechari == 2) {
            panelcenter.add(priest, 0);
            panelcenter.add(priestUp, 0);
            panelcenter.add(priestDown, 0);
            panelcenter.add(priestLeft, 0);
            panelcenter.add(priestRight, 0);

            System.out.println("has elegido priest");

        }


        panelcenter.add(skeleton, 0);
        panelcenter.add(skeleton2, 0);
        panelcenter.add(skeleton3, 0);


    }

    /**
     * RECOGER ORO
     **/
    private void collectGold(JLabel character) {
        Rectangle rchar = new Rectangle(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        Rectangle rgold = new Rectangle(labelgold.getX(), labelgold.getY(), labelgold.getWidth(), labelgold.getHeight());
        if (rchar.intersects(rgold)) {
            w1.setDinero(w1.getDinero() + 10);
            labelorotxt.setText(w1.getDinero()+"");
            int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - labelgold.getWidth()));
            int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - labelgold.getHeight()));
            labelgold.setLocation(randomIntX, randomIntY);
            System.out.println(w1.getDinero());


        }


    }


    /**
     * REGOCGER POCIONES
     **/
    private void collectpotion(JLabel character) {
        Rectangle rchar = new Rectangle(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        Rectangle rpotion = new Rectangle(potionlabel.getX(), potionlabel.getY(), potionlabel.getWidth(), potionlabel.getHeight());
        if (rchar.intersects(rpotion)) {
            if (itemlist.contains(i2)) {

            } else {

                potionlabel.setLocation(-200, -200);
                panelcenter.remove(potionlabel);
                paneltitulo.add(potionlabel);
                potionlabel.setLocation(120,0);
                itemlist.add(i2);
                //me falta añadir al arraylist la pocion

                for (int i = 0; i < itemlist.size(); i++) {
                    Item item = itemlist.get(i);

                    System.out.println(item);
                }
                System.out.println(w1.getHp());


            }
        }

    }

    private void collectmitra(JLabel character) {
        Rectangle rchar = new Rectangle(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        Rectangle rmitra = new Rectangle(mitralabel.getX(), mitralabel.getY(), mitralabel.getWidth(), mitralabel.getHeight());
        if (rchar.intersects(rmitra)) {
            if (itemlist.contains(i4)) {

            } else {
                mitralabel.setLocation(-200, -200);
                panelcenter.remove(mitralabel);
                paneltitulo.add(mitralabel);
                mitralabel.setLocation(180,0);
                itemlist.add(i4);


            }
        }

    }


    private void collectsword(JLabel character) {
        Rectangle rchar = new Rectangle(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        Rectangle rsword = new Rectangle(swordlabel.getX(), swordlabel.getY(), swordlabel.getWidth(), swordlabel.getHeight());
        if (rchar.intersects(rsword)) {
            if (itemlist.contains(i3)) {

            } else {
                w1.setStrenght(1);
                itemlist.add(i3);
            /*
            for (int i = 0; i < itemlist.size(); i++) {
                Item item = itemlist.get(i);
                System.out.println(item);
            }

             */
                panelcenter.remove(swordlabel);
                paneltitulo.add(swordlabel);

                panelcenter.repaint();
                paneltitulo.repaint();
                swordlabel.setLocation(150,0);


            }
        }

    }


    /**
     * ACABAR JUEGO
     **/
    private void winnerF(JLabel character, JLabel muros, String name, int HPleft, double money) {
        Rectangle rchar = new Rectangle(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        if (w1.getDinero() >= 50) {
            muros = new JLabel();
            muros.setSize(64, 64);
            ImageIcon imageicon = new ImageIcon("src/images/dungeon/tile004.png");
            Icon icon2 = new ImageIcon(imageicon.getImage().getScaledInstance(muros.getWidth(), muros.getHeight(), Image.SCALE_DEFAULT));
            muros.setLocation(1040, 540);
            muros.setIcon(icon2);
            panelcenter.add(muros, 1);
            panelcenter.repaint();
        }
        Rectangle muro = new Rectangle(muros.getX(), muros.getY(), muros.getWidth(), muros.getHeight());
        if (rchar.intersects(muro)) {
            String items = "";
            JOptionPane.showMessageDialog(panelcenter, "ENHORABUENA");
            /*
            for (int i = 0; i < itemlist.size(); i++) {
                Item item = itemlist.get(i);
                items = item.toString2();
                System.out.println(item);
            }

             */

            JOptionPane.showMessageDialog(panelcenter, "Te han sobrado " + w1.getHp() + " vidas ." +
                    "Has conseguido " + w1.getDinero() + "de oro");
            leerClassificacion();


            String[] datos = new String[3];
            for (int i = 0; i < datos.length; i++) {
                datos[0] = name;
                datos[1] = String.valueOf(HPleft);
                datos[2] = String.valueOf(money);

            }
            System.out.println("partida actual");
            String dato1 = "Nombre " + datos[0] + ";";
            String dato2 = datos[1] + " Vidas restantes;";
            String dato3 = datos[2] + " Oro;";
            System.out.println(dato1);

            System.out.println(dato2);
            System.out.println(dato3);
            String info = dato1 + dato2 + dato3;
            Path ruta = Paths.get("src/res/puntuaciones.txt");


            try {
                Files.writeString(ruta, info, StandardOpenOption.APPEND);
                Files.writeString(ruta, System.lineSeparator(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("error en la escritura");
            }

            try {
                Connection con = DriverManager.getConnection(db_url, user, passwd);
                //   PreparedStatement ps= con.prepareStatement(query);
                // ps.setString(1,"Pedro");
                //ResultSet rs = ps.executeQuery();
                PreparedStatement ps = con.prepareStatement(insertQy);
                ps.setString(1, name);
                ps.setInt(2, HPleft);
                ps.setDouble(3, money);
                int addRows = ps.executeUpdate();
                if (addRows > 0) {
                    System.out.println("todo ha ido ok");
                }
/*
                while(rs.next()){
                    System.out.println(
                           rs.getString(1)+"-"+
                           rs.getInt(2)+"-"+
                                   rs.getInt(3)+"-"
                    );
                }
                rs.close();
                /*
 */

                ps.close();
                con.close();
            } catch (SQLException e) {
                System.out.println("conexion fallida");
            }


            System.exit(0);
        }

    }


    private void loseHP(JLabel character) {

        Rectangle rchar = new Rectangle(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        Rectangle rskel = new Rectangle(skeleton.getX(), skeleton.getY(), skeleton.getWidth(), skeleton.getHeight());
        Rectangle rskel2 = new Rectangle(skeleton2.getX(), skeleton2.getY(), skeleton2.getWidth(), skeleton2.getHeight());
        Rectangle rskel3 = new Rectangle(skeleton3.getX(), skeleton3.getY(), skeleton3.getWidth(), skeleton3.getHeight());

// dependiendo del texto del label de vidas , cambiar llos corazones , quitando o añadiendo
        if (rchar.intersects(rskel)) {
            if (w1.getStrenght() == 1) {
                skeleton.setLocation(-200, -200);
                panelcenter.remove(skeleton);
                panelcenter.repaint();
                w1.setStrenght(0);
                swordlabel.setLocation(-200, -200);
                paneltitulo.remove(swordlabel);
                paneltitulo.repaint();
            } else {

                w1.setHp(w1.getHp() - 1);
                int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - skeleton.getWidth()));
                int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - skeleton.getHeight()));
                skeleton.setLocation(randomIntX, randomIntY);
                labelhp.setText(w1.getHp() + " vidas");
                System.out.println(w1.getHp());
            }

        } else if (rchar.intersects(rskel2)) {
            if (w1.getStrenght() == 1) {
                skeleton2.setLocation(-200, -200);
                panelcenter.remove(skeleton2);
                panelcenter.repaint();
                w1.setStrenght(0);
                paneltitulo.remove(swordlabel);
                paneltitulo.repaint();
            } else {
                w1.setHp(w1.getHp() - 1);
                int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - skeleton.getWidth()));
                int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - skeleton.getHeight()));
                skeleton2.setLocation(randomIntX, randomIntY);
                labelhp.setText(w1.getHp() + " vidas");
                System.out.println(w1.getHp());

            }
        } else if (rchar.intersects(rskel3)) {
            if (w1.getStrenght() == 1) {
                skeleton3.setLocation(-200, -200);
                panelcenter.remove(skeleton3);
                panelcenter.repaint();
                w1.setStrenght(0);
                paneltitulo.remove(swordlabel);
                paneltitulo.repaint();
            } else {
                w1.setHp(w1.getHp() - 1);
                int randomIntX = (int) (Math.random() * (panelcenter.getWidth() - skeleton.getWidth()));
                int randomIntY = (int) (Math.random() * (panelcenter.getHeight() - skeleton.getHeight()));
                skeleton3.setLocation(randomIntX, randomIntY);
                labelhp.setText(w1.getHp() + " vidas");
                System.out.println(w1.getHp());
            }
        }
        if (w1.getHp() < 1) {
            paneltitulo.remove(vida);
            paneltitulo.repaint();
            JOptionPane.showMessageDialog(panelcenter, "has perdido");
            System.exit(0);

        }
        //aqui
        if (w1.getHp()==2){
            paneltitulo.remove(vida2);
            paneltitulo.repaint();
        }
        else if (w1.getHp()==1){
            paneltitulo.remove(vida3);
            paneltitulo.repaint();
        }


    }


    private class TimerActionListener implements ActionListener {
        Skeleton s1;
        Skeleton s2;
        Skeleton s3;

        public TimerActionListener(Skeleton s1, Skeleton s2, Skeleton s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;

        }


        @Override
        public void actionPerformed(ActionEvent e) {
            //  seconds++;
            // labeltime.setText(seconds + "  segundos");
            collectGold(warrior);
            collectGold(priest);//coger oro
            collectGold(mage);
            collectpotion(warrior);
            collectpotion(priest);
            collectpotion(mage);
            collectsword(warrior);
            collectsword(mage);
            collectsword(priest);
            collectmitra(warrior);
            collectmitra(priest);
            collectmitra(mage);
            loseHP(warrior);
            loseHP(priest);
            loseHP(mage);
            skeletonmove(s1, s2, s3);
            winnerF(mage, muros, m1.getName(), m1.getHp(), m1.getDinero());
            winnerF(warrior, muros, w1.getName(), w1.getHp(), w1.getDinero());
            winnerF(priest, muros, p1.getName(), p1.getHp(), p1.getDinero());

        }
    }

    public class buttonpauselistener extends MouseAdapter {
        Timer t;

        public buttonpauselistener(Timer t) {
            this.t = t;
        }

        @Override

        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if (buttonpause.getText().equalsIgnoreCase("Iniciar juego")) {
                buttonpause.setText("Pausar");
                t.start();

                // t2.start();


                //  gameStarted = true;
                panelmain.requestFocusInWindow();
            } else if (buttonpause.getText().equalsIgnoreCase("Pausar")) {

                t.stop();
                // t2.stop();
                // gameStarted = false;
                buttonpause.setText("Iniciar juego");

            }


        }
    }


    private class movemage extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            super.keyPressed(e);
            x = mage.getX();
            y = mage.getY();

            switch (e.getKeyCode()) {

                case KeyEvent.VK_LEFT -> x = m1.moveLeft(mageLeft, m1.getSpeed(), mage, mageDown, mageRight, mageUp);
                case KeyEvent.VK_RIGHT -> x = m1.moveRight(mageRight, m1.getSpeed(), mage, mageDown, mageLeft, mageUp);
                //  x = w1.moveRight(IMG_RIGHT, w1.getSpeed(), warrior);
                case KeyEvent.VK_DOWN -> y = m1.moveDown(mageDown, m1.getSpeed(), mage, mageUp, mageLeft, mageRight);
                case KeyEvent.VK_UP -> y = m1.moveUp(mageUp, m1.getSpeed(), mage, mageDown, mageLeft, mageRight);
                case KeyEvent.VK_A -> System.out.println(m1.toString());
                case KeyEvent.VK_SPACE -> {
                    for (int i = 0; i < itemlist.size(); i++) {
                        Item i22 = itemlist.get(i);
                        if (i22.getIdItem() == 2) {
                            w1.setHp(w1.getHp() + 1);
                            labelhp.setText(w1.getHp() + "vidas");
                            itemlist.remove(i2);
                            potionlabel.setLocation(-200, -200);
                            paneltitulo.remove(potionlabel);
                            paneltitulo.repaint();
                        } else {
                            System.out.println("No puedes usar la pocion!");
                        }

                    }


                }


            }
            //   x >= 0 && x <= Panelmain.getWidth() - labelTrash.getWidth()
            if (x >= 0 && x <= panelmain.getWidth() - warrior.getWidth() &&
                    y >= 0 && y <= panelcenter.getHeight() - warrior.getHeight()) {
                m1.setYposition(y);
                m1.setXposition(x);


                mage.setLocation(x, y);
                m1.showposition();
            }


            /*
            w1.setYposition(y);
            w1.setXposition(x);
            warrior.setLocation(x, y);
            w1.showposition();

*/

        }

    }


    private class movewarrior extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            super.keyPressed(e);
            x = warrior.getX();
            y = warrior.getY();

            switch (e.getKeyCode()) {

                case KeyEvent.VK_LEFT ->
                        x = w1.moveLeft(warriorLeft, w1.getSpeed(), warrior, warriorDown, warriorRight, warriorUp);
                case KeyEvent.VK_RIGHT ->
                        x = w1.moveRight(warriorRight, w1.getSpeed(), warrior, warriorDown, warriorLeft, warriorUp);
                //  x = w1.moveRight(IMG_RIGHT, w1.getSpeed(), warrior);
                case KeyEvent.VK_DOWN ->
                        y = w1.moveDown(warriorDown, w1.getSpeed(), warrior, warriorUp, warriorLeft, warriorRight);
                case KeyEvent.VK_UP ->
                        y = w1.moveUp(warriorUp, w1.getSpeed(), warrior, warriorDown, warriorLeft, warriorRight);
                case KeyEvent.VK_A -> System.out.println(w1.toString());
                case KeyEvent.VK_SPACE -> {
                    for (int i = 0; i < itemlist.size(); i++) {
                        Item i22 = itemlist.get(i);
                        if (i22.getIdItem() == 2&&w1.getHp()<3) {

                            w1.setHp(w1.getHp() + 1);
                            labelhp.setText(w1.getHp() + "vidas");
                            itemlist.remove(i2);
                            paneltitulo.remove(potionlabel);
                            paneltitulo.repaint();
                        } else {
                            System.out.println("no tienes la pocion");
                        }

                    }


                }


            }
            //   x >= 0 && x <= Panelmain.getWidth() - labelTrash.getWidth()
            if (x >= 0 && x <= panelmain.getWidth() - warrior.getWidth() &&
                    y >= 0 && y <= panelcenter.getHeight() - warrior.getHeight()) {
                w1.setYposition(y);
                w1.setXposition(x);


                warrior.setLocation(x, y);
                w1.showposition();
            }


            /*
            w1.setYposition(y);
            w1.setXposition(x);
            warrior.setLocation(x, y);
            w1.showposition();

*/

        }

    }

    private class movepriest extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            super.keyPressed(e);
            x = priest.getX();
            y = priest.getY();

            switch (e.getKeyCode()) {

                case KeyEvent.VK_LEFT ->
                        x = p1.moveLeft(priestLeft, p1.getSpeed(), priest, priestDown, priestRight, priestUp);
                case KeyEvent.VK_RIGHT ->
                        x = p1.moveRight(priestRight, p1.getSpeed(), priest, priestDown, priestLeft, priestUp);
                //  x = w1.moveRight(IMG_RIGHT, w1.getSpeed(), warrior);
                case KeyEvent.VK_DOWN ->
                        y = p1.moveDown(priestDown, p1.getSpeed(), priest, priestUp, priestLeft, priestRight);
                case KeyEvent.VK_UP ->
                        y = p1.moveUp(priestUp, p1.getSpeed(), priest, priestDown, priestLeft, priestRight);
                case KeyEvent.VK_A -> System.out.println(p1.toString());
                case KeyEvent.VK_SPACE -> {
                    for (int i = 0; i < itemlist.size(); i++) {
                        Item i22 = itemlist.get(i);
                        if (i22.getIdItem() == 2) {
                            w1.setHp(w1.getHp() + 1);
                            labelhp.setText(w1.getHp() + "vidas");
                            itemlist.remove(i2);
                            paneltitulo.remove(potionlabel);
                            paneltitulo.repaint();
                        } else {
                            System.out.println("no tienes la pocion");
                        }

                    }


                }


            }
            //   x >= 0 && x <= Panelmain.getWidth() - labelTrash.getWidth()
            if (x >= 0 && x <= panelmain.getWidth() - priest.getWidth() &&
                    y >= 0 && y <= panelcenter.getHeight() - priest.getHeight()) {
                p1.setYposition(y);
                p1.setXposition(x);


                priest.setLocation(x, y);
                p1.showposition();
            }


            /*
            w1.setYposition(y);
            w1.setXposition(x);
            warrior.setLocation(x, y);
            w1.showposition();

*/

        }

    }


    public void leerClassificacion() {
        String filename = "src/res/puntuaciones.txt";
        BufferedReader br;
        String line;
        String[] datos;
        System.out.println("-----------------------");
        String punt = "PUNTUACIONES DE LOS ANTERIORES JUGADORES";
        System.out.println(punt);
        System.out.println("-----------------------");
        try {
            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {
                datos = line.split(";");


                for (int i = 0; i < datos.length; i++) {

                    System.out.print(datos[i] + " ");


                }
                System.out.println();
                System.out.println("------------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("no se ha encontrado el fichero");

        } catch (IOException e) {
            System.out.println("error leyendo el fichero");
        }
    }


    public static void main(String[] args) throws IOException {


        JFrame frame = new JFrame("Prueba");

        frame.setContentPane(new Main2().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(350, 100);
        frame.setLayout(null);
        frame.setSize(1100, 675);
        frame.setResizable(false);


    }
}
