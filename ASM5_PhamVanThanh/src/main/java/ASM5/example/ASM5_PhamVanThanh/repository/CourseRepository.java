package ASM5.example.ASM5_PhamVanThanh.repository;

import ASM5.example.ASM5_PhamVanThanh.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
