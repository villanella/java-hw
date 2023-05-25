package org.homework7;

import java.io.IOException;

class ErrorPrinter {
    public void printErrorMessage() {
        try {
            throw new IOException("File not found");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
