package com.wjliuh.courseorg;

import java.util.List;

public class CourseDate {

    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    private String[] dagita = new String[] {"一","二","三","四"};
    public void println() {
	if(courses.size()>0) {
	    for(int i=0;i<courses.size();i++) {
		String temp = "第"+dagita[i+1]+"节课:%s ";
		System.out.print(String.format(temp, courses.get(i).getName()));
	    }
	    System.out.println();
	   
	}
    }
    
}
