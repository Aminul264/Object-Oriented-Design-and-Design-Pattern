public class Program {
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();
        System.out.println("Basic web page:");
        myPage.display();

        myPage = new AuthorizedWebPageDecorator(myPage);
        System.out.println("\nAuthorized web page:");
        myPage.display();

        myPage = new PaginatedWebPageDecorator(myPage);
        System.out.println("\nAuthorized and Paginated web page:");
        myPage.display();
    }
}
