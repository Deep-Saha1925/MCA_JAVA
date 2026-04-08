import java.util.Random;

public class RandomNumbers {
    void randomNumbers() {
        Random rand = new Random();

        System.out.println("5 Random Numbers:");

        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(100) + 1;
            System.out.print(num + " ");
        }
    }
}

public class P15 {
    public static void main(String[] args) {
        RandomNumbers obj = new RandomNumbers();
        obj.randomNumbers();
    }
}