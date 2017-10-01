package com.kodilla.good.patterns.challenges;

public class SellingInformation {

    private String buyingProcess;
    private boolean availableStuff;

    public SellingInformation(String buyingProcess, boolean availableStuff) {
        this.buyingProcess = buyingProcess;
        this.availableStuff = availableStuff;
    }

    public void sendingMessage(String buyingProcess, boolean availableStuff) {

        String message;

        if (buyingProcess.equals("Buying") && availableStuff) {
            message = "Product available";
        } else {
            message = "Product unavailable";
        }
        System.out.println(message);
    }
}