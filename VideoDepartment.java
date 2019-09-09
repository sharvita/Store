public class VideoDepartment extends Department {

    private static VideoDepartment _instance = new VideoDepartment();

   //ed VideoDepartment(){
//        try{
//            if(_instance != null){
//                throw new Exception("Cannot create another object");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }

    private static VideoDepartment singleInstance;
    private VideoDepartment() {
        super();
        singleInstance = this;
    }

    public static VideoDepartment VideoDepartment() // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new VideoDepartment();
            System.out.println("Video Department created");
            return singleInstance;
        }
        System.out.println("Video Department already exists");
        return singleInstance;
    }

    public static VideoDepartment VideoDepartment(String name, long departmentID) // "constructor" that returns a Singleton instance of MusicDepartment
    {
        if (singleInstance == null) {
            singleInstance = new VideoDepartment();
            System.out.println("Video Department created");
            return singleInstance;
        }
        System.out.println("Video Department already exists");
        return singleInstance;
    }

}
