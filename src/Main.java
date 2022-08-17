import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        for (Person client : generateClients()) {
            queue.offer(client);
        }

        while (!queue.isEmpty()) {
            if (queue.element().tickets > 0) {
                System.out.println(queue.element().usingtTicket() + queue.element().delTicket());
                queue.offer(queue.poll());
            } else {
                queue.poll();
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Билл", "Гейтс", 5));
        clients.add(new Person("Джефф ", "Безос", 10));
        clients.add(new Person("Илон", "Макс", 15));
        return clients;
    }
}
