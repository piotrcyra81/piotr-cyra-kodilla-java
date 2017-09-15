import java.util.ArrayList;
import java.util.List;

public interface Human {
    int getHumanAge();
    String humanSex();
    String getProfession();
}

class Men implements Human{

    int age;
    String sex;
    String profession;

    public Men(int age, String profession) {
        this.age = age;
        this.profession = profession;
        this.sex = "M";
    }

    public int getHumanAge(){
        return age;
    }

    public String humanSex(){
        return sex;
    }

    public String getProfession(){
        return profession;
    }

    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

class Women implements Human{

    int age;
    String sex;
    String profession;

    public Women(int age, String profession) {
        this.age = age;
        this.sex = "W";
        this.profession = profession;
    }

    public int getHumanAge(){
        return age;
    }

    public String humanSex(){
        return sex;
    }

    public String getProfession(){
        return profession;
    }

    @Override
    public String toString() {
        return "Women{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

class HumanCollector {

    List<Human> adultsList = new ArrayList<>();
    List<Human> childrenList = new ArrayList<>();

    public void addHuman(Human human) {

        if(human.getHumanAge()>18) {
            adultsList.add(human);
        }
        else{
            childrenList.add(human);
        }
    }
}

class TestHumanAge
{
    public static void main (String[] args) throws Exception
    {
        HumanCollector humanCollector = new HumanCollector();

        Men men1 = new Men(27, "Butcher");
        Men men2 = new Men(16, "Actor");
        Men men3 = new Men(44, "Carpenter");
        Men men4 = new Men(65, "Plumber");
        Men men5 = new Men(16, "Model");

        Women women1 = new Women(15,"Actress");
        Women women2 = new Women(17,"Student");
        Women women3 = new Women(38,"Pilot");
        Women women4 = new Women(19,"Driver");
        Women women5 = new Women(58,"Nurse");

        humanCollector.addHuman(men1);
        humanCollector.addHuman(men2);
        humanCollector.addHuman(men3);
        humanCollector.addHuman(men4);
        humanCollector.addHuman(men5);

        humanCollector.addHuman(women1);
        humanCollector.addHuman(women2);
        humanCollector.addHuman(women3);
        humanCollector.addHuman(women4);
        humanCollector.addHuman(women5);

        System.out.println("Children list = " + humanCollector.childrenList);
        System.out.println("Adults list = " + humanCollector.adultsList);
    }
}