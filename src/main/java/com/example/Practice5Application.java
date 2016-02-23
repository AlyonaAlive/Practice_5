package com.example;


import java.sql.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Practice5Application {

	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		WorkWithStudent worker = (WorkWithStudent) context.getBean("worker");
		//new WorkWithStudents();
		Student testStudent = new Student("Vlad Valt", 5);
		worker.saveStudentToDb(testStudent);
		WorkWithTeacher workWithTeacher = 
				(WorkWithTeacher) context.getBean("teachersWorker");
				Teacher teacher = new Teacher();
				teacher.setFirstname("Andrii");
				teacher.setLastname("Glybovets");
				teacher.setCellphone("+380675097865");
				teacher = workWithTeacher.addTeacher(teacher);
				teacher.setBirthDate(new Date(0));;
				workWithTeacher.saveTacher(teacher);

		}
	

}
