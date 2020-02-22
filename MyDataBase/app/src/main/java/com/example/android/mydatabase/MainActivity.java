package com.example.android.mydatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void loadStudents (View view){
            MyDBHanlder dbHandler = new MyDBHanlder(this, null, null, 1);
            id.setText(dbHandler.loadHandler());
            studentID.setText("");
            studentName.setText("");
        }
    public void addStudent(View view) {
        MyDBHanlder dbHandler = new MyDBHanlder(this, null, null, 1);
        int id = Integer.parseInt(studentid.getText().toString());
        String name = studentName.getText().toString();
        Student student = new Student(id, name);
        dbHandler.addHandler(student);
        studentid.setText("");
        studentname.setText("");
    }
    public void findStudent(View view) {
        MyDBHanlder dbHandler = new MyDBHanlder(this, null, null, 1);
        Student student =
                dbHandler.findHandler(studentname.getText().toString());
        if (student != null) {
            lst.setText(String.valueOf(student.getID()) + " " + student.getStudentName() + System.getProperty("line.separator"));
            studentid.setText("");
            studentname.setText("");
        } else {
            lst.setText("No Match Found");
            studentid.setText("");
            studentname.setText("");
        }
    }
    public void removeStudent(View view) {
        MyDBHanlder dbHandler = new MyDBHanlder(this, null,
                null, 1);
        boolean result = dbHandler.deleteHandler(Integer.parseInt(
                studentid.getText().toString()));
        if (result) {
            studentid.setText("");
            studentname.setText("");
            lst.setText("Record Deleted");
        } else
            studentid.setText("No Match Found");
    }
    public void updateStudent(View view) {
        MyDBHanlder dbHandler = new MyDBHanlder(this, null,
                null, 1);
        boolean result = dbHandler.updateHandler(Integer.parseInt(
                studentid.getText().toString()), studentname.getText().toString());
        if (result) {
            studentid.setText("");
            studentname.setText("");
            lst.setText("Record Updated");
        } else
            studentid.setText("No Match Found");
    }
    }
