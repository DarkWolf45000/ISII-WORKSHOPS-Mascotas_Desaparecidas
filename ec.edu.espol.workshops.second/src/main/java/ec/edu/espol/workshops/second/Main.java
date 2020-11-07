package ec.edu.espol.workshops.second;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean continuar = true;
    while (continuar) {
      boolean banderaEdad = true;
      System.out.println("Enter the client data:");
      int ageC = 0;
      System.out.println("Enter the age of the client:");
      while (banderaEdad) {
        try {
          String age = scan.nextLine();
          ageC = Integer.parseInt(age);
          banderaEdad = false;
        } catch (NumberFormatException error) {
          System.out.println("Please enter a correct age!");
        }
      }

      System.out.println("Enter the sex of the client(M for male and F for female):");
      String sex = "lol";
      while (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f")) {
        sex = scan.nextLine();
        if (!sex.equalsIgnoreCase("m") && !sex.equalsIgnoreCase("f")) {
          System.out.println("Please enter a correct sex!");
        }

      }

      System.out.println("Is the client married?(Y/N):");
      String maritalState = "lol";
      boolean ms = true;
      while (!maritalState.equalsIgnoreCase("Y") && !maritalState.equalsIgnoreCase("N")) {
        maritalState = scan.nextLine();
        if (!maritalState.equalsIgnoreCase("Y") && !maritalState.equalsIgnoreCase("N")) {
          System.out.println("Please enter a correct marital status!");
        } else if (maritalState.equalsIgnoreCase("N")) {
          ms = false;
        }
      }

      System.out.println("Did the client present a valid driving license?(Y/N):");
      String drivingLicense = "lol";
      boolean dl = true;

      while (!drivingLicense.equalsIgnoreCase("Y") && !drivingLicense.equalsIgnoreCase("N")) {
        drivingLicense = scan.nextLine();
        if (!drivingLicense.equalsIgnoreCase("Y") && !drivingLicense.equalsIgnoreCase("N")) {
          System.out.println("Please enter a correct driving license status!");
        } else if (maritalState.equalsIgnoreCase("N")) {
          dl = false;
        }
      }

      CarInsurance c = new CarInsurance(ageC, sex, ms, dl);
      int insurance = c.calculateInsurance();
      if (insurance != -1) {
        System.out.println("The value of the client's insurance is: " + insurance);
      } else {
        System.out.println("Client data is invalid. ");
      }

      System.out.println("Do you want to enter another client?(Y/N):");
      String newClient = "lol";

      while (!newClient.equalsIgnoreCase("Y") && !newClient.equalsIgnoreCase("N")) {
        newClient = scan.nextLine();
        if (!newClient.equalsIgnoreCase("Y") && !newClient.equalsIgnoreCase("N")) {
          System.out.println("Please enter a correct option!");
        } else if (newClient.equalsIgnoreCase("N")) {
          continuar = false;
        }
      }

    }
    scan.close();
  }

}
