import java.awt.*;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.JComponent;


public class ImagePanel extends JComponent {

 private java.awt.Image content;

 public ImagePanel()  {
  super();
  setBounds(0, 0, 10, 10);

 }

 public ImagePanel(int x, int y, int w, int h)  {
  super();
  setBounds(x, y, w, h);

 }

 public ImagePanel(int x, int y, int w, int h, String s)  {
  super();
  setBounds(x, y, w, h);
        setImage(s);

 }

 public void setImage(String s)  {
   java.net.URL url = getClass().getResource(s);  // for applets
   if (url == null)   {
     url = getClass().getResource("/"+s);
     if (url == null)
       try {  // for applications
       content = ImageIO.read(new File(s));
     } catch(IOException ioe) {
       ioe.printStackTrace();
     }
     else
       content = getToolkit().getImage(url);
   } else
     content = getToolkit().getImage(url);
 }


 public void paint(Graphics g)  {
   g.drawImage(content, 0, 0, getWidth(), getHeight(), this);
   paintChildren(g);
 }


}

