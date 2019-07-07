
package test;

public class DoubleLinkedList {
    DoubleListNode FirstNode;
    protected int length=0;
    int i=0;


///////////////////////////////////////////////////
        public void creat(Student info){
            if(FirstNode==null){
            DoubleListNode new_std =new DoubleListNode(info, null, null);
            FirstNode=new_std;
            length ++;
            }
        }
            
        
        
//////////////////////////////////////////////////	
	public void insertAtHead(Student info){

		DoubleListNode newNode=new DoubleListNode();
		newNode.info=info;
		newNode.next=null;
                newNode.prev=null;
                
                if(FirstNode!=null){
		FirstNode.prev=newNode;
                newNode.next=FirstNode;
                FirstNode=newNode;
		length++;
                }
	}
//////////////////////////////////////////////////
        public void insertAfterFirst(Student info){
            DoubleListNode newNode=new DoubleListNode();
                newNode.info=info;
		newNode.next=null;
                newNode.prev=null;
                if(FirstNode==null){
                    return;
                }else{
                newNode.next=FirstNode.next;
		FirstNode.next=newNode;
                FirstNode.next.prev=newNode;
                newNode.prev=FirstNode;
		length++;
               
                }
        }    
///////////////////////////////////////////////////
        public void insertAtLast(Student info){
            DoubleListNode f = FirstNode;
            DoubleListNode newNode=new DoubleListNode();
		newNode.info=info;
		newNode.next=null;
                newNode.prev=null;
                
                while(f.next!=null){
                    f=f.next;
                }
                
                f.next=newNode;
                newNode.prev=f;
		length++;
        }
//////////////////////////////////////////////////
	public int size(){
            return length;
	}
//////////////////////////////////////////////////
	
	public void DeleteAtLast(){
		DoubleListNode pre , current;
		if(FirstNode!=null){
			if(FirstNode.next==null){
				FirstNode=null;
 
			}
		else{
			pre=FirstNode;
			current=FirstNode.next;
				while(current.next!=null){
					pre=current;
					current=current.next;
				}
			pre.next=null;
                        current.prev=null;
			
		}
	  }
                if(FirstNode==null){
                    Window1.bo=false;
                    Window1.bo1=true;
                }
                length--;
	}
////////////////////////////////////////////////////
        public void DeleteAtHead(){

		if(FirstNode!=null){
			if(FirstNode.next==null){
				FirstNode=null;
        
			}
		else{
                            FirstNode=FirstNode.next;
                            FirstNode.prev=null;

			
		}
                if(FirstNode==null){
                    Window1.bo=false;
                    Window1.bo1=true;
                }
	  }
                length--;
	}
//////////////////////////////////////////////////////////////
        public void DeleteAfterFirst(){
            DoubleListNode pre;
		if(FirstNode!=null){
			if(FirstNode.next==null){
				FirstNode=null;

			}
		else{

                       pre=FirstNode.next.next;
                       pre.prev=FirstNode;
                       FirstNode.next=pre;
                    
	
		}
	  }
                if(FirstNode==null){
                    Window1.bo=false;
                    Window1.bo1=true;
                }
                length--;
	}
/////////////////////////////////////////////////////////////
        public Object[][] printUnsorted(){
            Object a[][]=new Object[size()][7];
            DoubleListNode o;
            o=FirstNode;
		while(o!=null) {
	            a[i][0]= o.info.getId();
	 	    a[i][1]= o.info.getFirstName();
	 	    a[i][2]= o.info.getLastName();
	 	    a[i][3]= o.info.getmid();
	 	    a[i][4]= o.info.getfinal();
	 	    a[i][5]= o.info.gettotal();
	 	    a[i][6]= o.info.getGrade();
	 	    i++;
	 	    o=o.next;
                }
                i = 0;
	    return a;
	}

//////////////////////////////////////////////
    public static boolean checkname(String name) {
	int i =0;   
	char x=  name.charAt(i);
	    while(i<name.length()){
	        if((x>=65 && x<=91) || (x>=97 && x<=123))
		    i++;
	        else{
	            return false;
	        }
            }
	return true;
    }
	            
/////////////////////////////////////////////////	            
    public static boolean checkmid(int mid) {
	if(mid>=0 && mid<=40) {
	    return true;
	}
	    return false;
    }
//////////////////////////////////////////////////
    public static boolean checkfinal(int f) {
	if(f>=0 && f<=60) {
	    return true;
	}
	return false;
    }
/////////////////////////////////////////////
    public boolean search(int n) {
        DoubleListNode p=FirstNode;
            while(p!=null) {
                if(p.info.getId()==n) {
                    return true;
                }else {
                    p=p.next;
                }
            }    
        
	return false;
    }    
////////////////////////////////////////
public void sort(){
    DoubleListNode n=null;
    DoubleListNode p=FirstNode;
    Student temp;
    
    while(p!=null){
    	n=p.next;
    while(n!=null){
    	
      if(p.info.getId()>n.info.getId()){
		temp=p.info;
		p.info=n.info;
		n.info=temp;
      }//end if
  
      	n=n.next;
      
     
    }
     p=p.next;
    }//end while
    
        
}
    
    
}//End Class


