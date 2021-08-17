package lesson12.task2;

import homework_solution.lesson12.task2.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HelperTests {

    @Test
    public void getXmlFromSheetUsersTest() throws IOException {
        String result = Helper.getXmlFromXls("src\\main\\java\\homework_solution\\lesson12\\task2\\data.xlsx", "users");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void getXmlFromSheetProjectsTest() throws IOException {
        String result = Helper.getXmlFromXls("src\\main\\java\\homework_solution\\lesson12\\task2\\data.xlsx", "projects");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void getXmlFromSheetRolesTest() throws IOException {
        String result = Helper.getXmlFromXls("src\\main\\java\\homework_solution\\lesson12\\task2\\data.xlsx", "roles");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void getJsonFromSheetUsersTest() throws IOException {
        String result = Helper.getJsonArrayFromXls("src\\main\\java\\homework_solution\\lesson12\\task2\\data.xlsx", "users");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void getJsonFromSheetProjectsTest() throws IOException {
        String result = Helper.getJsonArrayFromXls("src\\main\\java\\homework_solution\\lesson12\\task2\\data.xlsx", "projects");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void getJsonFromSheetRolesTest() throws IOException {
        String result = Helper.getJsonArrayFromXls("src\\main\\java\\homework_solution\\lesson12\\task2\\data.xlsx", "roles");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }
}
