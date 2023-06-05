import com.fengzhuang.Account;

import java.util.*;
//////import java.util.Scanner;
//////public class Main
//////{
//////    public static void main(String[] args)
//////    {
//////        Scanner sc=new Scanner(System.in);
//////        int a=sc.nextInt();
//////        for(int i=0;i<a;i++)
//////        {
//////            for(int j=0;j<39-i;j++)
//////            {
//////                System.out.printf(" ");
//////            }
//////            for(int m=1;m<=i+1;m++)
//////            {
//////                System.out.printf("%d",m);
//////            }
//////            if(i>0)
//////                for(int n=i;n>=1;n--)
//////                {
//////                    System.out.printf("%d",n);
//////                    if(n==1)
//////                        System.out.printf("\n");
//////                }
//////            else
//////                System.out.printf("\n");
//////        }
//////    }
//////}
//////import java.util.Scanner;
//////class Main
//////{
//////    public static void main(String[] args)
//////    {
//////        Scanner sc = new Scanner(System.in);
//////        int a=sc.nextInt(),n=1;
//////        int temp=a;
//////        while(temp>9)
//////        {
//////            temp/=10;
//////            n++;
//////        }
//////        for(int j=0;j<n/2;j++)
//////        {
//////            int q = a/(int)Math.pow(10,n-1);
//////            int p = a-a/(int)Math.pow(10,j+1)*10;
//////            if(q!=p)
//////            {
//////                System.out.println(a+" 不是回文数");
//////                break;
//////            }
//////            else continue;
//////        }
//////    }
//////}
//////import java.util.Scanner;
//////class Main
//////{
//////    public static void main(String[] args)
//////    {
//////        Scanner sc = new Scanner(System.in);
//////        int a=sc.nextInt(),n=1;
//////        int temp=a, q=a,p=a;
//////        while(temp>9)
//////        {
//////            temp/=10;
//////            n++;
//////        }
//////        for(int j=0;j<n/2;j++)
//////        {
//////            int b = a/(int)Math.pow(10,n-1-j);
//////            int x = b*10;
//////            int o = p;
//////            p = p/10;
//////            if(x!=o-p*10)
//////            {
//////                System.out.println(q+" A");
//////                System.exit(0);
//////            }
//////            else
//////            {
//////                continue;
//////            }
//////        }
//////        System.out.println(q+" B");
//////    }
//////}
////import java.util.Scanner;
////
////class Student {
////    private String id;
////    private String name;
////    private int score1;
////    private int score2;
////    private int score3;
////
////    // 构造方法
////    public Student(String id, String name, int score1, int score2, int score3) {
////        this.id = id;
////        this.name = name;
////        this.score1 = score1;
////        this.score2 = score2;
////        this.score3 = score3;
////    }
////
////    // 获取学号
////    public String getId() {
////        return id;
////    }
////
////    // 获取姓名
////    public String getName() {
////        return name;
////    }
////
////    // 获取第一科成绩
////    public int getScore1() {
////        return score1;
////    }
////
////    // 获取第二科成绩
////    public int getScore2() {
////        return score2;
////    }
////
////    // 获取第三科成绩
////    public int getScore3() {
////        return score3;
////    }
////
////    // 设置第一科成绩
////    public void setScore1(int score1) {
////        this.score1 = score1;
////    }
////
////    // 设置第二科成绩
////    public void setScore2(int score2) {
////        this.score2 = score2;
////    }
////
////    // 设置第三科成绩
////    public void setScore3(int score3) {
////        this.score3 = score3;
////    }
////}
////
////public class Main {
////    public static void main(String[] args) {
////        // 定义四维数组存储学生信息
////        Student[][][][] student = new Student[1][3][2][2];
////
////        // 将输入数据存储到学生对象中，并将对象的地址存储到四维数组中
////        Student s = new Student("2020010201", "张三", 98, 78, 66);
////        student[0][1][0][0] = s;
////
////        // 给定一个学号，获取学生的详细信息
////        String id = "2020010201";
////        Student target = null;
////        for (int i = 0; i < student.length; i++) {
////            for (int j = 0; j < student[i].length; j++) {
////                for (int k = 0; k < student[i][j].length; k++) {
////                    for (int l = 0; l < student[i][j][k].length; l++) {
////                        Student s2 = student[i][j][k][l];
////                        if (s2 != null && s2.getId().equals(id)) {
////                            target = s2;
////                            break;
////                        }
////                    }
////                }
////            }
////        }
////    }
////}
////
////public class Main
////        {
////public static void main(String[] args )
////{
////    int a=3;
////    int b=2;
////    int c=1;
////    int max =a>b?a:b;
////    max = b>c?b:c;
////    max=c>a?c:a;
////    System.out.println(max);
////}
////        }
////public class Main{
////    public static void main(String[] args)
////    {
////        Scanner sc = new Scanner(System.in);
////        int age = sc.nextInt();
////        if(age>18)
////            System.out.println("ruyu");
////        else
////            System.out.println("byebye");
////    }
////}
////int[] arr1 = {1, 3, 17};
////        int[] arr2 = new int[arr1.length + 1];
////        int num = 0;
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        for (int i = 0; i < arr1.length; i++)
////        if (a < arr1[i]) {
////        arr2[i] = a;
////        num = i;
////        break;
////        }
////        else arr2[i]=arr1[i];
////        int m = num;
////        for (; m < arr1.length; ) {
////        arr2[m + 1] = arr1[m];
////        m++;
////        }
////        for(int i=0;i<arr2.length;i++)
////        {
////        System.out.printf("%d ",arr2[i]);
////        }
////class Main {
////    public static void main(String[] args) {
////    AA aa = new AA();
////    aa.A(10.0);
////    }
////};
////class AA{
////    boolean A(double a){
////        if(a%2==1)
////        {
////            System.out.println("不是偶数");
////            return false;
////        }
////
////        else
////            System.out.println("是偶数");
////        return true;
////    }
////}
//// Scanner sc = new Scanner(System.in);
////         int a = sc.nextInt();
////         int b = sc.nextInt();
////         char c = sc.next().charAt(0);
////         prin aa = new prin();
////         aa.A(a,b,c);
////         }
////         }
////class prin
////{
////    void A(int a,int b,char c)
////    {
////        for(int i = 0 ; i < a; i++)
////        {
////            for(int j = 0;j<b; j++)
////            {
////                System.out.printf("%c",c);
////            }
////            System.out.printf("\n");
////        }
////class Main
////{
////    public static void main(String[] args)
////    {
////       AA a = new AA();
////       String [] q = new String[2];
////       a.aa("liming",q,10,20,30);
////       System.out.println(q[1]);
////    }
////}
////class AA{
////    String[] aa(String ab,String[] q,int ... num)
////    {
////        q[0] = ab;
////        int aum =0 ;
////        for(int i = 0;i < num.length ; i++)
////            aum += num[i];
////        q[1] = aum +"";
////        return q;
////    }
////}
////public class Main
////{
////    public static void main(String[] args)
////    {
////        person A = new person("zhangsan",int);
////        boolean s = A.person("zhangsan",int);
////        System.out.println(s);
////    }
////}
////class person
////{
////    String name;
////    int age;
////    public person(String name,int age)
////    {
////        this.name=name;
////        this.age = age;
////    }
////    public boolean compareTo(person p)
////    {
////        if(this.name.equals(p.name)&&p.age==this.age)
////            return true;
////        else
////            return false;
////    }
////}
////public class Main
////{
////    public static void main(String[] args)
////    {
////        A p = new A("zhangsan",10);
////        A p2 = new A("zhangsan",10);
////        boolean m = p.compare(p2);
////        System.out.println(m);
////    }
////}
////class A{
////    String name;
////    int age;
////    //构造器
////    public A(String name,int age)
////    {
////        this.name = name;
////        this.age = age;
////    }
////    public boolean compare(A p)
////    {
////        return this.name.equals(p.name)&&this.age==p.age;
////    }
//public class Main
//{
//       public static void main(String[] args)
//       {
////            A01 A = new A01();
////            double b[] = {3.1,3.2,5,1};
////            double a = A.max(b);
////            System.out.println(a);
////            A02 fin = new A02();
////            String c[] = {"ab","ac","ad"};
////            int m = fin.find(c,"ad");
////            System.out.println(m);
////           Book b1 = new Book();
////           b1.price = 120;
////           b1.updatePrice();
////           System.out.println(b1.price);
////           A03 a = new A03();
////           int [] c  ={10,50,30};
////           int b[] = a.copyArr(c);
////           for(int i = 0; i<c.length;i ++)
////           {
////               System.out.println(b[i]);
////           }
////           Circle a = new Circle(10);
////           double b = a.cir();
////           double c = a.sqr();
////           System.out.println(b+"," + c);
////           Cale a = new Cale(10,20);
////           System.out.println("add"+a.add()+"jian" + a.jian() + "cheng" +a.cheng() + "chu" + a.chu());
//           Dog d1 = new Dog("lishuo","yellow",18);
//           d1.info();
//       }
//}
//class Dog
//{
//    String name,colour;
//    int age;
//    public Dog(String name,String colour,int age)
//    {
//        this.name = name;
//        this.colour = colour;
//        this.age = age;
//    }
//    public void info()
//    {
//        System.out.println(name);
//        System.out.println(colour);
//        System.out.println(age);
//    }
//}
////class Cale
////{
////    double a,b;
////    public Cale(double a,double b)
////    {
////        this.a=a;
////        this.b=b;
////    }
////    public double add()
////    {
////        return a+b;
////    }
////    public double jian()
////    {
////        return a-b;
////    }
////    public double cheng()
////    {
////        return a*b;
////    }
////    public double chu()
////    {
////        if(b==0)
////        {
////            System.out.println("输入错误");
////            return 0;
////        }
////        return a/b;
////    }
////}
////class Circle
////{
////    double r;
////    public Circle(double r){
////        this.r = r;
////    }
////    public double cir()
////    {
////        return 2*this.r*3.14;
////    }
////    public double sqr(){
////        return 3.14*this.r*this.r;
////    }
////}
////class A03
////{
////    public int[] copyArr(int []a)
////    {
////        int ab[] = new int[a.length];
////        for(int i = 0 ;i<a.length;i++)
////        {
////            ab[i]=a[i];
////        }
////        return ab;
////    }
////}
////class A01
////{
////    public double max(double a[]) {
////        double max = 0;
////        max = a[0];
////
////        for (int j = 1; j < a.length; j++) {
////            if (max < a[j])
////                max = a[j];
////        }
////        return max;
////    }
////}
////class A02
////{
////    public int find(String[] a,String ab)
////    {
////        for(int i=0;i<a.length;i++)
////        {
////            if(a[i].equals(ab))
////            {
////                return i;
////            }
////        }
////        return -1;
////    }
////}
////class Book
////{
////    int price;
////    public void updatePrice()
////    {
////        if(this.price<150)
////            this.price=150;
////    }
////}
//public class Main{
//    public static void main(String [] args){
//        Circle c = new Circle();
//        PassObject a = new PassObject();
//        a.PrintAreas(c,5);
//    }
//}
//class Circle{
//    double r;
//    public double findArea(){
//        return r*r*Math.PI ;
//    }
//}
//class PassObject{
//    public void PrintAreas(Circle c,int times){
//        for(int i=1; i<=times ;i++){
//            System.out.printf("%d",i);
//            c.r=i;
//            System.out.println(" " + c.findArea());
//        }
//    }
//}
public class Main{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        Tom guess = new Tom();
//        while(a<=2&&a>=0){
//            guess.check(a);
//            a = sc.nextInt();
//        }
//        System.out.println(guess.win);
//        System.out.println(guess.lose);
//        System.out.println(guess.ping);
        Account a = new Account();
        a.setName("liming");
        a.info();
    }
}
class Tom {
    int win = 0;
    int lose = 0;
    int ping = 0;
    Random random = new Random();
    //int randomInt = random.nextInt(); // 生成任意范围内的整数
    int num = random.nextInt(3); // 生成0到99的整数
    public void check(int a){
        if((a-num)==-1&&(a-num)==2) {
            win += 1;
        }
        else if(a==num)
            ping ++;
        else lose++;
    }
}