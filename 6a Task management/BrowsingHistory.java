import java.util.ArrayDeque;
import java.util.Deque;

public class BrowsingHistory {
    private Deque<String> history;
    private String currentPage;

    public BrowsingHistory() {
        history = new ArrayDeque<>();
        currentPage = null;
    }

    public void addPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
    }

    public void goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
        } else {
            System.out.println("No previous pages.");
        }
    }

    public void goForward(String page) {
        history.push(currentPage);
        currentPage = page;
    }

    public void displayCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }

    public static void main(String[] args) {
        BrowsingHistory bh = new BrowsingHistory();
        bh.addPage("Homepage");
        bh.addPage("About Us");
        bh.displayCurrentPage();

        bh.goBack();
        bh.displayCurrentPage();

        bh.goForward("Contact");
        bh.displayCurrentPage();
    }
}
