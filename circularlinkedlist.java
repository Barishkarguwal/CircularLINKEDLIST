package baris;

public class circularlinkedlist {
	node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
			next=null;
		}
	}
	      public static void main(String args[]){
	    	  circularlinkedlist obj=new circularlinkedlist();
	    	  obj.push(1);
	    	  obj.push(2);
	    	  obj.push(6);
	    	  obj.push(18);
	    	  System.out.println("linkedlist");
	    	  obj.print();
	      }
          public void push(int new_data){
             node new_node=new node(new_data);
             new_node.next=head;
             if(head!=null){
            	 node curr=head;
            	while(curr.next!=head){
            		curr=curr.next;
            	}
            	curr.next=new_node;
            	head=new_node;
             }
             else{
            	 new_node.next=new_node;
            	 head=new_node;
             }
              
          }
          public void print(){
        	  node temp1=head;
        	  do{
        		  System.out.println(+temp1.data);
        		  temp1=temp1.next;
        	  }while(temp1!=head);
          }
}
