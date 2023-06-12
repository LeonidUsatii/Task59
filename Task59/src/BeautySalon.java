import java.util.Deque;
import java.util.LinkedList;

public class BeautySalon {
    private final Deque<Client> clientsQueue;

    private final Deque<Client> manicure;

    private final String title;

    private int count;

    public BeautySalon(String title) {
        this.clientsQueue = new LinkedList<>();
        this.manicure = new LinkedList<>();
        this.title = title;
        this.count = 0;
    }

    public Deque<Client> getClientsQueue() {
        return clientsQueue;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "BeautySalon{" +
                "clientsQueue=" + clientsQueue +
                ", title='" + title + '\'' +
                ", count=" + count +
                '}';
    }

    public void register(Client client) {
        if (count <= 20) {
            clientsQueue.push(client);
        } else {
            System.out.println("Мест нет на сегодня");
        }
        count++;
    }

    public void registerManicure(Client client) {
        if (count <= 20) {
            manicure.push(client);
        } else {
            System.out.println("Мест нет на сегодня");
        }
        count++;
    }

    void treatNextClient() {
        if (clientsQueue.size() > 0) {
            clientsQueue.getLast().setHasHaircut(true);
            System.out.println(clientsQueue.getLast().getName() + " пострижен");
            clientsQueue.pollLast();
            count--;
        } else {
            System.out.println("Очередь пуста");
        }
    }

    void treatNextClientManicure() {
        if (manicure.size() > 0) {
            manicure.getLast().setHasHaircut(true);
            System.out.println(manicure.getLast().getName() + " маникюр сделан");
            manicure.pollLast();
            count--;
        } else {
            System.out.println("Очередь пуста");
        }
    }
}
