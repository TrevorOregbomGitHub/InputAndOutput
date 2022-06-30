package com.qa.InputAndOutput;

public class InputAndOutput {
	
	private String name;
	private int age;
	private String jobTitle;
	
	public InputAndOutput(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}

}
