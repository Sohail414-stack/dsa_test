public class doublyLinkedlist {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int x){
            this.data=x;
        }
    }
    class doubly_LL{
        Node head;
        Node tail;
        public void inserathead(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            newnode.next=head;
            head.prev=newnode;
            head=newnode;

        }
        public void inserattail(int data){
            Node newnode=new Node(data);
            if (head==null) {
                head=tail=newnode;
                return;
            }
         tail.next=newnode;
         newnode.prev=tail;
         tail=newnode;

        }
        public void dltathead(){
            if(head==null ){
                System.out.println("list is empty");
                return;
            }
           if(head==tail){
            head=tail=null;
            return;
           }

            head=head.next;
            head.prev=null;
        }
        public void dltattail(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            if(head==tail){
                head=tail=null;
                return;
            }
            tail=tail.prev;
            tail.next=null;
          
        }
        public void insertatpos(int idx,int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
            }
              if (idx == 1) {
              newnode.next = head;
              head.prev = newnode;
              head = newnode;
                return;
    }
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                if(temp==tail){
                     tail.next=newnode;
                     newnode.prev=tail;
                     tail=newnode;
                     return;

                }
                 if(temp.next==null){
                    return;
                }
                
                temp=temp.next;
            }
                
                    newnode.next=temp.next;
                    newnode.prev=temp;
                    temp.next.prev=newnode;
                    temp.next=newnode;
                    

                
            }
        
        public  void deleatpos(int idx){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            if(idx==1){
                head=tail=null;
                return;
            }
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                if(temp.next==null){
                      tail=tail.prev;
                      tail.next=null;
                      return;
                }
                 temp=temp.next;
            }
             if(temp.next==null){
                System.out.println("invalid position ");
                    return;
                }
                 if (temp.next == tail) {
                     tail = temp;
                     tail.next = null;
                     return;
                  }

               
            
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
        public void display(){
            if(head==null ){
                System.out.println("list is empty");
                return;
            }
            Node temp=head;
            while(temp != null){
                System.out.print(temp.data + "=>");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        doublyLinkedlist obj=new doublyLinkedlist();
        doubly_LL dl=obj.new doubly_LL();
        dl.inserathead(30);
        dl.inserathead(20);
        dl.inserathead(10);
        dl.display();
        System.out.println();
        dl.inserattail(40);
        dl.inserattail(50);
        dl.inserattail(60);
        dl.display();
        

    }
}
    

