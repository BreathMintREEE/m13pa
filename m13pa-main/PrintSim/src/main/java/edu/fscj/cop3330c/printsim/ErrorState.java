// ErrorState.java
// R. Tran 3546402
// 8/3/26
// error message to catch problems

package edu.fscj.cop3330c.printsim;

class ErrorState implements PrinterState {
    @Override
    public void processQueue(Printer printer) {
        System.out.println("Printer is in an error state. Clearing error and transitioning to Idle...");
        printer.setState(new IdleState());
    }
}