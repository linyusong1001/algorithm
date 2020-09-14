package common;

import java.util.Objects;

/**
 * @Author YuSong-Lin
 * @Date 2020/7/16 17:45
 * @Version 1.0
 */


public class Student implements Comparable<Student> {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", score=" + score +
//                '}';
        return String.format("Student(name: %s, score: %s)",this.name,this.score);
    }
}
