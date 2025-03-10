import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  
    public Node(int data){
        this.data=data;
        this.next=null;
    }
  }
  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // write code here
        Node newNode=new Node(val);
        if(head==null && tail==null){
        head=tail=newNode;
        }else{
        tail.next=newNode;
        tail=newNode;
        }
        size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("exit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}    
