package aijihui;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by maozhijian on 18/5/14.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cupSize;

    private Integer age;

    public  Girl(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
