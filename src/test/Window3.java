
package test;

import java.awt.*;
import javax.swing.*;

public class Window3 extends JFrame{
    Container c;
    JTable t;
    JScrollPane sp;
    
    
    
    public Window3(){
        super("");
        c=this.getContentPane();

        Color w= new Color(44,62,80);
        Color w1= new Color(255,62,44);
        Color w2= new Color(59,185,255);
        Color w3= new Color(248,148,6);
        Color w4= new Color(211,19,34);
        //color
        
        Font f1 = new Font("Verdana", Font.BOLD, 14);
        Font f2 = new Font("Verdana", Font.BOLD, 18);
        //font
        
        Object r[][]=Student.dll.printUnsorted();
	 String s[]= {"id","First Name","Last Name","Mid","Final","Total","Grade"};
	    t=new JTable(r,s);
            t.setEnabled(false);
            t.setBackground(w);
            t.setForeground(Color.white);
            t.setGridColor(w4);
            t.setFont(f1);
         
	    sp=new JScrollPane(t);
            sp.setFont(f2);
            sp.setBackground(w4);
            c.add(sp);
            
        setVisible(true);
        setLocation(600,200);//location
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,700); 
    }

    
}
