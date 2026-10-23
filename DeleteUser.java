
public class DeleteUser {

    public static void main(String[] args) {

        int userId = 2;
        int rowsDeleted = 1;

        if (rowsDeleted > 0) {
            System.out.println("Row deleted successfully.");
        } else {
            System.out.println("No rows were deleted.");
        }
    }
}
