package in.kodecamp.entities;

import java.util.*;

public class StudentMarksImpl implements StudentMarks {
    private String name;
    private String course;
    private String semester;
    private ArrayList<Integer> marks;

    public StudentMarksImpl(String name, String course, String semester, ArrayList <Integer>marks ){

        this.name = name;
        this.course = course;
        this.semester = semester;
        this.marks = marks;

    }

    @Override
    public String name(){
        return name;
    
    }

    @Override
    public String course(){
    return course;
    }

    @Override
    public String semester(){
        return semester;

    }

    @Override
    public ArrayList<Integer> marks(){
        
        return marks;
        
    }

}
