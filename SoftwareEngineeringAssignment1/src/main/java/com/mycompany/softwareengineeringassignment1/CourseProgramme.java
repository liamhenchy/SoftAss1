package com.mycompany.softwareengineeringassignment1;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.joda.time.DateTime;

public class CourseProgramme
{
    private String courseName;
    List<Module> moduleList;
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    
    public CourseProgramme(String courseName)
    {
        this.courseName = courseName;
    }
        
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
        
    public String getCourseName()
    {
        return courseName;
    }
}