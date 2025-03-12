class Book{
    int id;
    String title;
    String author;
    Book next;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class Library { //Stack
    private Book top;

    public void push(int id, String title, String author) {
        Book newBook = new Book(id, title, author);
        newBook.next = top;
        top = newBook;
        System.out.println("Book added to the return stack: " + title);
    }

    public void pop() {
        if (top == null) {
            System.out.println("No books in the return stack.");
            return;
        }
        System.out.println(top.title + " Book placed on correct shelf ");
        top = top.next;
    }

    public void display() {
        if (top == null) {
            System.out.println("Return stack is empty.");
            return;
        }
        System.out.println("Books in return stack:");
        Book temp = top;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author);
            temp = temp.next;
        }
    }
}