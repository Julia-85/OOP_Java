package Seminar3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().split("\\s+")[1]
                .compareTo(o2.getFullName().split("\\s+")[1]);    // здесь "слепляем" все идущие подряд пробелы в один
    }

}
