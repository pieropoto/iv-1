import java.util.Random;
import java.util.stream.IntStream;

public class Starter {
    public static void main(String[] args) {
        RandomSort randomSort=new RandomSort();

        int[] array = IntStream.generate(()->new Random().nextInt(100)).limit(10).toArray();

        for(int number:array){
            System.out.println(number + " ");
        }
        System.out.println();

        int counter = randomSort.sort(array);

        for(int number:array){
            System.out.println(number + " ");
        }
        System.out.println("Array shuffled for "+counter+" times");
    }
}