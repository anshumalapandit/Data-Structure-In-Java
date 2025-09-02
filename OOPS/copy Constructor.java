
 class Main{
    public static void main(String args[]){
        Student s=new Student(10);
        // call copy const
        Student cc=new Student(s);
        // ouptut
        System.out.println(s.r+" normal para const ouptut");
        System.out.println(cc.r+"cc output");
    }
}
class Student{
    int r;
    Student(int r){
        this.r=r;
    }
    // copy const part
    Student(Student stObj){
        this.r=stObj.r; // copy the value of this object . 
        // if u will write this.r=r it will give output as 0 
    }
}
