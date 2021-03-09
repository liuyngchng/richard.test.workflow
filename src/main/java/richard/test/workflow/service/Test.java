package richard.test.workflow.service;

import javax.persistence.PreUpdate;
import java.io.Serializable;

public class Test implements Serializable {

    public String name;

    public String size;

    public Test(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @PreUpdate
    void preUpdate(Object object) {
    }
}
