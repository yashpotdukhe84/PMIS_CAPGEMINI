
import java.util.function.Consumer;

class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> pr = message -> System.out.println(message);

        pr.accept("Hello, I love cricket");
        

    }
}
