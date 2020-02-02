public class Question1 {
}

class Test{
    public static void main(String[] args) {
        Student studentA = new Student("studentA", 1);
        Student studentB = new Student("studentB", 2);

        Course courseMath = new Course("Math");
        Course courseFull = new Course("Full Course");

        // Register student A and B into class Math
        // Print Number of student and the name of each student
        courseMath.registerStudent(studentA);
        courseMath.registerStudent(studentB);
        System.out.println("NumberOfStudent: " + courseMath.getNumberOfStudent());
        Student[] students = courseMath.getStudents();
        for (Student s : students) {
            if (s != null) {
                System.out.println(s.getName());
            }
        }

        // Register studentA 10 times in courseFull
        // Try to register student B in courseFull
        for (int i = 0; i < 10; i++) {
            courseFull.registerStudent(studentA);
        }
        System.out.println("Current number of student: " + courseFull.getNumberOfStudent());
        courseFull.registerStudent(studentB);


    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

class Course {
    private String name;
    private int numberOfStudent;
    private Student[] students;

    public Course(String name) {
        this.name = name;
        numberOfStudent = 0;
        students = new Student[10];
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean isFull() {
        return numberOfStudent < 10 ? false : true;
    }

    public String getTitle() {
        return this.name;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public void registerStudent(Student student) {
        if (!isFull()) {
            students[numberOfStudent] = student;
            numberOfStudent++;
            System.out.println("registering operation success!");
        }   else{
            System.out.println("No more seats available");
        }

    }
}


// Question2

