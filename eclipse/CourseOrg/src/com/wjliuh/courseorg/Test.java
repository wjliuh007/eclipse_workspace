package com.wjliuh.courseorg;

import java.util.ArrayList;
import java.util.List;

public class Test {
    List<Course> courses = new ArrayList<Course>();
    String allCourses = "语文,数学,外语,物理化学,药物分析,马克思原理,体育,天然药物分析,植物学,中药学";
    String numbers = "2,3,3,2,2,1,1,2,2,2";
    int classNumber = 10;
	List<CourseDate> cds = new ArrayList<CourseDate>(5);
    @org.junit.Test
    public void testClass() {

	for (int i = 0; i < allCourses.split(",").length; i++) {
	    courses.add(new Course("", allCourses.split(",")[i], 9, Integer
		    .parseInt(numbers.split(",")[i])));
	}

	for (int i = 0; i < classNumber; i++) {

	    List<CourseDate> oneClss = doOrag(i + 1);
	    for (int j = 0; i < oneClss.size(); j++) {
		oneClss.get(j).println();
	    }
	}
    }

    private List<CourseDate> doOrag(int i) {


	
	for(int j=0;j<courses.size();j++) {
	    int num = courses.get(j).getNumber();
	    for(int m=0;m<num;m++) {
		int index = getAvailable(courses.get(j));
		
	    }
	}
	return null;
    }
    
    private int getAvailable(Course c) {
	for(int i=0;i<cds.size();i++) {
	    List<Course> lcs = cds.get(i).getCourses();
	    for(int j=0;j<lcs.size();j++) {
		if(c.getName().equals(lcs.get(j).getName())) {
		    break;
		}
	    }
	    return i;
	}
	return 0;
    }
}
