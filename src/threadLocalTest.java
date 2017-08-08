import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by lsj on 17/7/30.
 */

public class threadLocalTest {
    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread(i)).start();
        }


        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players.forEach((player) -> System.out.print(player + "; "));

        players = players.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
        players.stream().forEach(System.out::println);

        List<user> users = new ArrayList<>();
        for (int i=0;i<5;i++) {
            users.add(new user());
        }

        List<String> d = users.stream().map(x -> {
            String a = x.getName();
            return a+ " hello world";
        }).collect(Collectors.toList());

        d.forEach(System.out::println);


        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

        Function<String, String> fun;

        Supplier<threadLocalTest> supplier = ()->new threadLocalTest();

        Map<String, String> map = new HashMap<>();
        map.put("name", "zll");
        map.put("age", "22");
        List<String> a = new ArrayList<>();
        map.forEach((key, val) -> a.add(key + " : " + val));
        a.forEach(System.out::println);

        Map<String, Object> m= new HashMap<>();
        m.put("a", 1);
    }

    public void test(Runnable fun){

    }


    static class MyThread implements Runnable {
        private int index;

        public MyThread(int index) {
            this.index = index;
        }

        public void run() {
            System.out.println("线程" + index + "的初始value:" + value.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get() + i);
            }
            System.out.println("线程" + index + "的累加value:" + value.get());
        }
    }
}

