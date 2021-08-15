package homework_solution.lesson11.task4;

import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static List<Person> getPersonFromExcel(String path, String sheetName) {
        List<Person> persons = new ArrayList<>();
        try {
            Workbook workbook = new XSSFWorkbook(path);
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                return null;
            }
            for (Row row : sheet) {
                try {
                    persons.add(convertRowToPerson(row));
                } catch (ParseException | DateTimeParseException e) {
                }
            }
        } catch (InvalidOperationException | IOException e) {
            return null;
        }
        return persons;
    }

    private static Person convertRowToPerson(Row row) throws ParseException {
        return new Person(row.getCell(1).getStringCellValue(),
                row.getCell(0).getStringCellValue(),
                row.getCell(2).getStringCellValue(),
                LocalDate.parse(row.getCell(3).getStringCellValue(), DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                new Passport(row.getCell(4).getStringCellValue(), row.getCell(5).getStringCellValue()));
    }
}
