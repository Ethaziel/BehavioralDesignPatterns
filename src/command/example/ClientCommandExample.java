package command.example;

import test.HelperMethods;

public final class ClientCommandExample {
    private ClientCommandExample(){}

    public static void commandExample(){
        HelperMethods.separateExamples();

        // creating receiver
        FileSystemReceiverInterface fsr = FileSystemReceiverUtil.getFileSystem();

        // creating command with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fsr);

        // creating invoker and connect it with command
        FileInvoker file = new FileInvoker(openFileCommand);

        // perform action
        file.execute();


        // other commands
        WriteFileCommand writeFileCommand = new WriteFileCommand(fsr);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fsr);
        file = new FileInvoker(closeFileCommand);
        file.execute();

        HelperMethods.separateExamples();
    }
}
