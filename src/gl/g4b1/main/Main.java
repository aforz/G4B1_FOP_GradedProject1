package gl.g4b1.main;

import gl.g4b1.departments.admin.AdminDepartment;
import gl.g4b1.departments.hr.HrDepartment;
import gl.g4b1.departments.tech.TechDepartment;

public class Main {
    public static void main(String[] args) {
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        AdminDepartment adminDepartment = new AdminDepartment();

        System.out.println("Welcome to " + adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println("\nWelcome to " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println("\nWelcome to " + techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());
    }
}
