class Student {
    String name;
    char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    void display() {
        System.out.println("Student name: " + name + ", grade: " + grade);
    }
}

class Faculty {
    String name;
    String subject;
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void display() {
        System.out.println("Faculty name: " + name + " teaches " + subject);
    }
}

 class CollegeManagement {
    public static void main(String[] args) {
        Student s = new Student("Balasubramanyam", 'A');
        s.display();

        Faculty f = new Faculty("Kishore", "Physics");
        f.display();
    }
}
