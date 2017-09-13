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

    public Men(int age) {
        this.age = age;
        this.sex = "M";
        this.profession = "Butcher";
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

    public Women(int age) {
        this.age = age;
        this.sex = "W";
        this.profession = "Medical";
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

        Men men = new Men(27);
        Women women = new Women(17);

        humanCollector.addHuman(men);
        humanCollector.addHuman(women);
    }
}