package cn.itcast.springboot.service;

import cn.itcast.springboot.dao.StudentDAO;
import cn.itcast.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Collection<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public Collection<Student> updateStudentById(Student student) {
        return studentDAO.updateStudentById(student);
    }

    @Override
    public Collection<Student> addStudentById(Student student) {
        return studentDAO.addStudentById(student);
    }

    @Override
    public Collection<Student> deleteStudentById(Long id) {
        return studentDAO.deleteStudentById(id);
    }
}
