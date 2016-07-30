package com.wjliuh.courseorg;

import java.util.List;

public class Teacher {

    /**学科类别*/
    private String type;
    /**学科类别名称*/
    private String typeName;
    /**老师名称*/
    private String name;
    private String code;
    private List<Class> ownerClass;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
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
    public List<Class> getOwnerClass() {
        return ownerClass;
    }
    public void setOwnerClass(List<Class> ownerClass) {
        this.ownerClass = ownerClass;
    }
    
}
