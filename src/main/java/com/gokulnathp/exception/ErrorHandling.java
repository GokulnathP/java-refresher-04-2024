package com.gokulnathp.exception;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class AutoClose implements AutoCloseable {
    public AutoClose(boolean throwError) throws CustomException {
        if(throwError) {
            throw new CustomException("Just closing");
        }
    }

    public void throwError() throws CustomException {
        throw new CustomException("Throwing the exception");
    }

    public void close() {
        System.out.println("Closing it");
    }
}

class Handler {
    public void handle(int a, int b) throws CustomException {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            throw new CustomException("B cannot be zero");
        } catch (Exception e) {
            throw new CustomException("Something went wrong");
        } finally {
            System.out.println("I don't care what happens");
        }
    }

    public void autoClose() {
        try (AutoClose a = new AutoClose(false)) {
            a.throwError();
            System.out.println("Not gonna happen");
        } catch (CustomException e) {
            System.out.println("Error occurred");
        }
    }
}

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            new Handler().handle(1, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        new Handler().autoClose();
    }
}
