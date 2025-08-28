package test;

public interface Sample {
    default  void sout(){
        System.out.println("Inside the sout");
    }

    void gettingData();
}
