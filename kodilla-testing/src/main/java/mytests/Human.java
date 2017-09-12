package mytests;

import java.util.ArrayList;
import java.util.List;

public interface Human {
    public int getHumanAge();
    String humanSex();
}

class Men implements Human{

    int age;
    String sex;

    public Men(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public int getHumanAge(){
        return age;
    }

    public String humanSex(){
        return sex;
    }

    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class Women implements Human{

    int age;
    String sex;

    public Women(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public int getHumanAge(){
        return age;
    }

    public String humanSex(){
        return sex;
    }

    @Override
    public String toString() {
        return "Women{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class HumanCollector {

    List<Human> adultsList = new ArrayList<>();
    List<Human> childrenList = new ArrayList<>();

    public void addHuman(Human human) {

        if(human.getHumanAge()>18) {
            adultsList.add(human);
            System.out.println("Adults list = " + adultsList);
        }
        else{
            childrenList.add(human);
            System.out.println("Children list = " + childrenList);
        }
    }
}

class TestHumanAge
{
    public static void main (String[] args) throws Exception
    {
        HumanCollector humanCollector = new HumanCollector();

        Men men = new Men(27,"Mężczyzna");
        Women women = new Women(17, "Kobieta");

        humanCollector.addHuman(men);
        humanCollector.addHuman(women);
    }
}