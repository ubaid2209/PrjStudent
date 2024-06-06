/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentlist;

/**
 *
 * @author first
 */
public class StudentList {

    public static void main(String[] args) {
        
        Student s1= new Student();
        s1.setName("ubaid");
        s1.setAge(19);
        Student s2= new Student();
        s2.setName("prab");
        s2.setAge(20);
        
        Student[] list = new Student[2];
        list[0]=s1;
        list[1]=s2;
        
        
        for(int i=0;i<list.length;i++)
        {
            
            System.out.println(list[i].getName()+" "+list[i].getAge());
        }   
        
        
    }
}
