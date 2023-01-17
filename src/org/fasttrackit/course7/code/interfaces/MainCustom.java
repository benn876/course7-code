package org.fasttrackit.course7.code.interfaces;

public class MainCustom {
    public static void main(String[] args) {
        Company myCompany = new Company("FTP", new McDonalds(5));
        Company anotherCompany = new Company("anotherCompany", new KFC(7));

        myCompany.getFoodProvider().addMoreQuantity(6);
        anotherCompany.getFoodProvider().addMoreQuantity(2);
    }
}
