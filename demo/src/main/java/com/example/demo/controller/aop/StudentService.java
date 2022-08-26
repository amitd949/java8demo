package com.example.demo.controller.aop;

import com.example.demo.csvfile.Student;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Timed1
    public void parseAndProcess() throws FileNotFoundException {

        Map<String, String> mapping = new
                HashMap<String, String>();
        mapping.put("name", "name");
        mapping.put("age", "age");
        mapping.put("address", "address");

        System.out.println("calling service class method ");
        HeaderColumnNameTranslateMappingStrategy<Student> strategy =
                new HeaderColumnNameTranslateMappingStrategy<Student>();
        strategy.setType(Student.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    ("C:\\Users\\91626\\whitetiger\\studentcsv.txt"));
        } catch (FileNotFoundException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();

        // call the parse method of CsvToBean
        // pass strategy, csvReader to parse method
        List<Student> list = csvToBean.parse(strategy, csvReader);

        List<Object> studentList = new CsvToBeanBuilder<>(new FileReader("C:\\Users\\91626\\whitetiger\\studentcsv.txt")).withType(Student.class)
                .build().parse();

        for (Object e : studentList) {
            if (e instanceof Student) {
                Student student =
                        (Student) e;
                System.out.println("using other mapper :" + e);
            }
        }

        // print details of Bean object
        for (Student e : list) {
            System.out.println(e);
        }
    }
}
