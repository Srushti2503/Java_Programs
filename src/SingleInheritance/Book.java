package SingleInheritance;

/*Create a class Book with title and author.
Create a class EBook with fileSize.

 */


public class Book{
    String title="Java Programming";
    String author="James Gosling";
    void display(){
        System.out.println("Title of book:"+title);
        System.out.println("Author of boojk:"+author);

    }

    static void main(String[] args) {
        EBook aa= new EBook();
        aa.display();
        aa.showFileSize();
    }
}
class EBook extends Book {
    int fileSize=2;

    void showFileSize(){
        System.out.println("File size:"+fileSize);
    }
}
