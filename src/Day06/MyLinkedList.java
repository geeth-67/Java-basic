package Day06;


public class MyLinkedList {

    Node head;
    int size;

    //add function
    public void insertAtBeginning(int value){
        //step 1
        Node newNode = new Node(value);
        //step 2
        newNode.next = head;
        //step 3
        head = newNode;
    }

    public void insertAtLast(int value){
        //Step 01
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }

        Node current = head;
        while(current.next != null){
            current =current.next;
        }
        current.next =newNode;
    }

    public void insertAtPosition(int position, int value){

        Node newNode = new Node(value);
        Node current = head;

        int index = 1;
        while (current != null){
            if(index == position -1){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            index ++ ;
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    //Display
    public void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current =current.next;
        }
    }
}


