import java.util.Scanner;
import java.util.ArrayList;

class  Book{

    int id;
    String title;
    String author;

    Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }

    
}
public class LibraryManagementSystem{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        //ArrayList Declration

        ArrayList<Book> books = new ArrayList<>();
        int ch;
        do{
            System.out.println("####Menu######");
            System.out.println("1.Add Book");
            System.out.println("2.Display Book");
            System.out.println("3.Search Book");
            System.out.println("4.Delete Book");
            System.out.println("5.Update Book");
            System.out.println("6.Exit");

            System.out.println("Enter the choise;");
            ch = sc.nextInt();

            switch(ch){
                //Add book 
                case 1: System.out.println("Enter book id");
                        int bookId = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Enter book Title");
                        String title = sc.nextLine();
                        System.out.println("Enter book Author");
                        String author = sc.nextLine();

                        Book book =new Book(bookId,title,author);
                        books.add(book);
                        System.out.println("Book added Succesfully");
                        break;

                //Display
                case 2: System.out.println("Books in Library");
                        for (Book b : books)
                        {
                            System.out.println("Book Id: "+ b.id);
                            System.out.println("Book Title: "+ b.title);
                            System.out.println("Book Author: "+ b.author);
                            System.out.println("---------------------------");
                        }
                        break;

                //search
                case 3: System.out.println("Enter the Book id for search");
                        int searchId = sc.nextInt();
                        boolean found=false;
                        for (Book b : books)
                        {   if(searchId==b.id){
                            
                                System.out.println("Book found: ");
                                System.out.println("Book Id: "+ b.id);
                                System.out.println("Book Title: "+ b.title);
                                System.out.println("Book Author: "+ b.author);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.print("Book is not found");
                        }
                        break;
                       
                case 4: System.out.println("Enter Book ID to delete: ");
                        int deleteid = sc.nextInt();
                        Boolean deleted = false;
                        for(Book b:books){
                            if(deleteid == b.id){
                                books.remove(b);
                                System.out.println("Book deleted successfully.");
                                deleted = true;
                                break;
                            }
                        }
                        if(!deleted){
                            System.out.println("Book Not Found");
                        }

                case 5:System.out.println("Enter Book ID to Update details: ");
                        int id = sc.nextInt();
                         boolean updateFlag=false;
                        for (Book b : books)
                        {   if(id==b.id){
                                System.out.println("Enter new book id");
                                b.id = sc.nextInt();
                                System.out.println("Enter new book Title");
                                b.title = sc.nextLine();
                                System.out.println("Enter new book Author");
                                b.author = sc.nextLine();

                                System.out.println("Book update successfully.");
                                updateFlag=true;
                                break;
                            }
                        }
                        if(!updateFlag){
                            System.out.println("Book Not Found");
                        }
                      
                        break;
                default:System.out.println("Invaild Choise");
            }

        }while(ch!=6);

         System.out.println("Thank you");
                     

    }
}