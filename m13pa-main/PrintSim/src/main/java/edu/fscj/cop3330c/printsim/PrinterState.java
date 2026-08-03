// PrinterState.java
// R. Tran 3546402
// 8/3/26
// enforce printer state behavior

package edu.fscj.cop3330c.printsim;

interface PrinterState {
    void processQueue(Printer printer);
}