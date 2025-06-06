package com.fuck.dao;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    private Map<Integer,Integer> studentData = new HashMap<>();

    public StudentDao(){
        studentData.put(101,98);
        studentData.put(102,88);
    }

    public int getScore(int studentId){
        return studentData.getOrDefault(studentId,-1);
    }

    public void updateScore(int studentId,int newScore){
        studentData.put(studentId,newScore);
    }

    public Map<Integer,Integer> getAllData(){
        return new HashMap<>(studentData);
    }
}
