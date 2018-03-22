package com.company.random;

public class Student implements Comparable<Student>{
    private String name;
    private Integer point;
    private Integer height;

    public Student(String name, Integer point, Integer height) {
        this.name = name;
        this.point = point;
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        int res = o.getPoint() - this.getPoint();
        if (res == 0) {
            res = this.getName().compareTo(o.getName());
            if (res == 0) {
                return o.getHeight() - this.getHeight();
            }
        }
        return res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
}
