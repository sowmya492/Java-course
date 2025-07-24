package LMSTasks;

public class Clg_Form {

    public static void main(String[] args) {
        char ifStudent1stYear = 'F';
        char ifStudentTransferee = 'T';
        char ifStudentReturnee = 'R';
        String Last_name ="Vathsav";
        String First_name ="sri";
        String Middle_name ="Pranav";
        //complete address
        String DOB = "03/06/2003";
        String BirthPlace = "Manila";
        //citizenShip
        String ifCitizenShipFilipino = "Filipino";
        String ifCitizenShipOthers = "Other";
        //civilStatus
        String ifCivilStatusSingle = "Single";
        String ifCivilStatusMarried = "Married";
        //gender
        char ifGenderFemale = 'F';
        char ifGenderMale = 'M';
        char ifGenderOthers ='O';
        //contact
        long ContactNumber = 1234567890;
        //religion
        String Religion = "Hindhu";
        //NameOfSpouse
        String NameOfSpouse ="Sravya";
        //Contact of spouse
        long ContactNumOfSpouse = 9567892197l;
        //Father details
        //note : indicate + after the name if deceased
        String FatherName = "Sri Vathsav";
        String FOccupation ="Teacher";
        long FContact = 7890654321l;
        //Mother details
        String MotherName = "Renuka Vathsav";
        String MOccupation ="House Maker";
        long MContact = 7890654332l;
        //Gaudian's details
        String GaurdianName = "Deepak Vathsav";
        String GaurdiansAdress = "SomeColony,SomeCity,56789";
        long Contact = 7899991332l;
        //educational details
        String SHS = "Senior HS";
        String SHSstrand = "Science & Humanities";
        Short yearPassed = 2024;
        float genAvg = 75.9f;
        //For Transferee / TECH-VOC COURSE graduate/2nd course
        String LastSchoolAttended = "somexyz";
        String course ="xyz";
        short LastSchoolYear = 2022;
        
        boolean ifALSpasser = true;
        boolean ifALSfail = false;
        Short AlsYear = 2023;
        // is Your Family 4ps benificiary?
        boolean if4psbenificiary = true;
        boolean ifnot4psbenificiary = false;
        long IdNumOf4ps = 23145678901234567l; 
        boolean anyDisabilityORpwd = true;
        String TypeOfDisability ="ertyu";
        boolean ifNOtDisable = false;
        
        
        
        System.out.println("-------------College Admission Form ---------------");


        System.out.println("if student 1st year : " + ifStudent1stYear);
        System.out.println("ifStudent Transferee : " + ifStudentTransferee);
        System.out.println("ifStudent Returnee : " + ifStudentReturnee);

        System.out.println("--------- Student Details ---------");
        System.out.println("Last name : " + Last_name);
        System.out.println("First name : " + First_name);
        System.out.println("MIddle name : " + Middle_name);
        System.out.println("Dob : " + DOB);
        System.out.println("Birth place : " + BirthPlace);
        System.out.println("citizen ship : " + ifCitizenShipFilipino);
        System.out.println("citizenship others : " + ifCitizenShipOthers);
        System.out.println("if single : " + ifCivilStatusSingle);
        System.out.println("if married : " + ifCivilStatusMarried);
        System.out.println("gender : " + ifGenderFemale);
        System.out.println("gender : " + ifGenderMale);
        System.out.println("gender : " + ifGenderOthers);
        System.out.println("Student contact : " + ContactNumber);
        System.out.println("Religion : " + Religion );
        
        System.out.println("=== If Married Fill Spouse Details ===");
        
        System.out.println("Name : " + NameOfSpouse);
        System.out.println("Contact:" + ContactNumOfSpouse);
        
        System.out.println("=== Father's Details ===");
        System.out.println("Father's Name : " + FatherName);
        System.out.println("Occupation : " + FOccupation);
        System.out.println("Contact : " + FContact);

        System.out.println("==== Mother's Details ====");
        System.out.println("Name : " + MotherName);
        System.out.println("Occupation : " + MOccupation);
        System.out.println("Contact : " + MContact);

        
        System.out.println("Gaudian details");
        System.out.println("Name :" + GaurdianName);
        System.out.println("Address : " + GaurdiansAdress);
        System.out.println("Contact : " + Contact);

        System.out.println("=== Education Details ===");
        System.out.println("SHS Name : " + SHS);
        System.out.println("SHS strad name : " + SHSstrand);
        System.out.println("Year of pass : " + yearPassed);
        System.out.println("Gen.Avg : " + genAvg);
        System.out.println("Last School Attended : " +LastSchoolAttended );
        System.out.println("Course name : " + course);
        System.out.println("Year of pass : " +LastSchoolYear);


        System.out.println("=== ALS details ===");
        System.out.println("ALS Passed : " + ifALSpasser);
        System.out.println("If ALS failed : " + ifALSfail);
        System.out.println("Year of pass : " + AlsYear);


        System.out.println("==== 4ps Benificiary ====");
        System.out.println("4ps benificiary : " + if4psbenificiary);
        System.out.println("Id Num : " + IdNumOf4ps);
        System.out.println("if no benificiery : " + ifnot4psbenificiary);


        System.out.println("==== Disability checking ====");
        System.out.println("is Student disable : " + anyDisabilityORpwd);
        System.out.println("Disability Type : " + TypeOfDisability);
        System.out.println("If Not Disable : " + ifNOtDisable);
    }

}
