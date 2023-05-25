package ASM5.example.ASM5_PhamVanThanh.service;

import ASM5.example.ASM5_PhamVanThanh.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();
    void saveProduct(Course course);
    Course getCourseById(int id);
    void remove(int id);
}
