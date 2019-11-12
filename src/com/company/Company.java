package com.company;

import java.util.Arrays;

public class Company {
    // fields
    String companyName;
    Employee employees [];

    @Override
    public String toString() {
        return "[companyName="+companyName+
                ",employees="+Arrays.toString(employees)+"]";
    }
}
