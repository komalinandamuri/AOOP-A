import java.util.LinkedList;
import java.util.Queue;

public class SupportTicketSystem {
    private Queue<String> tickets;

    public SupportTicketSystem() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    public void processTicket() {
        if (!tickets.isEmpty()) {
            System.out.println("Processing ticket: " + tickets.poll());
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayTickets() {
        System.out.println("Pending tickets:");
        for (String ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public static void main(String[] args) {
        SupportTicketSystem sts = new SupportTicketSystem();
        sts.addTicket("Issue with login");
        sts.addTicket("Error in payment processing");
        sts.displayTickets();

        sts.processTicket();
        sts.displayTickets();
    }
}
