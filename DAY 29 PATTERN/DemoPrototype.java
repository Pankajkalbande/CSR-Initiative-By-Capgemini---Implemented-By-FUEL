
import java.util.*;

class Student implements Cloneable {
    ArrayList<String> students = new ArrayList<String>();
    this.students=students;
}

    void loadData() {
        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
    }

    void showData() {
        for (String s : students) {
            System.out.println(s);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> temp;
        temp = new ArrayList<>();
        for (String s : this.students) {
            temp.add(s);
        }
        Student obj = new Student(temp);
        return obj;
    }
}

public class DemoPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student();
        st1.loadData();

        Student st2 =(Student)st1.clone();
        st1.showData();
        st2.showData();
        
    }
    
}
