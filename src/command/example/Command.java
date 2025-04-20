package command.example;

public interface Command {
    void execute();

    // could contain undo/redo commands
}

class OpenFileCommand implements Command{
    private FileSystemReceiverInterface fileSystem;

    // store previous state for undo if needed


    public OpenFileCommand(FileSystemReceiverInterface fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        // here would be saving of the state for undo method
        this.fileSystem.openFile();
    }
}

class CloseFileCommand implements Command{
    private FileSystemReceiverInterface fileSystem;

    // store previous state for undo if needed


    public CloseFileCommand(FileSystemReceiverInterface fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        // here would be saving of the state for undo method
        this.fileSystem.closeFile();
    }
}

class WriteFileCommand implements Command{
    private FileSystemReceiverInterface fileSystem;

    // store previous state for undo if needed


    public WriteFileCommand(FileSystemReceiverInterface fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        // here would be saving of the state for undo method
        this.fileSystem.writeFile();
    }
}