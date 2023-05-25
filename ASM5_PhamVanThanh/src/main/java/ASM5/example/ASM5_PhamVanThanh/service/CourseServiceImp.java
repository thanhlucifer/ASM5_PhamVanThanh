package ASM5.example.ASM5_PhamVanThanh.service;

import ASM5.example.ASM5_PhamVanThanh.model.Course;
import ASM5.example.ASM5_PhamVanThanh.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseServiceImp implements CourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @Override
    public void saveProduct(Course product) {
        courseRepository.save(product);
    }

    @Override
    public Course getCourseById(int id){
        Optional<Course> optional = courseRepository.findById(id);
        Course course = null;
        if (optional.isPresent()) {
            course = optional.get();
        } else {
            throw  new RuntimeException("Course not found for id :: " + id);
        } return course;
    }

    @Override
    public void remove(int id) {
        this.courseRepository.deleteById(id);
    }

}
