import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/*<applet code="p10.class" width="320"
height="120"></applet>*/

public class p10 extends Frame implements ActionListener 
{
	 TextField t1,t2,resultNum;
	p10()
	{
		Frame f=new Frame(); 

		Button b1=new Button("Add"); 
		Button b2=new Button("Subtract"); 
		Button b3=new Button("Multiply"); 
                Button b4=new Button("Divide");  
	
		
  		t1=new TextField(15); 		
		
   		t2=new TextField(15); 
  	

          	resultNum = new TextField(15);
		
  
		f.setSize(300,300);   	
		
		f.add(t1);
		f.add(t2);
		f.add(resultNum);
		f.add(b1);	
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setLayout(new FlowLayout());  
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.setVisible(true);  
	}
		public void actionPerformed(ActionEvent e)
		{ 
     			 double fn = Double.parseDouble(t1.getText());
      			 double sn = Double.parseDouble(t2.getText());
			 double yo;
			 String str=e.getActionCommand();
			 if(str.equals("Add"))
                	 {
				yo=fn+sn;
      			 	resultNum.setText("  " + (yo));
			 }
			 if(str.equals("Subtract"))
                	 {
				yo=fn-sn;
      			 	resultNum.setText("  " + (yo));
			 }
			 if(str.equals("Multiply"))
                	 {
				yo=fn*sn;
      			 	resultNum.setText("  " + (yo));
			 }
			 if(str.equals("Divide"))
                	 {
				yo=fn/sn;
      			 	resultNum.setText("  " + (yo));
			 }
		}

public static void main(String args[])
{
	p10 a=new p10();
}
}