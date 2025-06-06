package com.fuck.service;

import com.fuck.dao.StudentDao;

public class StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao){
        this.studentDao=studentDao;
    }

    public String queryScore(int studentID){
        int score = studentDao.getScore(studentID);
        return score==-1?"No such student ":String.format("Student score: %d ",studentID,score);
    }

    public void updateScore(int studentId, int newScore){
        if(studentDao.getScore(studentId)==-1){
            throw new RuntimeException("no such student!");
        }
        studentDao.updateScore(studentId,newScore);
    }

        public void printAllStudents() {
            studentDao.getAllData().forEach((id, score) ->
                    System.out.printf("学号：%d → 分数：%d分\n", id, score)
            );
        }

    }
