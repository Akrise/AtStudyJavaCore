package lesson11.task4;

import homework_solution.lesson11.task4.FileHelper;
import homework_solution.lesson11.task4.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class FileHelperTests {

    @Test
    public void parseFromExistingSheet() {
        List<Person> persons = FileHelper.getPersonFromExcel("src\\main\\java\\homework_solution\\lesson11\\task4\\persons.xlsx", "Persons1");
        Assertions.assertEquals("Иванов", persons.get(0).getSurname());
        Assertions.assertEquals("Михаил", persons.get(1).getFirstname());
        Assertions.assertEquals("Александрович", persons.get(2).getPatronim());
        Assertions.assertEquals(LocalDate.of(1972, 05, 18), persons.get(3).getBirthDate());
        Assertions.assertEquals("4502", persons.get(4).getPassport().getSeries());
        Assertions.assertEquals("532212", persons.get(5).getPassport().getNumber());
    }

    @Test
    public void parseFromSheetWithUnparseableRows() {
        List<Person> persons = FileHelper.getPersonFromExcel("src\\main\\java\\homework_solution\\lesson11\\task4\\persons.xlsx", "Persons2");
        Assertions.assertEquals("Иванов", persons.get(0).getSurname());
        Assertions.assertEquals("Михаил", persons.get(1).getFirstname());
        Assertions.assertEquals("Александрович", persons.get(2).getPatronim());
        Assertions.assertNotEquals("Константин", persons.get(3).getFirstname());
        Assertions.assertEquals(LocalDate.of(1985, 11, 19), persons.get(3).getBirthDate());
        Assertions.assertEquals("4504", persons.get(4).getPassport().getSeries());
        Assertions.assertEquals("532212", persons.get(4).getPassport().getNumber());
        Assertions.assertEquals(5, persons.size());
    }

    @Test
    public void wrongSheetName() {
        List<Person> persons = FileHelper.getPersonFromExcel("src\\main\\java\\homework_solution\\lesson11\\task4\\persons.xlsx", "Persons3");
        Assertions.assertNull(persons);
    }

    @Test
    public void wrongDocumentName() {
        List<Person> persons = FileHelper.getPersonFromExcel("src\\main\\java\\homework_solution\\lesson11\\task4\\Notpersons.xlsx", "Persons2");
        Assertions.assertNull(persons);
    }
}
