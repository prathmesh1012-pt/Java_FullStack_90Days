import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
public class LambdaExpression{
    public static void main(String []args){
        Predicate<Integer> predicate = (i) -> i<10;
        System.out.println(predicate.test(6));

        Consumer<String> printmesg = ptm -> System.out.println("logging:" +ptm);
        printmesg.accept("The device!");

        Supplier<Double> getRandomNo = () -> Math.random();
        System.out.println(getRandomNo.get());

        Function<String, Integer> getLength = str -> str.length();
        System.out.println("The length of Devplus is "+ getLength.apply("DevPlus"));
    }
}