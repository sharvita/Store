public class MusicDepartment extends Department  {


    private static MusicDepartment singleInstance = new MusicDepartment();

//    public static MusicDepartment instance(){
//        return _instance;
//    }
//
//    protected MusicDepartment(){
//        try{
//            if(_instance != null){
//                throw new Exception("Cannot create another object");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }

    public static MusicDepartment MusicDepartment() // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new MusicDepartment();
            System.out.println("Music Department created");
            return singleInstance;
        }
        System.out.println("Music Department already exists");
        return singleInstance;
    }

    public static MusicDepartment MusicDepartment(String name, long departmentID) // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new MusicDepartment();
            System.out.println("Music Department created");
            return singleInstance;
        }
        System.out.println("Music Department already exists");
        return singleInstance;
    }
}
