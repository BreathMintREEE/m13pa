// PausedState.java
// R. Tran 3546402
// 8/3/26
// Printer is paused

package edu.fscj.cop3330c.printsim;

class PausedState implements PrinterState {
    @Override
    public void processQueue(Printer printer) {
        System.out.println("Printer is paused. Resuming and transitioning to Idle state...");
        printer.setState(new IdleState());
    }
}