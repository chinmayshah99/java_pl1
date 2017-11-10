import java.awt.*;
import java.applet.*;
 
public class p92b extends Applet{
       
        public void paint(Graphics g){
               
                g.drawOval(60, 60, 200, 200);
                g.fillOval(90, 120, 20, 20);
                g.fillOval(210, 120, 20, 20);
                g.fillArc(110, 130, 95, 95, 0, -180);
        }
}
/*<applet code="p92b.class" height="500" width="500">
</applet>*/
