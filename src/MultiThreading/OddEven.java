package MultiThreading;

public class OddEven {

    private int number=1;
    private final int MAX_VALUE=20;
    public static void main(String[] args) {
        OddEven od=new OddEven();
        Thread t1 = new Thread(od::printOdd);
        Thread t2 = new Thread(od::printEven);
        t1.start();
        t2.start();

    }

    public synchronized void printEven(){

        while(number<=MAX_VALUE){

            if(number%2!=0){
                try {
                    wait();
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println("EVEN:"+number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printOdd(){
        while(number<=MAX_VALUE){
            if(number%2==0){
                try {
                    wait();
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println("ODD:"+number);
                number++;
                notify();
            }
        }
    }
}
