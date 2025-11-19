
 class Student{
    int rollno;
    String name;
    float score;

    void greeting(){
        System.out.println("Pleasure to meet you " + name + "\ncongrajulations" + " " +
        "\nrollno :" + " " + rollno +
        "\nmarks :" + " " + score
        );
    }

     void change(String name ,  float score , int rollno){
        this.name = name;
        this.score = score;
        this.rollno = rollno;
    }

    void Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.score = other.score;
    }

    Student(int rollno, String name, float score){
        this.rollno = rollno;
        this.name = name;
        this.score = score;
    }
}