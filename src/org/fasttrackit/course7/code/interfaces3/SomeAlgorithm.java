package org.fasttrackit.course7.code.interfaces3;

public class SomeAlgorithm {
    private DataProvider dataProvider;

    public SomeAlgorithm(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public void getStringsBiggerThan(Integer biggerThan) {
        for (String string : this.dataProvider.provideData()) {
            if (string.length() > biggerThan) {
                System.out.println(string);
            }
        }
    }
}
