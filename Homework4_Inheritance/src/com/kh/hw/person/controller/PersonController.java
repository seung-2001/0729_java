package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] person = new int[2];
		
		
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) { 
                person[0] = s.length;
            }
        }
        
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) { 
            	person[1] = e.length;
            }
        }
        return  person;
	}

	public void insertStudent(String name, int age, double height, double weigth, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weigth, grade, major);
				break;
			}
		}
	}

	public Student[] printStrudent() {
		return s;
	}

	public void insertEmplotee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}

	public Employee[] printEmployee() {
		return e;
	}

}
