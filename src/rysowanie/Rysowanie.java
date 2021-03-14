
package rysowanie;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Wilk
 */
public class Rysowanie extends JFrame {
    public Rysowanie()
    {
        this.setTitle("Rysowanie"); // tytul
        this.setBounds(250, 300, 300, 250);//Ustaliłem wielkość obramówki
        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String[] args) {
        new Rysowanie().setVisible(true); // uwidocznienie obramówki
        
    }
    
    final private PanelRysowiak panelDoRysowania = new PanelRysowiak();
}
class PanelRysowiak extends JPanel
{
   
   
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        // boki kostki do gry i napis kosc
        g.drawString("kosc do gry", 80, 30);
        g.drawLine(90, 100, 130, 130); 
        g.drawLine(130, 130, 170, 90); 
        g.drawLine(170, 90, 130, 60); 
        g.drawLine(90, 100, 130, 60); 
        g.drawLine(90,100,90,140); 
        g.drawLine(130,130,130,170); 
        g.drawLine(90,140,130,170); 
        g.drawLine(170,90,170,130); 
        g.drawLine(170,130,130,170);
        // kropki w kostce
        g.fillOval(104, 127, 10, 10); // lewa scianka
        //gorna scianka
        g.fillOval(110, 90, 10, 10);
        g.fillOval(140, 90, 10, 10);
        // prawa scianka
        g.fillOval(136, 127, 10, 10); //1 
        g.fillOval(154, 110, 10, 10); //2
        g.fillOval(136, 143, 10, 10); //3
        g.fillOval(154, 125, 10, 10); //4
        Graphics2D g2 = (Graphics2D)g;
        
        System.out.println(i++);
    } 
    
    public static int i = 0;
}