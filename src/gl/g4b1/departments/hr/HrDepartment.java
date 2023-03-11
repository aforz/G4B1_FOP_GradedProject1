package gl.g4b1.departments.hr;

import gl.g4b1.departments.super1.SuperDepartment;

public class HrDepartment extends SuperDepartment {

    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team Lunch";
    }
}
