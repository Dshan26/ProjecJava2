package estudiantesUmb;

public interface DataBaseImple {

    void insertInfor(int codigo, Students students);

    Students consultInfo(int codigo);

    void updateInfo(int codigo, Students students);

    void deleteInfor(int codigo);


}
