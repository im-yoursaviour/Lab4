public class main {
    public static void main(String[] args){
        Book loki = new Book("lalay", "loki the lion king", 35);
        System.out.println(loki.getAuthor());
        loki.printDetails();
        loki.setRefNumber("54545");
        System.out.println(loki.getRefNumber());
        loki.printDetails();
    }
}
