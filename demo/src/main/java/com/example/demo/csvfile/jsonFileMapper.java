package com.example.demo.csvfile;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class jsonFileMapper {
    static HashMap<Object, Object> jsonFileMapperBeanIntegerHashMap = new HashMap<>();

    public static void main(String[] args) {

        String fileName = "C:\\Users\\91626\\whitetiger\\studentjson.txt";
        //mapJsonToJavaBeans(fileName);
        readFile(fileName);
    }

    static void mapJsonToJavaBeans(String fileName) throws IOException {

       /* ObjectMapper mapper = new ObjectMapper();
        InputStream is = JsonFileMapperBean.class.getResourceAsStream("/test.json");
        testObj = mapper.readValue(is, JsonFileMapperBean.class);*/

        ObjectMapper objectMapper = new ObjectMapper();
        JsonFileMapperBean example = objectMapper.readValue(new File(fileName), JsonFileMapperBean.class);

        List<JsonFileMapperBean> jsonFileMapperBeans = new ArrayList<>();

        System.out.println(" Exsmple  :: >> " + example);

    }

    static void readFile(String fileName) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileName)) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            System.out.println(" obj : " + obj.toString());
            JSONArray employeeList = (JSONArray) obj;
            // System.out.println(employeeList.toJSONString());

            //Iterate over employee array

            employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));

            System.out.println(" after all operatopn  >>> p- map is :" + jsonFileMapperBeanIntegerHashMap);

            // employeeList.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void parseEmployeeObject(JSONObject emp) {

        System.out.println("haspmap >>> " + jsonFileMapperBeanIntegerHashMap);
        if (jsonFileMapperBeanIntegerHashMap.containsKey(emp.get("id"))) {

            int duration = 0;
            if (emp.get("state").toString().contains("finish")) {
                // calculate time by getting the id of it.
                //System.out.println(" emp detail  from map : ** " + jsonFileMapperBeanIntegerHashMap.get(emp));
                System.out.println(" id of finished event is : >>>>  " + emp.get("id"));

                //JsonFileMapperBean jsonFileMapperBean = (JsonFileMapperBean) jsonFileMapperBeanIntegerHashMap.get(emp);

                Object oldTs = jsonFileMapperBeanIntegerHashMap.get(emp.get("id"));
                Long newTs = (Long) emp.get("timestamp");
               /* LocalDate start_date = new LocalDate();
                LocalDate localDate= new LocalDate
                Date end_date = new Date((Long) oldTs);*/
                //duration = start_date.getSeconds() - end_date.getSeconds();

                System.out.println(" date differen is : " + duration);

             /*   Period diff
                        = Period
                        .between(start_date,
                                end_date);*/
                // emp.get("timestamp")
            }
            jsonFileMapperBeanIntegerHashMap.put(emp.get("id"), duration);
        } else {
            jsonFileMapperBeanIntegerHashMap.put(emp.get("id"), emp.get("timestamp"));
        }


        // System.out.println("map is :"+ jsonFileMapperBeanIntegerHashMap);
    }

    static void calculateTime(JsonFileMapperBean jsonFileMapperBean) {


    }


}
