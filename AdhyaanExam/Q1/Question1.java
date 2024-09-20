package AdhyaanExam.Q1;
import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class Question1 {
    public static void main(String[] args) {

        HashMap<String, List<String>> departmentEmployees = new HashMap<>();

        departmentEmployees.put("IT", new ArrayList<>(List.of("Ajhar Tamboli", "Aslam Tamboli", "Samir Tamboli")));
        departmentEmployees.put("HR", new ArrayList<>(List.of("Mahebub", "jakir ")));
        departmentEmployees.put("Finance", new ArrayList<>(List.of("Salim Tamboli", "Arbaz Tamboli")));

        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println("Department: " + department);
            for (String employee : employees) {
                System.out.println(" - Employee: " + employee);
            }
        }
    }
}

