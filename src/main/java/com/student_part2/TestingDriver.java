package com.student_part2;

import java.util.ArrayList;


import com.student_part1.Course;
import com.student_part1.Module;
import com.student_part1.Student;

public class TestingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regNumber=1;
		
//		//testing variables
//		ArrayList<Student> studentList2 = new ArrayList<Student>();
		
		// create courses avaiable 
		Course course1 = new Course ( "ECE","05-09-2017","14-06-2018" );
		//Course course2 = new Course ("CS&IT","05-09-2017","14-06-2018");
		
		//ECE modules
		Module mod1 = new Module( "Software Engineerng", "CT414");
		Module mod2 = new Module( "Machine Learning", "CT475");
		Module mod3 = new Module( "Communications and Signal", "EE444");
		Module mod4 = new Module( "Digital Signal Processing", "CT445");
		Module mod5 = new Module( "System on Chip", "CT451");
		
		//IT  modules only 
		Module mod6 = new Module( "JAVA 4 ", "CT479");
		Module mod7 = new Module ( "Data base system III", "DB445");
			
		//common students for ECE modules 
		ArrayList<Student> commonECE = new ArrayList<Student> ( );
		commonECE.add(new Student ("Jaroslaw" , "Jakubowicz"  ,  "30-23-1982" ,regNumber++));
		commonECE.add(new Student ("Monica" , "Ridney"  ,  "20-02-1983",regNumber++));
		commonECE.add(new Student ("Clark" , "Murhpy"  ,  "23-10-2000",regNumber++));
		commonECE.add(new Student ("Albert" , "Einsten"  , "12-12-1998",regNumber++));
		commonECE.add(new Student ("Jaroslaw" , "Traskowski" ,  "25-11-1982",regNumber++));
		commonECE.add(new Student ("Paul" , "Ferrari"  ,  "30-23-1982" ,regNumber++));
		commonECE.add(new Student ("James" , "Ford"  ,  "30-23-1982" ,regNumber++));
		commonECE.add(new Student ("Albert" , "Framkeinsten"  , "12-12-1988",regNumber++));  
		// 8 total
		
		//adding students to ECE moduels
		mod1.addStudents(commonECE);mod2.addStudents(commonECE);mod3.addStudents(commonECE);
		mod4.addStudents(commonECE);mod5.addStudents(commonECE);
		
		
		//common students for IT
		ArrayList<Student> commonIT = new ArrayList<Student> ( );
		commonIT.add(new Student ("JAROSLAW" , "JAKUBOWICZ"  ,  "30-23-1982" ,regNumber++));
		commonIT.add(new Student ("MONICA" , "MONICA"  ,  "20-02-1983",regNumber++));
		commonIT.add(new Student ("CLARK" , "CLARK"  ,  "23-10-2000",regNumber++));
		commonIT.add(new Student ("SUPER" , "MAN"  , "12-12-1998",regNumber++));
		commonIT.add(new Student ("JOHNY" , "DEEP" ,  "25-11-1982",regNumber++));
		commonIT.add(new Student ("VAN" , "DIESEL"  ,  "30-23-1982" ,regNumber++));
		// 6 total
		
		//adding students to IT modules
		mod1.addStudents(commonIT);mod2.addStudents(commonIT);mod3.addStudents(commonIT);
		mod4.addStudents(commonIT);mod5.addStudents(commonIT);mod6.addStudents(commonIT);
		mod7.addStudents(commonIT);
		
		
		// reperts student and master
		Student st1 = new Student( "Robert" , "Lewandwski"  ,  "30-23-1989" ,regNumber++);
		Student st2 = new Student( "Lukasz" , "Piszczek"  ,  "20-02-1983",regNumber++);
		Student st3 = new Student( "Kuba" , "Blaszczykowski"  ,  "23-10-2000",regNumber++ );
		Student st4 = new Student( "Kamil" , "Glik"  , "12-12-1998",regNumber++);
		Student st5 = new Student( "Norbert" , "Grzybwoski" ,  "25-11-1982",regNumber++);
		Student st6 = new Student( "Monica" , "Lewinski"  ,  "21-12-1983",regNumber++ );
		Student st7 = new Student( "Santa" , "Claus"  ,  "13-10-2000",regNumber++);
		Student st8 = new Student( "BAT" , "MAN"  , "12-12-1988",regNumber++);
		// 8 total
		
		
		//addind repeats and master to diffrent modules
		//ECE modules
		mod1.add(st1);mod1.add(st2);mod1.add(st3);
		mod2.add(st4);mod2.add(st5);
		//IT modules
		mod7.add(st6);mod7.add(st7);
		mod6.add(st8);
		
		//adding modules to course 1
		course1.add(mod1);
		course1.add(mod2);
		course1.add(mod3);
		course1.add(mod4);
		course1.add(mod5);
		course1.add(mod6);
		course1.add(mod7);
				
//		//adding modules to course 2  ----- conflit with course name
//		course2.add(mod1);
//		course2.add(mod2);
//		course2.add(mod3);
//		course2.add(mod4);
//		course2.add(mod5);
//		course2.add(mod6);
//		course2.add(mod7);		
		
		
		for ( Student std:course1.getStudentList()){
			System.out.printf( "%-15s%-12s%-12s%-12s\n"  ,std.getSurname(),std.getFirstName(),std.getCourse(), std.getModulesNames());
			
		}
     
	}

	}


