package com.wjliuh.courseorg;

import java.util.List;

public class Class {

    /**班级名称*/
    private String name;
    /**班级编码*/
    private String code;
    
    /**该班级需要修的课程*/
    private List<Course> couses;
    
    /**该班级一个学期所有的课程*/
    private List<CourseDate> allCourseHours;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    public List<Course> getCouses() {
        return couses;
    }
    public void setCouses(List<Course> couses) {
        this.couses = couses;
    }
    public List<CourseDate> getAllCourseHours() {
        return allCourseHours;
    }
    public void setAllCourseHours(List<CourseDate> allCourseHours) {
        this.allCourseHours = allCourseHours;
    }
    
    
}
