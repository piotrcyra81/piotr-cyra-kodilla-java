package mytests;

class Application
{
    public static void main(String[] args) {

       SimpleCalculator calculator = new SimpleCalculator();//konstruktor niejawny

        double resultAdd = calculator.addAToB(5.55, 4.45);
        double resultSubstract = calculator.substractAFromB(25.75, 10.75);

        System.out.println("Add result = " + resultAdd);
        System.out.println("Substract result = " + resultSubstract);

        User andrew = new User("Andrew", "male");
        User piter = new User("Piter", "male");


        String name = piter.getName();
        String sex = piter.getSex();

        System.out.println("User name = " + andrew.getName());
        System.out.println("User sex = " + andrew.getSex());

        System.out.println("Next user = " + name + " " + sex);

    }
}
