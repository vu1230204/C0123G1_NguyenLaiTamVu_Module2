package case_study.util.Read;

import case_study.model.Employee;
import case_study.util.Write.WriteEmployees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployees {
    public static List<Employee> readEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            String temp = "";
            String[] arrayTemp;
            Employee employee;
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine()) != null) {
                arrayTemp = temp.split(",");
                employee = new Employee(Integer.parseInt(arrayTemp[0]), arrayTemp[1], arrayTemp[2], arrayTemp[3], Integer.parseInt(arrayTemp[4]), arrayTemp[5], arrayTemp[6], arrayTemp[7], Float.parseFloat(arrayTemp[8]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            WriteEmployees.writeEmployees(path, employeeList);
        }
        return employeeList;
    }

}
