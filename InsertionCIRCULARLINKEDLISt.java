package baris;



public class InsertionCIRCULARLINKEDLISt {
	 static node head;
     static class node{
    	 int data;
    	 node next;
    	 node(int d){
    		 data=d;
    		 next=null;
    	 }
     }
     public static void main(String args[]){
    	 InsertionCIRCULARLINKEDLISt obj=new InsertionCIRCULARLINKEDLISt();
    	obj.push(3);
    	 obj.push(8);
          obj.push(32);
             obj.push(14);
             obj.push(15);
    	 System.out.println("linked list");
    	 obj.print();
     }
         public void push(int new_data){
    	 node new_node1=new node(new_data);
    	   node curr=head;
    	   
    	 if(curr==null){
    		 new_node1.next=new_node1;
    		 head=new_node1;
    	 } 
    	  
    	 else if(curr.data>=new_node1.data){
    		 while(curr.next!=head)
    			curr=curr.next; 
    			
    			curr.next=new_node1;
    			new_node1.next=head;
    			head=new_node1;
    	 }
    	 else{
    		   while (curr.next != head&& curr.next.data < new_node1.data)
                    curr = curr.next;
     
                new_node1.next = curr.next;
                curr.next = new_node1;
    	 }
     }
         public void print(){
        	 node temp=head;
        	 do{
        		 System.out.println(+temp.data);
        		 temp=temp.next;
        	 }while(temp!=head);
         }
}












