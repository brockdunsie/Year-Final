public class Character extends Sprite {
    protected int tcount, x, y;
    public Character(int deltax, int deltay, String fpath){
        this.setLocation(deltax,deltay);
        this.changeImage(fpath);
        this.setSize(50,50);
    }
    public void changeImage(String path){
        this.setImage(path);
    }
    @Override
    public void move(int x, int y, int count) {
        this.setLocation(x, y);
        tcount += 1;
        if (count == tcount) {
            System.out.println("done");
        }
    }
}
