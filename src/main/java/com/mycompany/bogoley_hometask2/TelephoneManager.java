package com.mycompany.bogoley_hometask2;

import java.util.ArrayList;
import java.util.List;

public class TelephoneManager {
    private List<Telephone> telephoneList;

    public TelephoneManager() {
        this.telephoneList = new ArrayList<>();
        telephoneList.add(new Telephone("Panasonic", "X35235ZMD", "white", false));
        telephoneList.add(new Telephone("Samsung S10", "XYZ123456789", "black", true));
        telephoneList.add(new Telephone("Iphone X", "ASIOS77777QWERTY", "black", true));
    }

    public void addTelephone(Telephone telephone) {
        for (Telephone tel : telephoneList) {
            if (tel.getSerialNumber().equals(telephone.getSerialNumber())) {
                System.out.println("Telephone with this serial number already exists.");
                return;
            }
        }
        telephoneList.add(telephone);
        System.out.println("Telephone added successfully.");
        displayTelephones();
    }

    public void removeTelephone(String serialNumber) {
        for (Telephone tel : telephoneList) {
            if (tel.getSerialNumber().equals(serialNumber)) {
                telephoneList.remove(tel);
                System.out.println("Telephone deleted successfully.");
                displayTelephones();
                return;
            }
        }
        System.out.println("Cant find telephone with this serial number.");
    }

    public void removeAllTelephones() {
        telephoneList.clear();
        System.out.println("All tepehones were deleted.");
        displayTelephones();
    }

    public void displayTelephones() {
        System.out.println("Current telephone list:");
        for (Telephone tel : telephoneList) {
            System.out.println(tel);
        }
        System.out.println();
    }
}
