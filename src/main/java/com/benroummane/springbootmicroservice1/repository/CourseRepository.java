package com.benroummane.springbootmicroservice1.repository;

import com.benroummane.springbootmicroservice1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<Course, Long> {

}
