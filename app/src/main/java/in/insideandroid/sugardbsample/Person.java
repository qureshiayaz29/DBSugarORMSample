package in.insideandroid.sugardbsample;

import com.orm.SugarRecord;

public class Person extends SugarRecord {

    String name = "";
    int age = 0;

    public Person(){};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}