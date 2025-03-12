import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        Library stack = new Library();
        Borrow queue = new Borrow();

        while(true){
            System.out.println("\nLibrary Management System");
            System.out.println("1. Borrowing a Book");
            System.out.println("2. Process Borrow Request");
            System.out.println("3. View Borrow Requests");
            System.out.println("4. Borrower Returning a Book");
            System.out.println("5. View Returned Books");
            System.out.println("6. Place Returned Book");
            System.out.println("7. Exit");
            System.out.print("Select: ");
            int a = s.nextInt();
            s.nextLine();

            switch (a){
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bid = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter Book Title: ");
                    String btitle = s.nextLine();
                    System.out.print("Enter Author: ");
                    String bauthor = s.nextLine();
                    queue.enqueue(bid, btitle, bauthor);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int rid = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter Book Title: ");
                    String rtitle = s.nextLine();
                    System.out.print("Enter Author: ");
                    String rauthor = s.nextLine();
                    stack.push(rid, rtitle, rauthor);
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    stack.pop();
                    break;
                case 7:
                    System.out.println("Exiting system....");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}