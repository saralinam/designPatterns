package structuralDP.compositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class HRDepartment extends Department{
    //we want to reach out all child class using filed

    List<Department> childDepartment;

    //constructor
    public HRDepartment(List<Department> childDepartment) {
        this.childDepartment = childDepartment;
    }

    // java is good

    @Override
    String getName() {
        return childDepartment.stream().// finance obj and Sale
                map(Department::getName)////"Finance  Sales
                .collect(Collectors.joining(" - ")); //"Finance" , "Sales
    }

    @Override
    List<String> getEmployee() {

        //the flatMap() is combine all resulting collection into a single object
        return childDepartment.stream()
                .flatMap(d->d.getEmployee()
                        .stream()).collect(Collectors.toList());
    }
}
