package com.company;

public class Main {

    public static void main(String[] args) {
	Accounts accOne = new Accounts();
    accOne.setBalance(1500);

    accOne.withdrawFromAccount(1200);

    accOne.depositToAccount(1350);

    }
}
