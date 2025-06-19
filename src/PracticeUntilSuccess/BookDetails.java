package PracticeUntilSuccess;

public class BookDetails {

/*Make a Book class with title, author, price. Add a method displayDetails().*/

    public static void main(String[] args){

    BooksDetails books=new BooksDetails("Harsh Dabhade","unknown Writer",233);
    BooksDetails books2=new BooksDetails("Harsh","known Writer",3552);
    books.displayDetails();
    books2.displayDetails();
    }
}

class BooksDetails{

    String title;
    String author;
    double price;

    BooksDetails(String title,String author,double price){

        this.title=title;
        this.author=author;
        this.price=price;
    }

    void displayDetails(){
        System.out.println("Title Of the Book :"+title+"\nAuthor Of the Book :"+author+"\nPrice Of the Book :"+price);
    }


}
