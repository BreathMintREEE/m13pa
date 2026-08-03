// PrintJob.java
// R. Tran 3546402
// 8/3/26
// print job for rinter simulation

package edu.fscj.cop3330c.printsim;

class PrintJob {
    private final String documentName;
    private final int jobNumber;

    public PrintJob(String documentName, int jobNumber) {
        this.documentName = documentName;
        this.jobNumber = jobNumber;
    }

    public String getDocumentName() {
        return documentName;
    }

    public int getJobNumber() {
        return jobNumber;
    }
}