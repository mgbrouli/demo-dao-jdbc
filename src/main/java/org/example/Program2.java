package org.example;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.DepartmentDao;
import org.example.model.entities.Department;


public class Program2 {
    static void main(String[] args){


        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: Department INSERT ===");
        Department newDepartment = new Department(null, "Musica");
        //departmentDao.insert(newDepartment);
        System.out.println("Inserted! new id = "+ newDepartment.getId());

        System.out.println("\n=== TEST 2: Department UPDATE ===");
        int id = 7;
        departmentDao.update(new Department(id, "Pantera"));
        System.out.println("Updated obj "+ id);

        System.out.println("\n=== TEST 3: Department DELETE ===");
        departmentDao.deleteById(9);
        departmentDao.deleteById(10);
        departmentDao.deleteById(11);
        System.out.println("Delete for id's 9, 10 e 11");

        System.out.println("\n=== TEST 4: Department FindByID ===");
        System.out.println("Find by id 1"+ departmentDao.findById(2));
    }
}
