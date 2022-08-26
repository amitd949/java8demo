package com.example.demo.csvfile;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Data
@Getter
@Setter
@ToString
public class JsonFileMapperBean {
    private String id;
    private String name;
    private String state;
    private  Long timestamp;
   /* private String appName;
    private String appType;
    private String hostName;*/
    // private String exectitionTimeinMs;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonFileMapperBean that = (JsonFileMapperBean) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, state);
    }
}
