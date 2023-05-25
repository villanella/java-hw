package org.homework7;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter();
        TextProcessor textProcessor = new TextProcessor();
        ProgramTerminator programTerminator = new ProgramTerminator();
        ResourceProcessor resourceProcessor = new ResourceProcessor();

        System.out.println("1. Print error message demo");
        errorPrinter.printErrorMessage();


        System.out.println("2. Rethrow demo");
        try {
            textProcessor.processText();
        } catch (AccountUnavailableException e) {
            System.out.println("Caught AccountUnavailableException: " + e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Caused by: " + cause.getMessage());
            }
        }


        System.out.println("3. Try-with-resources demo");
        DataSource ds = new DataSource();
        resourceProcessor.processResource(ds);


        System.out.println("4. Exit from program");
        programTerminator.terminateProgram();
    }
}

