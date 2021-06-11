package homework_solution.lesson4.task3.workers;

import java.util.regex.Pattern;

public class ServiceDesk {
    private int ticketNumber = 1;

    public void createTicket(String description) {
        System.out.println("Заявка " + ticketNumber + " была создана: " + description);
        if (Pattern.compile("(справк|отчет|бюджет)+").matcher(description).find()) {
            Accountant.takeTicket(ticketNumber);
        }
        if (Pattern.compile("(доставк|курьер)+").matcher(description).find()) {
            Logistician.takeTicket(ticketNumber);
        }
        if (Pattern.compile("(компьютер|принтер|сервер)+").matcher(description).find()) {
            SysAdmin.takeTicket(ticketNumber);
        }
        if (Pattern.compile("(уборк)+").matcher(description).find()) {
            Cleaner.takeTicket(ticketNumber);
        }
        if (!Pattern.compile("(справк|отчет|бюджет|доставк|курьер|компьютер|принтер|сервер|уборк)+").matcher(description).find()) {
            System.out.println("Специалист по выполнению данной заявки не найден");
        }
        ticketNumber++;
    }
}
