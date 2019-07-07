
package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Window1 extends JFrame implements ActionListener{
    Container c;
    JMenuBar mb1;
    JMenu m1,m2,m3,m4;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10;
    public static boolean bo=false;
    public static boolean bo1=true;
    public static int num=0;

    
  public Window1(){
    super("logging Form");
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
   
   c.setBackground(w);
    c.getForeground();
    

    mb1=new JMenuBar();//Manu Bar
    mb1.setBackground(w4);
    c.add(mb1,BorderLayout.NORTH);
    
    m1=new JMenu("Add");//mane add
    m1.setFont(f2);
    m1.setBackground(w3);
    m1.setForeground(Color.white);
    mb1.add(m1);
    
    m2=new JMenu("delete");//manu delete
    m2.setFont(f2);
    m2.setForeground(Color.white);
    mb1.add(m2);
    
    m3=new JMenu("print");//manu print
    m3.setFont(f2);
    m3.setForeground(Color.white);
    mb1.add(m3);
    
    mi10=new JMenuItem("Exit");//manu item exit
    mi10.setFont(f2);
    mi10.setForeground(Color.white);
    mi10.setBackground(w4);
    mb1.add(mi10);
    mi10.addActionListener(this);
    
    mi1=new JMenuItem("Creat");//manu item creat
    mi1.setFont(f1);
    mi1.setBackground(w1);
    mi1.setForeground(Color.white);
    mi1.setEnabled(bo1);
    m1.add(mi1);
    mi1.addActionListener(this);
    
    
    mi2=new JMenuItem("insert at head");//manu item insert at head
    mi2.setFont(f1);
    mi2.setBackground(w1);
    mi2.setForeground(Color.white);
    mi2.setEnabled(bo);
    m1.add(mi2);
    mi2.addActionListener(this);
    
    mi3=new JMenuItem("insert after first");//manu item insert after first
    mi3.setFont(f1);
    mi3.setBackground(w1);
    mi3.setForeground(Color.white);
    mi3.setEnabled(bo);
    m1.add(mi3);
    mi3.addActionListener(this);
    
    mi4=new JMenuItem("insert al last");//manu item insert al last
    mi4.setFont(f1);
    mi4.setBackground(w1);
    mi4.setForeground(Color.WHITE);
    mi4.setEnabled(bo);
    m1.add(mi4);
    mi4.addActionListener(this);
    
    mi5=new JMenuItem("delete last");//manu item delete last
    mi5.setFont(f1);
    mi5.setBackground(w1);
    mi5.setForeground(Color.white);
    mi5.setEnabled(bo);
    m2.add(mi5);
    mi5.addActionListener(this);
    
    mi6=new JMenuItem("delete after first");//manu item delete after first
    mi6.setFont(f1);
    mi6.setBackground(w1);
    mi6.setForeground(Color.white);
    mi6.setEnabled(bo);
    m2.add(mi6);
    mi6.addActionListener(this);
    
    mi7=new JMenuItem("delete from head");//manu item delete from head
    mi7.setFont(f1);
    mi7.setBackground(w1);
    mi7.setForeground(Color.white);
    mi7.setEnabled(bo);
    m2.add(mi7);
    mi7.addActionListener(this);
    
    mi8=new JMenuItem("print unsorted");//manu print unsorted
    mi8.setFont(f1);
    mi8.setBackground(w1);
    mi8.setForeground(Color.white);
    mi8.setEnabled(bo);
    mi8.addActionListener(this);
    m3.add(mi8);
    
    mi9=new JMenuItem("print sorted");//manu print sorted
    mi9.setFont(f1);
    mi9.setBackground(w1);
    mi9.setForeground(Color.white);
    mi9.setEnabled(bo);
    m3.add(mi9);
    mi9.addActionListener(this);
    
    setSize(600,350);//size
		
    setLocation(600,200);//location
		
    setVisible(true);//visible
		
    setDefaultCloseOperation(EXIT_ON_CLOSE);//close Window
    
  }//End constractor
    

    @Override
  public void actionPerformed(ActionEvent event){
      if(event.getSource()==mi1){
        new Window2();
        this.dispose();
        bo=true;
        bo1=false;
      }
      if(event.getSource()==mi2){
          num=1;
         new Window2();
          this.dispose();
      }
      if(event.getSource()==mi10)
          System.exit(0);//exit
      
      if(event.getSource()==mi3){
          num=2;
          new Window2();
          this.dispose();
      }
      
      if(event.getSource()==mi4){
          num=3;
          new Window2();
         this.dispose();
      }
      
      if(event.getSource()==mi5){
          Student.dll.DeleteAtLast();
          this.dispose();
          new Window1();
      }
      
      if(event.getSource()==mi6){
          Student.dll.DeleteAfterFirst();
          this.dispose();
          new Window1();
      }
      
      if(event.getSource()==mi7){
          Student.dll.DeleteAtHead();
          this.dispose();
          new Window1();
      }
      
      if(event.getSource()==mi8)
         new Window3();
         
      
      if(event.getSource()==mi9){
           Student.dll.sort();
           new Window3();
      }
       
     
  }
}