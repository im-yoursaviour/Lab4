public class Book {
    //The fields
    private String author;
    private String title;
    private int pages;
    private String refNumber= "";
    private boolean onLoan;
    private int loanCount;

    //constructor
    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
        onLoan = false;
        loanCount = 0;

    }


    public String getAuthor() {
        return author;
    }
    public String getTitle(){
        return title;
    }

    public void setRefNumber(String refNumber){
        if(refNumber.length() >= 3) {
            this.refNumber = refNumber;
        }else {
            System.out.println("inappropriate input");
        }
    }
    public String getRefNumber(){
        return refNumber;
    }

    public boolean getOnloan(){
        return onLoan;

    }
    public int getLoanCount(){
        return loanCount;
    }

    public void borrow(){
        if(onLoan == false){
            onLoan = true;
            loanCount++;
        }else{
            System.out.println("The book is on loan");
        }

    }

    public void returnBook(){
        if(onLoan == false ){
            System.out.println("the book is not on loan");
        }else{
            onLoan = false;
        }
    }

    public void printDetails(){

        String loanMessage = "";
        if(onLoan == true){
            loanMessage = "unavailable";
        }else{
            loanMessage = "available";

        }
        if(refNumber == ""){
            System.out.println("Title: " + title + " The author is: " + author + " The number of pages is: "+ pages +
                    " and the book reference is zzzz. Currently the book is "+ loanMessage+ " and has been borrowed "
                    +Integer.toString(loanCount) + " times");
        }else {
            System.out.println("Title: " + title + " The author is: " + author + " The number of pages is: "+ pages +
                    "and the book reference is: "+ refNumber + " Currently the book is " + loanMessage+ " " +
                    "and has been borrowed " + Integer.toString(loanCount) + " times" );
        }
    }


}
