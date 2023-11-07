public class AuthorizedWebPageDecorator extends WebPageDecorator {
    public AuthorizedWebPageDecorator(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void display() {
        super.display();
        authorize();
    }

    private void authorize() {
        System.out.println("Authorizing user for the web page.");
    }
}
