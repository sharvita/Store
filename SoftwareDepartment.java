public class SoftwareDepartment extends Department {


    private static SoftwareDepartment singleInstance = new SoftwareDepartment();


//    protected SoftwareDepartment(){
//        try{
//            if(_instance != null){
//                throw new Exception("Cannot create another object");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }

    public static SoftwareDepartment SoftwareDepartment() // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new SoftwareDepartment();
            System.out.println("Software Department created");
            return singleInstance;
        }
        System.out.println("Software Department already exists");
        return singleInstance;
    }

    public static SoftwareDepartment SoftwareDepartment(String name, long departmentID) // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new SoftwareDepartment();
            System.out.println("Software Department created");
            return singleInstance;
        }
        System.out.println("Software Department already exists");
        return singleInstance;
    }

}


