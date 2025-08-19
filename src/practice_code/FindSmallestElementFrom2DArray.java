package practice_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    private int age;
    private String name;

    public Employee(){
        System.out.println("IN CONSTRUCTOR");
    }

    static{
        System.out.println("IN Static");
    }

    {
        System.out.println("IN default block");
    }

    public Employee(int age,String name) {
    this.age=age;
    this.name=name;
        System.out.println("IN CONSTRUCTOR");
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Employee Age:"+this.getAge()+" Employee Name:"+this.getName();
    }


}
interface Lambda{
//   abstract int add(int a, int b);

   abstract int displayNum(int x);

   default int display(int x){
       return -1;
   }
}
public class FindSmallestElementFrom2DArray  {
    public static void main(String[] args) {

        Employee emp=new Employee(28,"Shubham");
        Employee emp1=new Employee(32,"sharu");
        Employee emp2=new Employee(45,"shubh");
        Employee emp3=new Employee(32,"shubh");
        Employee emp4=new Employee(12,"sharu");
        Employee emp5=new Employee(90,"shubh");

        Map<String, List<Employee>> collect1 = List.of(emp, emp1, emp2, emp3, emp4, emp5)
                .stream()
                .collect(Collectors.groupingBy(employee -> employee.getName()));

        String arr2[]={"Shubham","Sharu","Sharu"};

        Map<String, Long> collect2 = Arrays.stream(arr2)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);
        System.out.println(collect2);


        List<Employee> list = List.of(emp, emp1, emp2, emp3, emp4, emp5)
                .stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .toList();
        System.out.println(list);

        list.forEach(employee -> System.out.println(employee.toString()));


        int arr[]={2,3,4,4,4,5,3,7,6,4};
        List<Integer> data=new ArrayList<>();
        Set<Integer> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(collect);

        String s = "}{}{{}}{";
        int validPair=0;
        int openCount=0;

        for (char ch : s.toCharArray()) {

            if(ch=='{'){
                openCount++;
            } else if (ch=='}') {

                if(openCount>0){
                    openCount--;
                    validPair++;
                }
            }


        }
        System.out.println("Number of valid brace pairs: " + validPair);

//        s.chars().

        Lambda lambda=(a)-> a;
        System.out.println( lambda.displayNum(3));
        int [][]mat ={{10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 48},
                {32, 33, 39, 50 }};

        TreeSet<Integer> set=new TreeSet<>();


         Arrays.stream(mat)
                 .forEach(ints -> Arrays.stream(ints)
                         .boxed()
                         .forEach(integer -> set.add(integer)))
                 ;












        System.out.println("3rd Largest elemnt is:"+set.stream().skip(2).findFirst().get());
        ;
    }

}
