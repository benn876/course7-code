package org.fasttrackit.course7.code.interfaces3;

public class Main {
    public static void main(String[] args) {
        SomeAlgorithm someAlgorithm = new SomeAlgorithm(new ManualProvider(4));
        someAlgorithm.getStringsBiggerThan(6);

        SomeAlgorithm anotherAlgorithm = new SomeAlgorithm(new ScannerProvider(5));
        anotherAlgorithm.getStringsBiggerThan(5);
    }
}
