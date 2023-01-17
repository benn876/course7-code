package org.fasttrackit.course7.code.interfaces3;

public class ManualProvider implements DataProvider {
    private Integer length;

    public ManualProvider(Integer length) {
        this.length = length;
    }

    @Override
    public String[] provideData() {
        return new String[]{"test1", "test2", "test3"};
    }
}
