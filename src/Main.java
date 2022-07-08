import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Dog> dalmatian = new HashSet<>();
        for (int i = 1; i <=40; i++) {
            dalmatian.add(new Dog("1" + i, 10 + i));
        }
        for (Dog d : dalmatian) {
                System.out.println(d.toString());
            System.out.println(dalmatian.size());
            }
        }
    }
