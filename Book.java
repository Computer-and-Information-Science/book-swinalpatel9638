public class Book {
  // put data members here
   private String title;
   private String author;
   private int numberOfPages;


  // put the constructor here
 public Book( String titleName , String authorName , int pageNumber){
  this.title = titleName;
  this.author = authorName;
  this.numberOfPages = pageNumber;


 }

  
  // put getters here
   public String getTitleName(){
      return this.title;
   }
 
 public String getAuthorName(){
    return this.author;
 }

 public int getPageNumber(){
  return this.numberOfPages;     

 }




  // put setters here

  public void setTitle(String newTitle){
    this.title = newTitle;
  }

 public void setAuthor(String newAuthor){
    this.author = newAuthor;
  }

public void setNumberOfPages(int newNumberOfPages){
    this.numberOfPages = newNumberOfPages;
  }

public void displayBook(){

  System.out.println(" The book " + this.title + " was wriiten by " + this.author + " and it has "  + this.numberOfPages + " pages." );
}


// The book Harry Potter was written by J.K. Rowling and it has 309 pages.


  //other member functions (methods here)
  
  public static void main(String[] args) {
    
    //create a student here
   
    Book book1 = new Book ( "Harry Potter" , "J.K.Rowling" , 309);
     Book book2 = new Book ("Atomic Habits" , "James Clear" , 279);
     Book book3 = new Book ("The Secret Revealed" ,"Rhonda Byrne" , 378);

    //call the displayStudent method here

book1.displayBook();              
book2.displayBook();
book3.displayBook();


// new page number

book2.setNumberOfPages(300);

book2.displayBook();

        
    }
}
