// PROJECT NAME- AAROGYA KENDRA HOSPITAL MANAGEMENT

// PROJECT DISRIPTION:
// I created an application for my hospital, which helps me to STORE  the details instead of wrting it in book.
// This application takes all the details of patient like 
// *patient name
// *patient address
// *patient mobile
// *patient adhar card
// *Guardian name
// *Guardian mobile number  etc
// The application also validates:
// >>mobile number(10 digits)
// >>adhar number(12 digits)

// We can retrieve the patient details any time we want.
// It also update the status of recovery . like it removes the patient details once he is recovered and ready to be discharged.
// It is also easy to search the particular patient by name,city,address etc. To make it more simple it provides unique ID to patient which makes it easy to find out the particular patient.

// CONCEPTS/TECHNOLOGY  INCLUDED:

// I have used concepts like:
// >Exception handling
// >Oops concept 
// >ArrayLists
// >Collections


// The operations included in this applications are:

// 1)Add Patient
// 2)search Patient
// 3)Remove patient
// 4)display patient

import java.util.*;

class Patient {
  private static int nextId = 1;
  
  private int id;
  private String patientName;
  private int age;
  private String gender;
  private String aadharNumber;
  private String mobileNumber;
  private String city;
  private String address;
  private Date admissionDate;
  private String guardianName;
  private String guardianAddress;
  private String guardianMobile;
  private boolean recovered;
  
  public Patient(String patientName, int age, String gender, String aadharNumber, String mobileNumber,String city, String address, String guardianName, String guardianAddress,String guardianMobile)  {
    this.id = nextId++;
    this.patientName = patientName;
    this.age = age;
    this.gender = gender;
    this.aadharNumber = aadharNumber;
    this.mobileNumber = mobileNumber;
    this.city = city;
    this.address = address;
    this.admissionDate = new Date();
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianMobile = guardianMobile;
    this.recovered = false;
  }
  
  //setters
  void setpatientName(String patientName){
    this.patientName=patientName;
  }
  void setAge(int age){
    this.age=age;
  }
  
  
  void setGender(String gender) {
    this.gender = gender;
  }
  
  void setmobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }
  
  void setCity(String city) {
    this.city = city;
  }
  void setAadharNumber( String aadharNumber){
    this.aadharNumber=aadharNumber;
  }
  
  void setAddress(String address) {
    this.address = address;
  }
  
  void setadmissionDate(Date admissionDate) {
    this.admissionDate = admissionDate;
  }
  
  void setguardianName(String guardianName) {
    this.guardianName = guardianName;
  }

  void setGaurdianmobileNumber(String gaurdianmobileNumber){
    this.guardianMobile=gaurdianmobileNumber;
  }
  
  void setGuardianAddress(String guardianAddress) {
    this.guardianAddress = guardianAddress;
  }
  
  void setguardianMobile(String guardianMobile) {
    this.guardianMobile = guardianMobile;
  }
  // public void setRecovered(boolean recovered) {
  //   this.recovered = recovered;
  // }

  int getId() {
    return id;
  }
  
  String getpatientName() {
    return patientName;
  }
  
  //getters
  int getAge() {
    return age;
  }
  
  String getGender() {
    return gender;
  }
  
  String getAadharNumber() {
    return aadharNumber;
  }
  
  String getmobileNumber() {
    return mobileNumber;
  }
  
  String getCity() {
    return city;
  }
  
  String getAddress() {
    return address;
  }
  
  Date getadmissionDate() {
    return admissionDate;
  }
  
  String getguardianName() {
    return guardianName;
  }
  
  String getGuardianAddress() {
    return guardianAddress;
  }
  
  String getguardianMobile() {
    return guardianMobile;
  }
  
  // boolean isRecovered() {
  //   return recovered;
  // }
  public void displayAll() {
    System.out.println("Name: " + getpatientName());
    System.out.println("Age: " + getAge());
    System.out.println("Gender: " + getGender());
    System.out.println("Aadhar number(12 digits): " + getAadharNumber());
    System.out.println("Contact number(10 digits): " + getmobileNumber());
    System.out.println("City: " + getCity());
    System.out.println("Address: " + getAddress());
    System.out.println("Date of admission: " + getadmissionDate());
    System.out.println("Guardian name: " + getguardianName());
    System.out.println("Guardian address: " + getGuardianAddress());
    System.out.println("Guardian mobile number: " + getguardianMobile());
    System.out.println("Unique ID: " + getId());
    // System.out.println("Recovered: " + isRecovered());
  }
}

class PatientManagementSystem {
  Scanner sc=new Scanner(System.in);
  private ArrayList<Patient> listofPatient= new ArrayList<Patient>();
  
  void addPatient(String patientName, int age, String gender, String aadharNumber, String mobileNumber, String city, String address, String guardianName, String guardianAddress, String guardianMobile) throws IllegalArgumentException {
        // Validate age,mobile number,adhar
    if (age < 1 || age > 99) {
      throw new IllegalArgumentException("Age should be between 1 and 99");
    }
    if (aadharNumber.length() != 12) {
      throw new IllegalArgumentException("Aadhar Card number should contain 12 digits only");
    }
    if (mobileNumber.length() != 10) {
      throw new IllegalArgumentException("Contact number should contain 10 digits only");
    }
    Patient patient = new Patient(patientName, age, gender, aadharNumber, mobileNumber, city, address, guardianName, guardianAddress, guardianMobile);
    listofPatient.add(patient);
    System.out.println("Patient added with id: " + patient.getId());
  }
  public Patient getById(int id) {
    for (Patient patient : listofPatient) {
      if (patient.getId() == id) {
        return patient;
      }
    }
    return null;
  }
  public List<Patient> getByName(String patientName) {
    List<Patient> patients = new ArrayList<>();
    for (Patient patient : listofPatient) {
      if (patient.getpatientName().equals(patientName)) {
        patients.add(patient);
      }
    }
    return patients;
  }
  public List<Patient> getByCity(String city) {
    List<Patient> patients = new ArrayList<>();
    for (Patient patient : listofPatient) {
      if (patient.getCity().equals(city)) {
        patients.add(patient);
      }
    }
    return patients;
  }
  public List<Patient> getByAge(int startAge, int endAge) {
    List<Patient> patients = new ArrayList<>();
    for (Patient patient : listofPatient) {
      int age = patient.getAge();
      if (age >= startAge && age <= endAge) {
        patients.add(patient);
      }
    }
    return patients;
  }

  public void removePatient(int id) throws NullPointerException {
    Patient patient = getById(id);
    if (patient == null) {
      throw new NullPointerException("Patient with id " + id + " not found");
    }
    listofPatient.remove(patient);
    System.out.println("Patient with id " + id + " deleted");
  }
  
  void displayPatients() {
    if (listofPatient.size() == 0) {
      System.out.println("patients are not  found");
      System.out.println("**********");
    } 
    else
    {
      System.out.println("List of patients:");
      for (Patient patient : listofPatient) {
        System.out.println("Id: " + patient.getId());
        System.out.println("patientName: " + patient.getpatientName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Aadhar Number: " + patient.getAadharNumber());
        System.out.println("Contact Number: " + patient.getmobileNumber());
        System.out.println("City: " + patient.getCity());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Date of Admission: " + patient.getadmissionDate());
        System.out.println("Guardian patientName: " + patient.getguardianName());
        System.out.println("Guardian Address: " + patient.getGuardianAddress());
        System.out.println("Guardian Contact Number: "+patient.getguardianMobile());
        System.out.println("---------------");
      }
    }
  }
}

public class HospitalManagementSystem {
  public static void main(String[] args) {
    PatientManagementSystem patientSystem = new PatientManagementSystem();
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      System.out.println("Welcome to Arogya Kendra Hospital\n");
      System.out.println("1. Add Patient");
      System.out.println("2. Search Patient by City");
      System.out.println("3. Search Patient by age grpoup");
      System.out.println("4. Search Patient by ID ");
      System.out.println("5. Display Patient List");
      System.out.println("6. Delete Patient Records");
      System.out.println(" Enter 100 to Exit");
      System.out.println("***************");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter patient patientName: ");
          String patientName = sc.next();
          System.out.print("Enter patient age: ");
          int age = sc.nextInt();
          System.out.print("Enter patient gender: ");
          String gender = sc.next();
          System.out.print("Enter patient Aadhar Card number: ");
          String aadharNumber = sc.next();
          System.out.print("Enter patient contact number: ");
          String mobileNumber = sc.next();
          System.out.print("Enter patient city: ");
          String city = sc.next();
          System.out.print("Enter patient address: ");
          String address = sc.next();
          System.out.print("Enter patient guardian patientName: ");
          String guardianName = sc.next();
          System.out.print("Enter patient guardian address: ");
          String guardianAddress = sc.next();
          System.out.print("Enter patient guardian contact number: ");
          String guardianMobile = sc.next();
          try {
            patientSystem.addPatient(patientName, age, gender, aadharNumber, mobileNumber, city, address, guardianName, guardianAddress, guardianMobile);
          } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
          }
          System.out.println("-------------");
          break;
        case 2:
          System.out.print("Enter patient city: ");
          String patientCity = sc.next();
          List<Patient> patientsByCity = patientSystem.getByCity(patientCity);
          if (patientsByCity.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByCity) {
              p.displayAll();
            }
          } else {
            System.out.println("No patients found");
              
          }
          System.out.println("-------------");
          break;
          
        case 3:
          System.out.print("Enter start age: ");
          int startAge = sc.nextInt();
          System.out.print("Enter end age: ");
          int endAge = sc.nextInt();
          List<Patient>patientsByAgeGroup=patientSystem.getByAge(startAge,endAge);
          if (patientsByAgeGroup.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByAgeGroup) {
              p.displayAll();
            }
          } else {
            System.out.println("No patients found");
          }
          System.out.println("-------------");
          break;
          
        case 4:
          System.out.print("Enter patient ID: ");
          int id = sc.nextInt();
          Patient patient = patientSystem.getById(id);
          if (patient != null) {
            System.out.println("Patient found:");
            System.out.println(patient);
          } else {
            System.out.println("Patient not found");
          }
          System.out.println("-------------");
          break;
          
        case 5:
          patientSystem.displayPatients();
          System.out.println("-------------");
          break;
          
        case 6:
          System.out.println("enter id to be removed");
          int did=sc.nextInt();
          patientSystem.removePatient(did);
          System.out.println("-------------");
          break;
          
        case 100:
          System.out.println("do you want to exit?");
          exit = true;
          break;
          
        default:
          System.out.println("entered Invalid choice");
          break;
      }
    }
  }
}