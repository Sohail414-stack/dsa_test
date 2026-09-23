public class linkedlist {
    class Node{
        int data;
        Node next;

         Node(int data){
            this.data=data;
        }
    }
   public class ll{
        Node head;
        public void insertathead(int x){
            Node temp=new Node(x);
          
            temp.next=head;
            head=temp;
        }
        public void insertattail(int x){
           Node newnode=new Node(x);
           if(head == null) {
            head=newnode;
            return;
           }
           Node temp=head;
           while(temp.next != null){
            temp=temp.next;
           }
           temp.next=newnode;
           temp=newnode;

        }
        public void display(){
            Node temp=head;
            while(temp != null){
                System.out.print(temp.data + "" + "=>");
                temp=temp.next;
            }
        }
        public void deletathead(){
            if(head==null){
                System.out.println("list is empty ");
                return;
            }
            head=head.next;
        }
        public void deleteattail(){
            if(head==null){
                System.out.println("list is empty ");
                return;
            }
            Node temp=head;
            while(temp.next.next != null){
                temp=temp.next;
            }
            temp.next=null;
        }
        public void insertatpos(int idx,int data){
              Node newnode=new Node(data);
            if(head == null ){
             
             head=newnode;
             return;
            }
            // int count=0;
          
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                if(temp==null){
                    System.out.println("out of bounds ");
                    return;
                }
            temp=temp.next;
            }
            
            newnode.next=temp.next;
            temp.next=newnode;
        }
        public void dltatpos(int idx){
            Node temp=head;
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            for(int i=1;i<idx-1;i++){
                if(temp==null){
                    return;
                }
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args) {
      linkedlist obj=new linkedlist();
      ll l=obj.new ll();
    l.insertathead(5);
    l.insertathead(18);
    l.insertathead(20);
    l.display();
    System.out.println();
    l.insertattail(90);
     l.insertattail(700);
     l.insertattail(10);
     l.display();
     l.insertatpos(5, 40);
     l.dltatpos(2);
     System.out.println();
     l.display();

        
    }
}
