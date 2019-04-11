import java.util.function.Consumer;

/**
 * Created by Wing Yu on 2019/4/10 17:23).
 * Blog: http://www.wingyu.org/
 * GitHub: https://github.com/wing324
 * Email: wing.yumin@gmail.com
 */
public class ChainOfResponsibilityLambda {
    public static void main(String[] args) {
        /* Lambda Expression */
        Consumer<String> handler1 = (String request) -> {
            if (request.equals("R1")){
                System.out.println("Handler1 => This one is mine!");
            }
        };
        Consumer<String> handler2 = (String request) -> {
            if (request.equals("R2")){
                System.out.println("Handler2 => This one is mine!");
            }
        };
        Consumer<String> handler3 = (String request) -> {
            if (request.equals("R3")){
                System.out.println("Handler3 => This one is mine!");
            }
        };

        /* Combine Function */
        Consumer chain = handler1.andThen(handler2).andThen(handler3);
        chain.accept("R1");
        chain.accept("R2");
        chain.accept("R3");
    }
}
