package ASM5.example.ASM5_PhamVanThanh.controller;

import ASM5.example.ASM5_PhamVanThanh.model.Course;
import ASM5.example.ASM5_PhamVanThanh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String viewProducts(Model model){
        model.addAttribute("listCourse", courseService.getAllCourses());
        return "home";
    }
    @GetMapping("/create")
    public String showNewProductForm(Model model){
        Course course = new Course();
        model.addAttribute("course",course);
        return "create";
    }

    @PostMapping("save")
    public String saveProduct(@ModelAttribute("course") Course course){
        courseService.saveProduct(course);
        return "redirect:/course/home";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id, Model model) {

        Course course = courseService.getCourseById(id);
        model.addAttribute("course", course);
        return "edit";
    }

    @GetMapping("remove/{id}")
    public String removeItem(@PathVariable("id") Integer id){
        courseService.remove(id);
        return "redirect:/course/home";
    }
}
