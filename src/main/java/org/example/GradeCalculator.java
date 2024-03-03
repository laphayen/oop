package org.example;

import java.util.List;

public class GradeCalculator {
    private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for(Course course: courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        int totalCompleteCredit = courses.stream()
                .mapToInt(Course::getGredit)
                .sum();

        return multipliedCreditAndCourseGrade  / totalCompleteCredit;
    }
}
