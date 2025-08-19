import java.util.Scanner;
class Node {
    int data;
    Node next;
}
public class linkedlist {
    Node head = null;
    void insert(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted: " + value);
    }
    void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted: " + value);
        }
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int choice = 0;
        Scanner Sc = new Scanner(System.in);
        linkedlist list = new linkedlist();
        while (choice != 4) {
            System.out.println("Choose your choice:");
            System.out.println("1. insertion, 2. deletion, 3. display, 4. exit");
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = Sc.nextInt();
                    list.insert(val);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    int del = Sc.nextInt();
                    list.delete(del);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }
    }
}
