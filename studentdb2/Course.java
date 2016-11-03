package studentdb2;

import java.io.*;

public class Course implements Serializable{
	private String courseCode; // ex: CMSC22
	private String courseDescription; // ex: Introduction to OOP
	
	public Course(String courseCode, String courseDescription) {
		this.courseCode = courseCode;
		this.courseDescription = courseDescription;
	}

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDiscription) {
        this.courseDescription = courseDiscription;
    }

    public String toString(){
        return String.format("Course Code: %s\nCourse Description: %s", courseCode, courseDescription);
    }


}
