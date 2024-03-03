package org.example;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multipliedCreditAndCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for(Course course: courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
         return courses.stream()
                .mapToInt(Course::getGredit)
                .sum();
    }
}
