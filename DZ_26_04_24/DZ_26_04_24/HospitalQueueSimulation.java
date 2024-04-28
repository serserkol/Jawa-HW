import java.util.HashSet;
import java.util.Set;

class Ticket {
    private String fio; // ФИО пациента
    private int number; // Номер талона
    private String doctorName; // Имя врача

    public Ticket(String fio, int number, String doctorName) {
        this.fio = fio;
        this.number = number;
        this.doctorName = doctorName;
    }

    public String getFio() {
        return fio;
    }

    public int getNumber() {
        return number;
    }

    public String getDoctorName() {
        return doctorName;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}

public class HospitalQueueSimulation {
    public static void main(String[] args) {
        // Создаем пустое множество для хранения талонов
        Set<Ticket> ticketSet = new HashSet<>();

        // Пример использования: добавляем некоторые талоны в множество
        ticketSet.add(new Ticket("Иван Иванов", 101, "Доктор Смирнов"));
        ticketSet.add(new Ticket("Мария Петрова", 102, "Доктор Иванова"));
        ticketSet.add(new Ticket("Алексей Сидоров", 103, "Доктор Петров"));

        // Выводим содержимое множества талонов
        for (Ticket ticket : ticketSet) {
            System.out.println("Талон " + ticket.getNumber() + ": " + ticket.getFio() +
                    " (Врач: " + ticket.getDoctorName() + ")");
        }
    }
}
