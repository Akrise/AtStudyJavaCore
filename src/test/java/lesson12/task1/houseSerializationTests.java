package lesson12.task1;

import com.fasterxml.jackson.core.JsonProcessingException;
import homework_solution.lesson12.task1.House;
import homework_solution.lesson12.task1.helpers.JsonHelper;
import homework_solution.lesson12.task1.helpers.XmlHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class houseSerializationTests {

    @Test
    public void serializeHouseToJson() {
        House house = new House().generate();
        JsonHelper jsonHelper = new JsonHelper();
        String expectedJson = "{\"flats\":[{\"rooms\":[{\"width\":5,\"height\":3},{\"width\":5,\"height\":3}]},{\"rooms\":[{\"width\":5,\"height\":3},{\"width\":5,\"height\":3}]},{\"rooms\":[{\"width\":5,\"height\":3},{\"width\":5,\"height\":3}]},{\"rooms\":[{\"width\":5,\"height\":3},{\"width\":5,\"height\":3}]},{\"rooms\":[{\"width\":5,\"height\":3},{\"width\":5,\"height\":3}]}]}";
        Assertions.assertEquals(expectedJson, jsonHelper.serialize(house));
    }

    @Test
    public void serializeHouseToXML() {
        House house = new House().generate();
        XmlHelper xmlHelper = new XmlHelper();
        String expectedXml = "<House><flats><flats><rooms><rooms><width>5</width><height>3</height></rooms><rooms><width>5</width><height>3</height></rooms></rooms></flats><flats><rooms><rooms><width>5</width><height>3</height></rooms><rooms><width>5</width><height>3</height></rooms></rooms></flats><flats><rooms><rooms><width>5</width><height>3</height></rooms><rooms><width>5</width><height>3</height></rooms></rooms></flats><flats><rooms><rooms><width>5</width><height>3</height></rooms><rooms><width>5</width><height>3</height></rooms></rooms></flats><flats><rooms><rooms><width>5</width><height>3</height></rooms><rooms><width>5</width><height>3</height></rooms></rooms></flats></flats></House>";
        try {
            Assertions.assertEquals(expectedXml, xmlHelper.serialize(house));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
