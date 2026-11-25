import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int x = sc.nextInt();

        int position = 1;
        int answer = -1;
        Node temp = head;

        while (temp != null) {
            if (temp.data == x) {
                answer = position;
                break;
            }

            temp = temp.next;
            position++;
        }

        System.out.println(answer);
        sc.close();
    }
}