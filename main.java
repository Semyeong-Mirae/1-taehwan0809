// // class Person{
// //     void speak(){
// //         System.out.println("Hello");
// //     }
// // }

// // class Korean extends Person{
// //     @Override
// //     void speak(){
// //         super.speak();
// //         System.out.println("안녕하세요");
// //     }
// // }

// // public class main {
// //     public static void main(String[] args) {
// //         Korean kr = new Korean();
// //         kr.speak();
// //     }

// // }

// class Person{
//     String name = "세명";
//     void introduce(){
//         System.out.println("이름: " + name);
//     }
// }

// class Student extends Person{
//     int grade = 2;
//     @Override
//     void introduce(){
//         super.introduce();
//         System.out.println("학년: " + grade);
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         Student kr = new Student();
//         kr.introduce();
//     }

// }

// class Phone{
//     void call(){
//         System.out.println("전화 연결 중..");
//     }
// }

// class Smartphone extends Phone{
//     @Override
//     void call(){
//         super.call();
//         System.out.println("화면에서 통화 앱 실행");
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         Smartphone kr = new Smartphone();
//         kr.call();
//     }

// }

// class Animal {
//     void speak() {
//         System.out.println("동물 내는 소리");
//     }
// }

// class Dog extends Animal {
    
//     void bark() {

//         System.out.println("멍멍");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void speak() {

//         System.out.println("냐옹");
//     }
// }

// public class main {
//     public static void main(String[] args) {
//             Animal a = new Dog();


//             a.speak();

//             Dog d = (Dog) a;
//             d.bark();
//     }

// }



// abstract class Shape{

//     abstract double getArea();
// }

// class Circle extends Shape {
//     double radius = 2.0;
//     double getArea(){
//         return 3.14 * radius * radius;
//     }
// }
// class Rectangle extends Shape{
//     int width = 3, height = 4;
//     double getArea() {
//         return width * height;
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         Shape[] shapes = {new Circle(), new Rectangle()};
//         for (Shape s : shapes){
//             System.out.println("넓이: " + s.getArea());
//         }
//     }
// }


// abstract class Person{
//     String name;

//     Person(String name){
//         this.name = name;
//     }
//     abstract void printInfo();
// }

// class Student extends Person{
//     int grade;
//     Student(String name, int grade){
//         super(name);
//         this.grade = grade;
//     }
//     @Override
//     void printInfo(){
//         System.out.println("학생 이름: " + name + "학년: " + grade);\
    
//     }
// }


// class Teacher extends Person{
//     String subject;

//     Teacher(String name, String subject){
//         super(name);
//         this.subject = subject;
//     }
//     @Override
//     void printInfo(){
//         System.out.println("교사 이름: " + name + ", 과목: " + subject );

//     }
// }

// public class main {

//     public static void main(String[] args) {
//         Person[] people = {
//             new Student("김철수", 2),
//             new Teacher("박선생", "수학"),
//             new Student("이영희", 3)
//         };
//         for(Person p : people){
//             p.printInfo();
//         }
//     }

// }





interface USB{
    void connect();
    void unconnect();
}
class Mouse implements USB{
    public void connect(){
        System.out.println("키보드 연결");
    }
}
class Keyboard implements USB{
    public void connect(){
        System.out.println("키보드를 연결합니다");
    }
}
public class main{
    public static void main(String[] args) {
        USB device = new Mouse();
        device.connect();
    }
}





