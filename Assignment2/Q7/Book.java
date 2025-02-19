package Assignment2.Q7;

public class Book extends LIbraryResource {
    int pageCount;
    Book(String title, String author, int pc){
        super(title,author);
        this.pageCount = pc;

    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
     public void displayDetails(){
         System.out.println("The details are ");
         System.out.println("The Title is "+this.title+" "+"The Author is "+this.author+" "+" the pagecount is "+this.pageCount );
     }
}
