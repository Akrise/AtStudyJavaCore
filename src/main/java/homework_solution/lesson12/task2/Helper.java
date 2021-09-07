package homework_solution.lesson12.task2;

import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Helper {

    public static String getJsonArrayFromXls(String path, String sheetName) throws IOException {
        Workbook workbook = new XSSFWorkbook(path);
        Sheet sheet = workbook.getSheet(sheetName);
        List<String> tags = new ArrayList<>();
        List<Map<String, String>> sheetAsMap = new ArrayList<>();
        for (Cell cell : sheet.getRow(0)) {
            tags.add(cell.getStringCellValue());
        }
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            int j = 0;
            Map<String, String> entity = new LinkedHashMap<>();
            for (Cell cell : sheet.getRow(i)) {
                entity.put(tags.get(j), cell.getStringCellValue());
                j++;
            }
            sheetAsMap.add(entity);
        }
        return new Gson().toJson(sheetAsMap);
    }

    public static String getXmlFromXls(String path, String sheetName) throws IOException {
        Workbook workbook = new XSSFWorkbook(path);
        Sheet sheet = workbook.getSheet(sheetName);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\\\"1.0\\\"?>").append(System.lineSeparator());
        stringBuilder.append("<").append(sheetName).append(">").append(System.lineSeparator());
        List<String> tags = new ArrayList<>();
        for (Cell cell : sheet.getRow(0)) {
            tags.add(cell.getStringCellValue());
        }
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            int j = 0;
            stringBuilder.append("\t<").append(sheetName, 0, sheetName.length() - 1).append(">").append(System.lineSeparator());
            for (Cell cell : sheet.getRow(i)) {
                stringBuilder.append("\t\t<").append(tags.get(j)).append(">").append(cell.getStringCellValue()).append("</").append(tags.get(j)).append(">").append(System.lineSeparator());
                j++;
            }
            stringBuilder.append("\t</").append(sheetName, 0, sheetName.length() - 1).append(">").append(System.lineSeparator());
        }
        stringBuilder.append("</").append(sheetName).append(">").append(System.lineSeparator());
        return stringBuilder.toString();
    }
}
