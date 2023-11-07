public class PaginatedWebPageDecorator extends WebPageDecorator {
    public PaginatedWebPageDecorator(WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void display() {
        super.display();
        paginateResults();
    }

    private void paginateResults() {
        System.out.println("Splitting search results across multiple pages.");
    }
}
