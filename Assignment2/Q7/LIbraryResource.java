package Assignment2.Q7;

abstract class LIbraryResource {
    String title;
    String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LIbraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract public void displayDetails();
}
