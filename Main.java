import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime=Runtime.getRuntime();
        long freeMemory1 = runtime.freeMemory();
        System.out.println(freeMemory1/(1024*1024) +"MB");
        List<Customer> customerList=new ArrayList<>();
        for(int i=0;i<1000000;i++){
            customerList.add(new Customer("A"));
        }
        long freeMemory2 = runtime.freeMemory();
        System.out.println(freeMemory2/(1024*1024) +"MB");
        Thread.sleep(10000);
        System.gc();
        long freeMemory3 = runtime.freeMemory();
        System.out.println(freeMemory3/(1024*1024) +"MB");
    }
}
