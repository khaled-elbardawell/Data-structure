/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import jdk.nashorn.internal.objects.annotations.Constructor;

public class Window2 extends JFrame  implements ActionListener{
    Container c;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    JButton b1,b2,b3,b4;
    int t1,n=0,n1=0,n2=0;
    String grade;
    
  public Window2(){
      super ("");
      c=this.getContentPane();
      setLayout(null);
      
    Color w= new Color(44,62,80);
    Color w1= new Color(255,62,44);
    Color w2= new Color(59,185,255);
    Color w3= new Color(248,148,6);
    Color w4= new Color(211,19,34);
    //color

    Font f1 = new Font("Verdana", Font.BOLD, 14);
    Font f2 = new Font("Verdana", Font.BOLD, 18);
    //Font
	
     
    c.setBackground(w);
     
     lb1=new JLabel("ID");
     lb1.setBounds(20,20,200,30);
     lb1.setForeground(Color.white);
     lb1.setFont(f2);
     c.add(lb1);
     
     tf1=new JTextField();
     tf1.setBounds(140,20,250,30);
     c.add(tf1);
     tf1.addActionListener(this);
     
     lb2=new JLabel("First Name");
     lb2.setBounds(20,70,200,30);
     lb2.setFont(f2);
     lb2.setForeground(Color.white);
     c.add(lb2);
     
     tf2=new JTextField();
     tf2.setBounds(140,70,250,30);
     c.add(tf2);
     
     lb3=new JLabel("Last Name");
     lb3.setBounds(20,120,200,30);
     lb3.setFont(f2);
     lb3.setForeground(Color.white);
     c.add(lb3);
     
     tf3=new JTextField();
     tf3.setBounds(140,120,250,30);
     c.add(tf3);
     
     lb4=new JLabel("Mid Mark");
     lb4.setBounds(20,170,200,30);
     lb4.setFont(f2);
     lb4.setForeground(Color.white);
     c.add(lb4);
     
     tf4=new JTextField();
     tf4.setBounds(140,170,250,30);
     c.add(tf4);
     
     
     lb5=new JLabel("Final Mark");
     lb5.setBounds(20,220,200,30);
     lb5.setFont(f2);
     lb5.setForeground(Color.white);
     c.add(lb5);
     
     tf5=new JTextField();
     tf5.setBounds(140,220,250,30);
     c.add(tf5);
     
     
     lb6=new JLabel("Total Mark");
     lb6.setBounds(20,270,200,30);
     lb6.setFont(f2);
     lb6.setForeground(Color.white);
     c.add(lb6);
     
     tf6=new JTextField();
     tf6.setBounds(140,270,250,30);
     tf6.setEditable(false);
     c.add(tf6);
     
     lb7=new JLabel("Grade");
     lb7.setBounds(20,320,200,30);
     lb7.setFont(f2);
     lb7.setForeground(Color.white);
     c.add(lb7);
     
     tf7=new JTextField();
     tf7.setBounds(140,320,250,30);
     tf7.setEditable(false);
     c.add(tf7);
     
     b1=new JButton("cancel");
     b1.setBounds(230,400,100,30);
     b1.setFont(f1);
     b1.setForeground(Color.white);
     b1.setBackground(w1);
     b1.addActionListener(this);
     if(Window1.bo1){
        c.add(b1);
     }


     
     b2=new JButton("OK");
     b2.setBounds(110,400,100,30);
     b2.setFont(f1);
     b2.setForeground(Color.white);
     b2.setBackground(w2);
     b2.addActionListener(this);
     c.add(b2);
     

     
     b3=new JButton("more");
     b3.setBounds(350,400,100,30);
     b3.setFont(f1);
     b3.setForeground(Color.white);
     b3.setBackground(w4);
     b3.addActionListener(this);
     if(Window1.bo){
     c.add(b3);
     }
     
     b4=new JButton("cancel");
     b4.setBounds(230,400,100,30);
     b4.setFont(f1);
     b4.setForeground(Color.white);
     b4.setBackground(w1);
     b4.addActionListener(this);
     if(Window1.bo){
     c.add(b4);
     }
     

    
    setVisible(true);
	
    setLocation(600,200);//location
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(500,550); 
     
  }// End  Constructor
  
///////////////////////////////////////////////////////
  
    @Override
  public void actionPerformed(ActionEvent event){
    	try {
      
      
      
      
/****************************************************/

    if(event.getSource()==b2){
        
      String s=tf1.getText();
      String s1=tf2.getText();
      String s2=tf3.getText();
      String s3=tf4.getText();
      String s4=tf5.getText();
      //get Text from TextField
      
       n=Integer.parseInt(s);
       n1=Integer.parseInt(s3);
       n2=Integer.parseInt(s4);
      //casting string to int
      t1=n1+n2;//sum mid(n1)+final(n2)
        
        
        
        
        if(Student.dll.search(n)==false) {//search id of student
            if(Student.dll.checkname(s1)==true) {//check name **dont have number
                if(Student.dll.checkname(s2)==true) {//check name **dont have number
                    if(Student.dll.checkmid(n1)==true) {//check mid mark **I have to be the maximum 40
                        if(Student.dll.checkfinal(n2)==true) {//check final mark **I have to be the maximum 60
                        	  if(n>=0) {
                                      
          tf6.setText(t1+"");//set total in TextField (tf6)
          tf7.setText(getgrade(t1));//set grade in TextField (tf7) and call method getgrade
          JOptionPane.showMessageDialog(null,""+getgrade(t1)+"  "+tf6.getText());
        if(Window1.num==0){//if num=0 call creat method
          Student.dll.creat(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1)));
            }else if(Window1.num==1){//if num=1 call insertAtHead method
                    Student.dll.insertAtHead(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1))); 
                }else if(Window1.num==2){//if num=2 cal insertAtFirstl method
                    Student.dll.insertAfterFirst(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1)));
                }else if(Window1.num==3){//if num=3 call insertAtLast method 
                    Student.dll.insertAtLast(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1)));
            }
        
          new Window1();
          this.dispose();
                        	  }else if(n<0) {
					JOptionPane.showMessageDialog(null," The id is erorr");
                                    }
                        }else if(Student.dll.checkfinal(n2)==false) {
                            tf5.setText("");
                            JOptionPane.showMessageDialog(null," The final is erorr"); 
                            }
                    } else if(Student.dll.checkmid(n1)==false) {
                        tf4.setText("");
                        JOptionPane.showMessageDialog(null," The mid is erorr"); 
                    }
		}else if(Student.dll.checkname(s2)==false) {
                    tf3.setText("");
                    JOptionPane.showMessageDialog(null," The Last name is erorr"); 
		}
						 
            } else if(Student.dll.checkname(s1)==false) {
		tf2.setText("");
		JOptionPane.showMessageDialog(null," The first name is erorr"); 
            }

	}else if(Student.dll.search(n)==true) {
            tf1.setText("");
            JOptionPane.showMessageDialog(null," Id is Founded . pleas Enter the id changed");   
			    	 
			    	
	}
          
         
        }//End If b2
    
/********************************************/ 

      if(event.getSource()==b3){
          
          String s=tf1.getText();
      String s1=tf2.getText();
      String s2=tf3.getText();
      String s3=tf4.getText();
      String s4=tf5.getText();
      //get Text from TextField
      
       n=Integer.parseInt(s);
       n1=Integer.parseInt(s3);
       n2=Integer.parseInt(s4);
      //casting string to int
      t1=n1+n2;//sum mid(n1)+final(n2)
          
          
          
          
        if(Student.dll.search(n)==false) {//search id of student
            if(Student.dll.checkname(s1)==true) {//check name **dont have number
                if(Student.dll.checkname(s2)==true) {//check name **dont have number
                    if(Student.dll.checkmid(n1)==true) {//check mid mark **I have to be the maximum 40
                        if(Student.dll.checkfinal(n2)==true) {//check final mark **I have to be the maximum 60
                            if(n>=0) {
          tf6.setText(t1+"");//set total in TextField (tf6)
          tf7.setText(getgrade(t1));//set grade in TextField (tf7) and call method getgrade
          JOptionPane.showMessageDialog(null,""+getgrade(t1)+"  "+tf6.getText());
        if(Window1.num==0){//if num=0 call creat method 
          Student.dll.creat(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1)));
            }else if(Window1.num==1){//if num=1 call insertAtHead method 
                    Student.dll.insertAtHead(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1))); 
                }else if(Window1.num==2){//if num=2 call insertAfterFirst method 
                    Student.dll.insertAfterFirst(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1)));
                }else if(Window1.num==3){//if num=3 call insertAtLast method 
                    Student.dll.insertAtLast(new Student(n, n1, n2,t1 , s1, s2, getgrade(t1)));
            }
        

          new Window2();
          this.dispose();
          
          
          
                            }else if(n<0) {
					JOptionPane.showMessageDialog(null," The id is erorr");
                                    }
                        }else if(Student.dll.checkfinal(n2)==false) {
                            tf5.setText("");
                            JOptionPane.showMessageDialog(null," The final is erorr"); 
                            }
                    } else if(Student.dll.checkmid(n1)==false) {
                        tf4.setText("");
                        JOptionPane.showMessageDialog(null," The mid is erorr"); 
                    }
		}else if(Student.dll.checkname(s2)==false) {
                    tf3.setText("");
                    JOptionPane.showMessageDialog(null," The Last name is erorr"); 
		}
						 
            } else if(Student.dll.checkname(s1)==false) {
		tf2.setText("");
		JOptionPane.showMessageDialog(null," The first name is erorr"); 
            }

	}else if(Student.dll.search(n)==true) {
            tf1.setText("");
            JOptionPane.showMessageDialog(null," Id is Founded . pleas Enter the id changed");   
			    	 
			    	
	}
      
      }//end if b3
    	 }catch(Exception e) {
 			
			 JOptionPane.showMessageDialog(null," Please enter correctly");
	    }	
      
/********************************************/ 

      if(event.getSource()==b1||event.getSource()==b4){//if click in button cancle
          tf1.setText("");
          tf2.setText("");
          tf3.setText("");
          tf4.setText("");
          tf5.setText("");
          tf6.setText("");
          //set empty text from TextField
         
        }//end if b1
     
  
  }//End Action Method
///////////////////////////////////////////
  //getgrade method **return grade(string)
  public String getgrade(int t){
      grade="" ;
                if(t >=60 && t<=69) {
			grade="Pass";
		}else if(t>=70 && t<=79) {
			 grade="Good";
		}else if(t >=80 && t<=89) {
			grade="Vary Good";
		}else if(t >=90 && t<=100) {
			grade="Exelant";
		}else {
			 grade="failed";
		}
        return grade;
  }//End grade Method
/////////////////////////////////////////


}//End Window2 class


