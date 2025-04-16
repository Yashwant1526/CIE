public class Student{
    int id;
    String name;
    String dept;
    int year;

    Student(int id,String name,String dept,int year)
    {
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.year=year;
    }

    void display()
    {
        System.out.println("Student Id:"+id);
        System.out.println("Student Name:"+name);
        System.out.println("Student Department:"+dept);
        System.out.println("Year:"+year);
 
    }

    public static void main(String[] args) {
        Student s=new Student(id:029, name:"Yashwant",dept:"BCA",year:2025)
        s.display();
    }
}