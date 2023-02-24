package utilies;

public class Utilities {
    public static void print(Object args){
        System.out.println(args);
    }
    public static void ClearConsole(){
        try{
            //String operatingSystem = System.getProperty("os.name"); //Check the current operating system

           /* if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {*/
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            //}
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
