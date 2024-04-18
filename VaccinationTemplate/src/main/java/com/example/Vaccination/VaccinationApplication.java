package com.example.Vaccination;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class VaccinationApplication {
	static ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	static String name = null;
	static int age = 0;
	static User user=null;
	static String appointmentDate = null;
	static String appointmentTime = null;
	static String appointmentLocation = null;
	static String beanId = null;
	static Scanner s;
	public static void main(String[] args) {
		s=new Scanner(System.in);
	       System.out.println("Welcome to the Vaccination Application");
	       while(true) {
	    	   System.out.println("Please choose your vacchine preference:\n1.Covid\n2.Polio\n3.Typhoid");
	          int vaccinePreference=s.nextInt();
	          switch(vaccinePreference) {
	          case 1:{
	        	  fun();
	        	  break;
	     		}
	          case 2:{
	        	  fun();
	        	  break;
	          }
	          case 3:{
	        	  fun();
	        	  break;
	          }
	          }
	          }
	       }
	private static void fun() {
		// TODO Auto-generated method stub
		  System.out.println("Whom do you want to vaccinate\n1.Father\n2.Mother\n3.Self\n4.Spouse\n5.Exit");
   		int choice=s.nextInt();
   		switch(choice) {
	   		case 1:{
	   			beanId="covidFather";
	   			help(beanId);
	   			break;
	   		}
	   		case 2:{
	   			beanId="covidMother";
	   			help(beanId);
	   			break;		   		}
	   		case 3:{
	   			beanId="covidSelf";
	   			help(beanId);
	   			break;
	   		}
	   		case 4:{
	   			beanId="covidSpouse";
	   			help(beanId);
	   			break;
	   		}
	   		case 5:{
	   			
	   			System.exit(0);
	   		}
	   		}
	   		
		
	}
	private static void help(String beanId) {
		// TODO Auto-generated method stub
		user=(User)context.getBean(beanId);
			if(user.IsVaccinated()) {
				System.out.println("User is already Vaccinated");
			}
			else {
			System.out.println("Please enter "+user.getClass().getSimpleName()+" details:");
			System.out.println("Name:");
			name=s.next();
			System.out.println("Age:");
			age=s.nextInt();
			
			System.out.println("Appointment date (YYYY-MM-DD):");
			s.nextLine();
			appointmentDate=s.nextLine();
			
			System.out.println("Appointment time (HH-MM AM/PM):");
			appointmentTime=s.nextLine();
			System.out.println("Appointment location:");
			appointmentLocation=s.nextLine();
		 TimeAndLocation t=(TimeAndLocation)context.getBean("timeAndLocation");
	    
     t.setDetails(appointmentTime, appointmentLocation, appointmentDate);

     user.setUserDetails(name, age, t);
    
     user.setAppointment();
			}
		
	}
	}

