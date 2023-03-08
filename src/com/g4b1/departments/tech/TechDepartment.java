package com.g4b1.departments.tech;

import com.g4b1.departments.super1.SuperDepartment;

public class TechDepartment extends SuperDepartment {

    public String departmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "core Java";
    }
}
