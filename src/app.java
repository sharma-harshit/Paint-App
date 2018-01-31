import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class app extends JFrame implements MouseMotionListener
{
    ArrayList<Point>al;
    @Override
    public void paint(Graphics g)
    {
       super.paint(g);
       for(int i = 1 ; i < al.size() ; i++ )
       {
           g.drawLine(al.get(i).x,al.get(i).y, al.get(i-1).x, al.get(i-1).y);
       }
    }
    public app()
    {
        //intializing frame
       
        setVisible(true);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseMotionListener(this);
        
        al = new ArrayList();
    }
    
    public static void main(String[] args)
    {
        new app();
    }

    @Override
    public void mouseDragged(MouseEvent e) 
    {
        al.add(getMousePosition());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        
    }
}
