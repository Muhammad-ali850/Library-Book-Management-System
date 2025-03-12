public class Borrow{ //Queue
    private Book front, rear;
    
    public void enqueue(int id, String title, String author) {
        Book newBook = new Book(id, title, author);
        if (rear == null) {
            front = rear = newBook;
        } else {
            rear.next = newBook;
            rear = newBook;
        }
        System.out.println("Book request added: " + title);
    }
    
    public void dequeue() {
        if (front == null) {
            System.out.println("No borrow requests.");
            return;
        }
        System.out.println("Processing borrow request: " + front.title);
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
    
    public void display() {
        if (front == null) {
            System.out.println("No borrow requests.");
            return;
        }
        Book temp = front;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author);
            temp = temp.next;
        }
    }
}
