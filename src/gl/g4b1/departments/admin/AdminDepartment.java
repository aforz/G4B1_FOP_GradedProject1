package gl.g4b1.departments.admin;

import gl.g4b1.departments.super1.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

    public String departmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
