package com.mycompany.softwareengineeringassignment1;

import java.util.List;

public class Module
{
    private String moduleName;
    private String moduleId;
    List<Student> studentList;
    Student[] student = new Student[5];
    
    public Module(String moduleName, String moduleId)
    {
        this.moduleName = moduleName;
        this.moduleId = moduleId;
    }
        
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }
    
    public String getModuleName()
    {
        return moduleName;
    }
    
    public void setModuleId(String moduleId)
    {
        this.moduleId = moduleId;
    }
    
    public String getModuleId()
    {
        return moduleId;
    }
}