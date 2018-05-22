import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Deck extends JFrame{
    protected Character Jeff;
    protected int i,size, j;
    protected Card temp;
    protected Card[] tower;
    protected Random gen;
    public Deck(){
        super("Jeff's Memory");
        this.setBounds(0, 0, 1500, 1500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        size = 20;
        j = 0;
        Random gen = new Random();
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
        Card two1 = new Card(100, 100, 100, 100,"back.png","2x4.png", 1);
        tower[0] = two1;
        Card two2 = new Card(300, 100, 100, 100, "back.png","2x4.png", 1);
        tower[1] = two2;
        Card cone1 = new Card(500, 100, 100, 100, "back.png","ConeofShame.png", 2);
        tower[2] = cone1;
        Card cone2 = new Card(700, 100, 100, 100, "back.png","ConeofShame.png", 2);
        tower[3] = cone2;
        Card cyl1 = new Card(100, 300, 100, 100, "back.png","Cylinder.png", 3);
        tower[4] = cyl1;
        Card cyl2 = new Card(300, 300, 100, 100, "back.png","Cylinder.png", 3);
        tower[5] = cyl2;
        Card hay1 = new Card(500, 300, 100, 100, "back.png","HayBale.png", 4);
        tower[6] = hay1;
        Card hay2 = new Card(700, 300, 100, 100, "back.png","HayBale.png", 4);
        tower[7] = hay2;
        Card hex1 = new Card(100, 500, 100, 100, "back.png","Hexagon.png", 5);
        tower[8] = hex1;
        Card hex2 = new Card(300, 500, 100, 100, "back.png","Hexagon.png", 5);
        tower[9] = hex2;
        Card hex21 = new Card(500, 500, 100, 100, "back.png","Hexagon2.png", 6);
        tower[10] = hex21;
        Card hex22 = new Card(700, 500, 100, 100, "back.png","Hexagon2.png", 6);
        tower[11] = hex22;
        Card py1 = new Card(100, 700, 100, 100, "back.png","Pyramid.png", 7);
        tower[12] = py1;
        Card py2 = new Card(300, 700, 100, 100, "back.png","Pyramid.png", 7);
        tower[13] = py2;
        Card py21 = new Card(500, 700, 100, 100, "back.png","Pyramid2.png", 8);
        tower[14] = py21;
        Card py22 = new Card(700, 700, 100, 100, "back.png","Pyramid2.png", 8);
        tower[15] = py22;
        Card rect1 = new Card(100, 900, 100, 100, "back.png","Rectangle.png", 9);
        tower[16] = rect1;
        Card rect2 = new Card(300, 900, 100, 100, "back.png","Rectangle.png", 9);
        tower[17] = rect2;
        Card square1 = new Card(500, 900, 100, 100, "back.png","Square.png", 10);
        tower[18] = square1;
        Card square2 = new Card(700, 900, 100, 100, "back.png","Square.png", 10);
        tower[19] = square2;
        Card[][] grid = new Card[4][5];
        for (int i = 0; i <20; i++)
            tower[i] =
        for (Card c : tower) {
            this.add(c);
            c.setVisible(true);
            this.repaint();

        }
    }

    public void flipper(){
        for (Card c: tower
             ) {
            if (c.getX() <= Jeff.getX() + 50 && c.getX() >= Jeff.getX() - 50 && c.getY() <= Jeff.getY() + 50 && c.getY() >= Jeff.getY() - 50){
                c.flip();
            }
        }
    }

    public Card setCardName(int i, int j){
        if(i==1){
            if(j==0){
                //Circle 1
                Card temp = new Card(gen.nextInt(4),gen.nextInt(5),100,100 "2x4.png",1);
                j+=1
            }
            else if(j==1){
                Card temp = new Card(200,100,100,100, "2x4.png",1);
            }
        }
        else if(i==2){
            if(j==0){
                Card temp = new Card(300,100,100,100, "ConeofShame.png",2);

            }
            else if(j==1){
                Card temp = new Card(400,100,100,100, "ConeofShame.png",2);

            }
        }
        else if(i==3){
            if(j==0){
                Card temp = new Card(100,200,100,100, "Cylinder.png",3);

            }
            else if(j==1){
                Card temp = new Card(200,200,100,100, "Cylinder.png",3);

            }
        }
        else if(i==4){
            if(j==0){
                Card temp = new Card(300,200,100,100, "HayBale.png",4);

            }
            else if(j==1){
                Card temp = new Card(400,200,100,100, "HayBale.png",4);

            }
        }
        else if(i==5){
            if(j==0){
                Card temp = new Card(100,300,100,100, "Hexagon.png",5);

            }
            else if(j==1){
                Card temp = new Card(200,300,100,100, "Hexagon.png",5);

            }
        }
        else if(i==6){
            if(j==0){
                Card temp = new Card(300,300,100,100, "Hexagon2.png",6);

            }
            else if(j==1){
                Card temp = new Card(400,300,100,100, "Hexagon2.png",6);

            }
        }
        else if(i==7){
            if(j==0){
                Card temp = new Card(100,400,100,100, "Pyramid.png",7);

            }
            else if(j==1){
                Card temp = new Card(200,400,100,100, "Pyramid.png",7);

            }
        }
        else if(i==8){
            if(j==0){
                Card temp = new Card(300,400,100,100, "Pyramid2.png",8);

            }
            else if(j==1){
                Card temp = new Card(400,400,100,100, "Pyramid2.png",8);

            }
        }
        else if(i==9){
            if(j==0){
                Card temp = new Card(100,500,100,100, "Rectangle.png",9);

            }
            else if(j==1){
                Card temp = new Card(200,500,100,100, "Rectangle.png",9);

            }
        }
        else if(i==10){
            if(j==0){
                Card temp = new Card(300,500,100,100, "Square.png",10);

            }
            else if(j==1){
                Card temp = new Card(400,500,100,100, "Square.png",10);

            }
        }
        else {
            Card temp = new Card(100,100,100,100, "", 1000000000);
        }

        return temp;
    }

}
