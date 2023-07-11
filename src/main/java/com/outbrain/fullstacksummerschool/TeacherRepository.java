package com.outbrain.fullstacksummerschool;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    //if you want to customize elasticsearch queries you can use
    //@Query annotatio or @Native for SQL
    Integer countByEmail(String email);

    Teacher getTeacherByEmail(String email);

    List<Teacher> getTeachersByEmail(String email);

}
