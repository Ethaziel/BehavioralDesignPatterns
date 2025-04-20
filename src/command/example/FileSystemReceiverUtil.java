package command.example;

public class FileSystemReceiverUtil {

    private FileSystemReceiverUtil(){}

    public static FileSystemReceiverInterface getFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("OS is: " + osName);
        if (osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }

}
