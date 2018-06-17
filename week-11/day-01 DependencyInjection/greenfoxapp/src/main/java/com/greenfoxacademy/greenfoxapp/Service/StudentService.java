package com.greenfoxacademy.greenfoxapp.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int count() {
        return names.size();
    }

    public boolean findStudent(String studentName) {
        int i = 0;
        while ((i < names.size()) && (!names.get(i).equals(studentName))) {
            i++;
        }
        if (i < names.size()) {
            return true;
        } else {
            return false;
        }
    }
}
