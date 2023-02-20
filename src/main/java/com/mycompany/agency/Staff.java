package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Sungwoo", "Queens", "111-111-1111", "111-111-1111", 1.00);
        ((Executive) staffList[0]).awardBonus(500.00);
        staffList[1] = new Intern("Laura", "NY", "123-456-7890");
        ((Intern) staffList[1]).pay();
        staffList[2] = new StaffEmployee("Ana", "NY", "222-222-2222", "232-323-2323", 2.50);
        ((StaffEmployee) staffList[2]).pay();
        staffList[3] = new TempEmploee("Tim", "NY", "123-456-1111", "111-222-3333", 1.25);
        ((TempEmploee) staffList[3]).addHours(40);
        staffList[4] = new StaffEmployee("Adeel", "NY", "111-222-3333", "123-123-1234", 10.00);
        ((StaffEmployee) staffList[4]).pay();
        staffList[5] = new StaffEmployee("John Doe", "NY", "111-111-2323", "222-222-3122", 1.50);
        ((StaffEmployee) staffList[5]).pay();
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}