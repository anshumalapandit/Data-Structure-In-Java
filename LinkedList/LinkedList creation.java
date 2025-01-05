import java.io.*;
import java.util.*;

public class Solution {
public static class Node{
    int data;
    Node next;
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node head=a;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
