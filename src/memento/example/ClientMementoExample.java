package memento.example;

import test.HelperMethods;

public final class ClientMementoExample {
    private ClientMementoExample (){}

    public static void mementoExample(){
        HelperMethods.separateExamples();

        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First data\n");

        System.out.println(fileWriter + "\n\n");

        caretaker.save(fileWriter);

        fileWriter.write("Second data\n");

        System.out.println(fileWriter + "\n\n");

        caretaker.undo(fileWriter);

        System.out.println(fileWriter + "\n\n");

        HelperMethods.separateExamples();
    }

}
