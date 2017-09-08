package mytests;

import java.util.ArrayList;
import java.util.List;

public interface Human {
    public String getHumanSex();
    public int getHumanAge();
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

    public String getHumanSex(){
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
    public String getHumanSex(){
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

    Men men = new Men(27, "Men");
    Women women = new Women(17, "Women");

    public void humanAgeMen() {
        if (men.age>18){
        adultsList.add(men);
        }
        else {
            childrenList.add(men);
        }
    }

    public void humanAgeWomen() {
        if (women.age>18){
            adultsList.add(women);
        }
        else {
            childrenList.add(women);
        }
    }

    public void humanSex() {
        String resultManSex = men.getHumanSex();
        String resultWomanSex = women.getHumanSex();

        if (resultManSex.equals("Men")&&resultWomanSex.equals("Women")){
            System.out.println("Humans test OK");
        } else {
            System.out.println("Error! Aliens");
        }
    }

    public void showHumanAge(){
        System.out.println("Adults list = " + adultsList);
        System.out.println("Children list = " + childrenList);
    }
}

class TestHumanAge
{
    public static void main (String[] args) throws Exception
    {
        HumanCollector humanCollector = new HumanCollector();
        humanCollector.humanAgeMen();
        humanCollector.humanAgeWomen();
        humanCollector.humanSex();
        humanCollector.showHumanAge();
    }
}