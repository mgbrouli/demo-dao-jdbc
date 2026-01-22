package org.example;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.DepartmentDao;
import org.example.model.entities.Department;


public class Program2 {
    static void main(String[] args){


        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department INSERT ===");
        Department newDepartment = new Department(null, "Musica");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new id = "+ newDepartment.getId());

        System.out.println("\n=== TEST 2: Department UPDATE ===");
        int id = 7;
        departmentDao.update(new Department(id, "Pantera"));
        System.out.println("Updated obj "+ id);
    }
}
