package com.gyn.home;

public abstract class DataScanner implements Scanner {

    abstract void scanHello();

    private void scanData() {
        System.out.println("scan data!!");
    }

    protected void scanFile() {
        System.out.println("scan file");
    }

    @Override
    public void scanRegion() {
        scanData();
        scanHello();
        System.out.println("scan region!!!");
    }
}
