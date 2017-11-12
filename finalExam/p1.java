// To implement Movie Ticket Booking System using AWT
// Chinmay Shah

import java.awt.event.*;


import java.awt.*;
import java.applet.*;

/*<applet code="p1.class" width="320"
height="120"></applet>*/

public class p1 extends Frame implements ActionListener 
{
    List movie_hall_name, movie_name;
    TextField no_ticket;
    TextArea zzs ;
    Button b1;
    Frame f;
	p1()
	{
        f=new Frame();
        f.setSize(500, 500);
        movie_hall_name = new List();

        movie_hall_name.add("a, vashi");
        movie_hall_name.add("b, parle");
        movie_hall_name.add("c, parle");

        movie_name = new List();
        movie_name.add("kingsman");
        movie_name.add("some random 1");
        movie_name.add("some random 2");
        movie_name.add("some random 3");

        no_ticket = new TextField(15);
        zzs = new TextArea();
        b1 = new Button("Submit");

        b1.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.add(movie_hall_name);
        f.add(movie_name);
        f.add(no_ticket);
        f.add(zzs);
        f.add(b1);
        f.setLocation(10, 10);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    { 
        double fn = Double.parseDouble(no_ticket.getText());
        String str=e.getActionCommand();
        if(str.equals("Submit"))
        {
            double cost  = fn * 100.0;
            String data = "hall name Selected: " 
            + movie_hall_name.getItem(movie_hall_name.getSelectedIndex());

            String data2 = "movie name Selected: " 
            + movie_name.getItem(movie_name.getSelectedIndex());

            zzs.setText(data+"\n"+data2+"\n"+"no tickets "+fn+" "+ cost);

        }        
        
    }

    public static void main(String args[])
    {
        p1 a = new p1();
    }
}