public class BookDepartment extends Department {


    private static BookDepartment singleInstance = new BookDepartment();


//    protected BookDepartment(){
//        try{
//            if(_instance != null){
//                throw new Exception("Cannot create another object");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
public static BookDepartment BookDepartment() // "constructor" that returns a Singleton instance of MusicDepartment
{
    if (singleInstance == null) {
        singleInstance = new BookDepartment();
        System.out.println("Book Department created");
        return singleInstance;
    }
    System.out.println("Book Department already exists");
    return singleInstance;
}

    public static BookDepartment BookDepartment(String name, long departmentID) // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new BookDepartment();
            System.out.println("Book Department created");
            return singleInstance;
        }
        System.out.println("Book Department already exists");
        return singleInstance;
    }

}

