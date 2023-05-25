package org.homework7;

class ProgramTerminator {
    public void terminateProgram() {
        try {
            throw new RuntimeException("Something went wrong");
        } catch (RuntimeException e) {
           // System.out.println("\nSomething went wrong. Goodbye!");
            System.exit(1);
        }
    }
}
