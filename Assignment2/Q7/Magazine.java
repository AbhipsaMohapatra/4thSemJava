package Assignment2.Q7;

public class Magazine extends LIbraryResource {
    String issueDate;
    Magazine(String t,String a,String id){
        super(t,a);
        issueDate = id;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public void displayDetails(){
        System.out.println("The details are ");
        System.out.println("The Title is "+this.title+" "+"The Author is "+this.author+" "+" the issue date is "+this.issueDate );
    }
}
