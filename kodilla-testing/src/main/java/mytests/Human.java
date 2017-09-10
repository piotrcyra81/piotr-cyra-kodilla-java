package mytests;

import java.util.ArrayList;
import java.util.List;

public interface Human {
    public int getHumanAge();
}

class Men implements Human{

    int age;

    public Men(int age) {
        this.age = age;
    }

    public int getHumanAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                '}';
    }
}

class Women implements Human{

    int age;

    public Women(int age) {
        this.age = age;
    }

    public int getHumanAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Women{" +
                "age=" + age +
                '}';
    }
}

class HumanCollector {

    List<Human> adultsList = new ArrayList<>();
    List<Human> childrenList = new ArrayList<>();


    public void humanAgeMen(Men men) {
        if (men.age>18){
        adultsList.add(men);
        }
        else {
            childrenList.add(men);
        }
    }

    public void humanAgeWomen(Women women) {
        if (women.age>18){
            adultsList.add(women);
        }
        else {
            childrenList.add(women);
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

        Men men = new Men(27);
        Women women = new Women(17);

        humanCollector.humanAgeMen(men);
        humanCollector.humanAgeWomen(women);
        humanCollector.showHumanAge();
    }
}