import javax.swing.*;
import java.util.ArrayList;

public class Deck extends JFrame{
    protected Character Jeff;
    protected int i;
    public Deck(){
        super("Jeff's Memory");
        this.setBounds(0, 0, 1500, 1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        createcharacter();
    }
    public void createcharacter(){
        Jeff = new Character(100,100,"Snore.gif");
        this.add(Jeff);
        Jeff.setVisible(true);
    }
    public void createDeck(){
        ArrayList<Card> tower = new ArrayList<Card>();
        for(int i  = 0; i <= 10; i++){
            for (int j = 0; j<=1; j++){
                Card name = setCardName(i, j);

            }
        }
    }
    public Card setCardName(int i, int j){
        if(i==1){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==2){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==3){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==4){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==5){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==6){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==7){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==8){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==9){
            if(j==0){

            }
            else if(j==1){

            }
        }
        else if(i==10){
            if(j==0){

            }
            else if(j==1){

            }
        }

    }

}
