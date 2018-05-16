import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Deck extends JFrame{
    protected Character Jeff;
    protected int i,size;
    protected Card temp;
    public Deck(){
        super("Jeff's Memory");
        this.setBounds(0, 0, 1500, 1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        size = 20;
        createcharacter();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_DOWN:   Jeff.setLocation(Jeff.getX(),Jeff.getY()+100);  keepInBounds(); ; break;
                    case KeyEvent.VK_UP: Jeff.setLocation(Jeff.getX(),Jeff.getY()-100); keepInBounds();  ; break;
                    case KeyEvent.VK_LEFT:  Jeff.setLocation(Jeff.getX()-100,Jeff.getY());  keepInBounds(); ; break;
                    case KeyEvent.VK_RIGHT:  Jeff.setLocation(Jeff.getX()+100,Jeff.getY()); keepInBounds(); ; break;
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
            Jeff.setLocation(50, Jeff.getY());
        }
        if (Jeff.getY()<0)
        {
            Jeff.setLocation(Jeff.getX(), 15);
        }
    }
    public void createDeck(){
        Card[] tower = new Card[size];
        for(int i  = 0; i <= 10; i++){
            for (int j = 0; j<=1; j++){
                String name = new String("Card" + i);
                tower[i] = setCardName(i,j);

            }
        }

        for (Card c: tower)
        {
            this.add(c);
        }
    }

    public Card setCardName(int i, int j){
        if(i==1){
            if(j==0){
                //Circle 1
                Card temp = new Card(100,100,100,100, "",1);
            }
            else if(j==1){
                Card temp = new Card(200,100,100,100, "",1);
            }
        }
        else if(i==2){
            if(j==0){
                Card temp = new Card(300,100,100,100, "",2);

            }
            else if(j==1){
                Card temp = new Card(400,100,100,100, "",2);

            }
        }
        else if(i==3){
            if(j==0){
                Card temp = new Card(100,200,100,100, "",3);

            }
            else if(j==1){
                Card temp = new Card(200,200,100,100, "",3);

            }
        }
        else if(i==4){
            if(j==0){
                Card temp = new Card(300,200,100,100, "",4);

            }
            else if(j==1){
                Card temp = new Card(400,200,100,100, "",4);

            }
        }
        else if(i==5){
            if(j==0){
                Card temp = new Card(100,300,100,100, "",5);

            }
            else if(j==1){
                Card temp = new Card(200,300,100,100, "",5);

            }
        }
        else if(i==6){
            if(j==0){
                Card temp = new Card(300,300,100,100, "",6);

            }
            else if(j==1){
                Card temp = new Card(400,300,100,100, "",6);

            }
        }
        else if(i==7){
            if(j==0){
                Card temp = new Card(100,400,100,100, "",7);

            }
            else if(j==1){
                Card temp = new Card(200,400,100,100, "",7);

            }
        }
        else if(i==8){
            if(j==0){
                Card temp = new Card(300,400,100,100, "",8);

            }
            else if(j==1){
                Card temp = new Card(400,400,100,100, "",8);

            }
        }
        else if(i==9){
            if(j==0){
                Card temp = new Card(100,500,100,100, "",9);

            }
            else if(j==1){
                Card temp = new Card(200,500,100,100, "",9);

            }
        }
        else if(i==10){
            if(j==0){
                Card temp = new Card(300,500,100,100, "",10);

            }
            else if(j==1){
                Card temp = new Card(400,500,100,100, "",10);

            }
        }
        else {
            Card temp = new Card(100,100,100,100, "", 1000000000);
        }

        return temp;
    }

}
