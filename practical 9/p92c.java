import java.awt.*;
import java.applet.*;
 
public class p92c extends Applet{
       
        public void paint(Graphics g){
               
                g.drawOval(60, 60, 300, 200);
                g.drawRect(150,100,100,100);
                g.drawOval(175,125,50,50);
                //g.fillArc(110, 130, 95, 95, 0, -180);
        }
}
/*<applet code="p92c.class" height="500" width="500">
</applet>*/
