package com.company;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node push(int nodeValue) {
        Node temp=new Node();
        temp.value=nodeValue;

        temp.next=null;

        if(head==null){

            head=temp;
            tail=temp;
            size++;
        }
        else{
            Node t= head;
            while (t.next!=null){
                t=t.next;
            }
            t.next=temp;
            tail=temp;

            size++;
        }
        return head;
    }
    public Node pop() {
        Node current= head;
        Node removeNode= head;
        if(head==null){
            System.out.println("list does not exist");
        }

        if(head==tail){
            head=tail=null;
            size--;
        }
        else{

            while (current.next!=tail){
                current=current.next;
                removeNode=current.next;
            }
            removeNode=current.next;
            current.next=null;
            tail=current;
            size--;
        }
        return removeNode;
    }

    public Node get(int index){
        if (index>=size){
           return null;
        }
        int antall=0;
        Node temp=head;
        while (temp!=null){

            if(antall!=index){
                temp=temp.next;
                antall++;

            }

            else{
                return temp;
            }
        }
        return null;
    }


    public String rotate(int number){
      if(number>=size){
          return "the list will be the same";
      }
      else{

          while (number>0){
              Node temp= head;
              head=head.next;
              tail.next=temp;
              temp.next=null;
              tail=temp;
              number--;
          }
      }
      return "feil";

    }

    public Node remove( int index){
        if(index>=size){
            return null;
        }
        else{
            int antall=index;
            Node t=new Node();
            t.next=head;
             Node temp= head;
            while ( antall>0){
                temp=temp.next;
                t=t.next;
                antall--;
            }
            t.next=temp.next;


        }
       return  null;
    }

    public void traverce(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
