/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import controller.ProjectController;
import java.util.Date;
import model.Project;

/**
 *
 * @author fernando.fernandes
 */
public class Test {

    public static void main(String[] args) {

        ProjectController projectController = new ProjectController();
        Project project = new Project();
        
        

        /* Realizar TESTE save no Project        
        project.setName("Projeto Teste");
        project.setDescription("Description");
        project.setCreatedAt(new Date());
        project.setUpdatedAt(new Date());
        projectController.save(project);
         */
        
        
        /* Realizar TESTE update no Project
        project.setId(4);
        project.setName("Novo nome do projeto"); 
        project.setDescription("Description Test");
        project.setCreatedAt(new Date());
        project.setUpdatedAt(new Date());
        projectController.update(project);
         */
        
        
        /* Realizar TESTE delete no Project
        projectController.removeById(4);
         */
    }

}
