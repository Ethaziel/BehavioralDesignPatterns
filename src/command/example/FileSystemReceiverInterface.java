package command.example;

public interface FileSystemReceiverInterface {

    void openFile();
    void writeFile();
    void closeFile();

}

class UnixFileSystemReceiver implements FileSystemReceiverInterface {
    @Override
    public void openFile() {
        System.out.println("Opening file in Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix OS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiverInterface {
    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }
}