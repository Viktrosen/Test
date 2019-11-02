import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Generator {
    @Autowired
Person person;
List<Person> list;

    void gen(){
person.setBalance((int)(Math.random()*20+3));
person.setNumber((long)(Math.random()*500000000+1000000000));


    }


}
