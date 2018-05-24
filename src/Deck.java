import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Deck extends JFrame{
    protected Character Jeff;
    protected int i,size, j,x,y;
    protected Card temp;
    protected Card[] tower;
    protected Random gen;
    protected Card[][] grid;
    protected boolean there;
    public Deck(){
        super("Jeff's Memory");
        this.setBounds(0, 0, 1500, 1500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        size = 20;
        j = 0;
        there = false;
        gen = new Random();
        createcharacter();
        createDeck();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_DOWN:   Jeff.setLocation(Jeff.getX(),Jeff.getY()+200);  keepInBounds(); ; break;
                    case KeyEvent.VK_UP: Jeff.setLocation(Jeff.getX(),Jeff.getY()-200); keepInBounds();  ; break;
                    case KeyEvent.VK_LEFT:  Jeff.setLocation(Jeff.getX()-200,Jeff.getY());  keepInBounds(); ; break;
                    case KeyEvent.VK_RIGHT:  Jeff.setLocation(Jeff.getX()+200,Jeff.getY()); keepInBounds(); ; break;
                    case KeyEvent.VK_SPACE: flipper(); break;
                }
            }
        });
    }
    public void createcharacter(){
        Jeff = new Character(100,100,"Snore.gif");
        this.add(Jeff);
        Jeff.setVisible(true);
    }
    private void keepInBounds(){
        if(Jeff.getX()<0)
        {
            Jeff.setLocation(100, Jeff.getY());
        }
        if (Jeff.getY()<0)
        {
            Jeff.setLocation(Jeff.getX(), 100);
        }
        if (Jeff.getX()>700)
        {
            Jeff.setLocation(700, Jeff.getY());
        }
        if (Jeff.getY()>900)
        {
            Jeff.setLocation(Jeff.getX(), 900);
        }
    }
    public void createDeck() {
        tower = new Card[size];
        grid = new Card[4][5];
        x = 100;
        y = 100;
        for (int i =0; i <20; i++)
        {
            setCardName(i);
        }

        for (int c = 0; c < 5; c++) {
            for (int d = 0; d < 4; d++) {
                this.add(grid[d][c]);
                this.repaint();
            }
        }
        for (int c = 0; c < 5; c++) {
                for (int d = 0; d < 4; d++) {
                    grid[d][c].setLocation(x, y);
                    x += 200;
                    this.repaint();
                }
                x = 100;
                y += 200;

            }
        }

    public void flipper(){
        for (Card c: tower) {
            if (c.getX() <= Jeff.getX() + 100 && c.getX() >= Jeff.getX() - 100 && c.getY() <= Jeff.getY() + 100 && c.getY() >= Jeff.getY() - 100){
                c.flip();
            }
        }
    }

    public void setCardName(int i){
        if(i==0) {
            do {
                int a = gen.nextInt(3);
                int b = gen.nextInt(4);
                if (grid[a][b] == null) {
                    Card temp = new Card(0, 0, 100, 100,"2x4.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==1) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(100, 0, 100, 100,"2x4.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==2) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"ConeofShame.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==3) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"ConeofShame.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==4) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Cylinder.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==5) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0,0, 100, 100,"Cylinder.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==6) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"HayBale.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==7) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"HayBale.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==8) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Hexagon.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==9) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Hexagon.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==10) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0,0, 100, 100,"Hexagon2.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==11) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Hexagon2.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==12) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Pyramid.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==13) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Pyramid.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==14) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Pyramid2.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==15) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Pyramid2.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==16) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0,0, 100, 100,"Rectangle.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==17) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Rectangle.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==18) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Square.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        if(i==19) {
            do {
                int a = gen.nextInt(4);
                int b = gen.nextInt(5);
                if (grid[a][b] == null) {

                    Card temp = new Card(0, 0, 100, 100,"Rectangle.png", 1);
                    there = true;
                    grid[a][b] = temp;
                }
            }while (!there);
        }
        there = false;
    }

}
