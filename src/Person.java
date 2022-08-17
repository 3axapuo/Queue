public class Person {
    private String name;
    private String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String usingtTicket() {
        return this.name + " "
                + this.surname + " использовал билет прокатившись на аттракционе, осталось ";
    }

    public int delTicket() {
        return tickets -= 1;
    }
}
