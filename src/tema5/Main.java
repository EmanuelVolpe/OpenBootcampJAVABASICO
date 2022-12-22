package tema5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.findAll();
        cocheCrud.save();
        cocheCrud.delete();
    }
}
