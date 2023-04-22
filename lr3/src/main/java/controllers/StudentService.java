package controllers;


import com.example.demo2.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import students.Student;

@Service
    public class StudentService {

        private StudentRepository repository;

        @Autowired
        public void setRepository(StudentRepository repository) {
            this.repository = repository;
        }

        public void saveStudent(Student student) {
            repository.save(student);
        }
    }


