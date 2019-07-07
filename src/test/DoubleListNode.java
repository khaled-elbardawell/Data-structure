
package test;


public class DoubleListNode {
    	protected  Student info;
	protected  DoubleListNode next;
        protected  DoubleListNode prev;

	public DoubleListNode(){
		this(null,null,null);
	} 
	public DoubleListNode(Student info,DoubleListNode next,DoubleListNode prev){
		this.info=info;
		this.next=next;
                this.prev=prev;
	}
	
	public  void setinfo(Student info){
			this.info=info;
	}
	
	public Student getinfo(){
		return  info;
	}
	
	public void setNext(DoubleListNode next){
		this.next=next;
	}
        
        public void setPrev(DoubleListNode prev){
		this.prev=prev;
	}
	
	public DoubleListNode getNext(){
		return next;
	}
        
        public DoubleListNode getPrev(){
		return prev;
	}
        
        
}
	


