public class Dog {
    private String name;
    private int weight;


    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Dalmatian"+
                "\nname='" + name  +
                "\nweight=" + weight +
       "\nI am dalmatian and I have a lot of black spots";
    }
}
