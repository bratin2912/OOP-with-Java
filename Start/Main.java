import java.util.Arrays;

class Main{
    /**
     * Make sense to declear the students array as a static
     * as I am using it inside the main, as main function 
     * always be a public and static so its not depends on 
     * the obj can be access from anywhere so if we are using 
     * any member variable inside that its mandatoy that variable 
     * also be a static, sounds good?
     */
    static Student[] students;
    static Integer a = 50;
    static Integer b = 10;

    /**
     * Just to 
     */
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b =  temp;
        System.out.println("Inside context of swap");
        System.out.println("Value of a is" + a + "\tValue of b is " + b);
    }
    public static void main(String[] args) {
        students = new Student[5];
        Student bratin = new Student("Bratin", 7, "B");
        /**
         * Invoke the copy constructor as I am passing a object 
         * as a parameter while initializing 
         */
        Student bratinCopy =  new Student(bratin);
        //Default constructor is going to call
        final Student defaultExample =  new Student();
        /**
         * Anyway defaultExample is an object(non-premitive) and its
         * final so you can reassign it
         */
        // defaultExam =  new Student();
        
        /**
         * Even if its pass by reference as we created a and b using wrapper 
         * class Integer, its not actually going to swap the number, here is 
         * the concept of Final keyword, If you go and check Integer is a Final
         * Class. So its not allowing to change the variable where the reference
         * of those a and b pointing to in the heap memory. 
         */
        swap(a, b);
        System.out.println("Inside class context");
        System.out.println("Value of a is" + a + "\tValue of b is " + b);
    }
}

/**
 * Let's make our class final to be more clear with the concept of final.
 * If a class is decleared as final its means you cannot inherite that class.
 * And in case of method is its decleared as final you can't override that method.
 */
final class Student{
    String name;
    int rollNo;
    String section;
    double phoneNo;

    /*
        Final can be considerable as a constant.
        Covention to follow here always write the
        variable name in capital which you declear
        with  final.
    */ 
    final String GRADE = "C";

    //Default constructor
    Student() {
        /**
         * This is how we can call a constructor from another contructor.
         * We can aslo refer this example as a default constructor
         * as at the time of initializoing if we don't pass any 
         * parameter by default this consturctor function is going 
         * to call.
         */
        this("Xyz", 100, "C");
    }

    //copy constructor
    Student(Student someone){
        this.name =  someone.name;
        this.rollNo = someone.rollNo;
        this.section = someone.section;
    }

    //constructor
    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    /**
     * Just for clearification even you are trying to create a setter method
     * to the the variable you decleared with final its not possible, consider
     * it as a constant.
     */
    // void setFinalGrade() {
    //     this.GRADE = "A";
    // }
}
