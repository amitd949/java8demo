package com.example.demo.csvfile;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvtojavaMappping {
    public static void main(String[] args) throws FileNotFoundException {
parseAndProcess();
    }
    static void parseAndProcess() throws FileNotFoundException {

        Map<String, String> mapping = new
                HashMap<String, String>();
        mapping.put("name", "name");
        mapping.put("age", "age");
        mapping.put("address", "address");


        HeaderColumnNameTranslateMappingStrategy<Student> strategy =
                new HeaderColumnNameTranslateMappingStrategy<Student>();
        strategy.setType(Student.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    ("C:\\Users\\91626\\whitetiger\\studentcsv.txt"));
        }
        catch (FileNotFoundException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();

        // call the parse method of CsvToBean
        // pass strategy, csvReader to parse method
        List<Student> list = csvToBean.parse(strategy, csvReader);

        List<Object> studentList= new CsvToBeanBuilder<>(new FileReader("C:\\Users\\91626\\whitetiger\\studentcsv.txt")).withType(Student.class)
                .build().parse();

        for (Object e : studentList) {
            if(e instanceof  Student) {
                Student student=
                        (Student)e;
                System.out.println( "using other mapper :"+e);
            }
        }

        // print details of Bean object
        for (Student e : list) {
            System.out.println(e);
        }
    }
}
