package com.gyn.home;

public class DataRegionScanner extends DataScanner {

    @Override
    void scanHello() {
        scanFile();
        System.out.println("scan hello");
    }
}
