//Java Parameterized Constructor example

//class const_example {
//int id;
//String name;
//
//const_example(int i, String n){
//    id = i;
//    name = n;
//}
//void display(){
//    System.out.println(id +" "+ name);
//}
//
//    public static void main(String[] args) {
//        const_example u1 = new const_example(111,"shayan");
//        const_example u2 = new const_example(22, "adim");
//        const_example u3 = new const_example(33, "amir");
//        u1.display();
//        u2.display();
//        u3.display();
//    }
//}

//repeated example
//
//class const_example{
//     int id;
//     String name;
//
//     const_example(int i, String n){
//         id = i;
//         name = n;
//     }
//     void display(){
//         System.out.println(id + " " + name);
//     }
//
//    public static void main(String[] args) {
//        const_example u1 = new const_example(1, " amir");
//        const_example u2 = new const_example(1, " sabir");
//        const_example u3 = new const_example(3, " taha");
//        const_example u4 = new const_example(4, " momin");
//        u1.display();
//        u2.display();
//        u3.display();
//        u4.display();
//    }
//}





//Question 2
// Constructor Overloading in Java

//class const_example {
//    int age;
//    String name;
//    int id;
//
//    const_example(int i, String n) {
//        id = i;
//        name = n;
//    }
//
//    const_example(int i, int j, String n) {
//        age = j;
//        id = i;
//        name = n;
//    }
//
//    void display() {
//        System.out.println(id + " " + age + " " + name);
//    }
//
//
//    public static void main(String[] args) {
//        const_example u1 = new const_example(1, 21, "azlaan");
//        const_example u2 = new const_example(2, 20, "bazil");
//        const_example u3 = new const_example(3, 22, "taha");
//        const_example u4 = new const_example(4, 20, "help");
//        const_example u5 = new const_example(1, 50, "wakis");
//
//        u1.display();
//        u2.display();
//        u3.display();
//        u4.display();
//        u5.display();
//
//    }
//
//}


//Repeated Question
//class const_example {
//    int id;
//    int age;
//    String name;
//
//    const_example(int i, String n) {
//        id = i;
//      name = n;
//
//    }
//
//    const_example(int i, int j, String n) {
//        id = i;
//        age = j;
//        name = n;
//    }
//
//    void display() {
//        System.out.println(id + " " + age + " " + name);
//    }
//
//    public static void main(String[] args) {
//        const_example u1 = new const_example(1, 21, "burhan");
//        const_example u2 = new const_example(2, 20, "amir");
//        const_example u3 = new const_example(3, 23, "laptop");
//        const_example u4 = new const_example(4, 50, "old pc");
//        u1.display();
//        u2.display();
//        u3.display();
//        u4.display();
//    }
//}


//Question n0 4
//Java Constructors
// public class const_example{
//    int x;
//     public const_example(){
//        x=5;
//    }
//
//    public static void main(String[] args) {
//        const_example u1 = new const_example();
//        System.out.println(u1.x);
//
//     }
//}

//Question no 5
//Constructor Parameters
//public class const_example{
//    int x;
//
//    public const_example(int y){
//        x=y;
//    }
//
//    public static void main(String[] args) {
//        const_example u1 = new const_example(70);
////        u1.display();
//        System.out.println(u1.x);
//    }
//        }

//Question no 6
// constructor parameter
public class const_example {
    int modelYear;
    String modelName;

    public const_example(int year , String Name){
        modelYear = year;
        modelName = Name;
    }
    void display() {
        System.out.println(modelName + " "+ modelYear);

    }
    public static void main(String[] args) {
        const_example u1 = new const_example(1990,"mustang");
        const_example u2 = new const_example(2023, "benz");
    u1.display();
    u2.display();
    }
}