package How2J_study.Java7;

public class Hero4 {
    public String name = "some hero";

    public Hero4(){
        name = "one hero";
    }
    {
        name = "the hero";
    }
    public static void main(String[] args){
        Hero4 h1 = new Hero4();
        System.out.println(h1.name);
    }

}