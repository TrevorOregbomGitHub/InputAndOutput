package com.qa.InputAndOutput;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		InputAndOutput p1 = new InputAndOutput("Trevor", 24, "Developer");
		InputAndOutput p2 = new InputAndOutput("Darren", 19, "Coach");
		InputAndOutput p3 = new InputAndOutput("William", 23, "Analyst");

		List<InputAndOutput> listPerson = new ArrayList<>();

		listPerson.add(p1);
		listPerson.add(p2);
		listPerson.add(p3);

		/*
		 * System.out.println(p1.toString()); 
		 * System.out.println(p2.toString());
		 * System.out.println(p3.toString());
		 */
		

		System.out.println(listPerson.toString());
	}

}
