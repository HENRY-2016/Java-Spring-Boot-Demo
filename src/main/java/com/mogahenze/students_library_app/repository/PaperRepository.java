package com.mogahenze.students_library_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mogahenze.students_library_app.entity.Paper;

public interface PaperRepository extends JpaRepository<Paper, Integer> {
    Paper findByName(String name); // custom mthd to find name in table
}
