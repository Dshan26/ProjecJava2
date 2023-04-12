package estudiantesUmb;

import java.util.HashMap;

public class StudentManagement implements DataBaseImple{

    private final HashMap<Integer, Students> studentsHashMap;

    public StudentManagement() {
        studentsHashMap = new HashMap<Integer, Students>();
    }


    @Override
    public void insertInfor(int codigo, Students students) {
        studentsHashMap.put(codigo,students);
    }

    @Override
    public Students consultInfo(int codigo) {
        return studentsHashMap.get(codigo);
    }

    @Override
    public void updateInfo(int codigo, Students students) {
        studentsHashMap.put(codigo,students);

    }

    @Override
    public void deleteInfor(int codigo) {
        studentsHashMap.remove(codigo);
    }

    public void ViewStudent(){
        int cont=1;
        for (Integer codigo: studentsHashMap.keySet()){
            Students students = studentsHashMap.get(codigo);
            System.out.println("====Estudiante "+(cont)+"====");
            System.out.println("1.Codigo:"+codigo+
                    "\n2.Name:"+students.getName()+
                    "\n3.LASTNAME:"+students.getLastName()+
                    "\n4.EMAIL:"+students.getEmail()+
                    "\n5.PHONE NUMBER:"+students.getPhoneNumber()+
                    "\n5.HOME STREET:"+students.getStreetHome());
            cont++;
            System.out.println();
        }
    }
}
