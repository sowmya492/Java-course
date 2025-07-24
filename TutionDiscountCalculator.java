public class TutionDiscountCalculator {
    public static void main(String[]args){
        //input variables
        int GradeLevel = 12;
        double TutiionFee = 30000.0;
        boolean AcademicTopper = true;
        double DiscountPercentage = 0.0;

        //using conditional statements
        if(GradeLevel >= 9 && GradeLevel <= 12){
            if (AcademicTopper){
                DiscountPercentage = 20.0;
            }
            else{
                DiscountPercentage = 10.0;
            }
        }
        else if(GradeLevel >= 6 && GradeLevel <= 8){
            DiscountPercentage = 5.0;
        }
        else if(GradeLevel < 6){
            DiscountPercentage = 0.0;
        }

        if(GradeLevel == 10){
            DiscountPercentage += 3.0;
        }
        else if(GradeLevel == 12){
            DiscountPercentage += 5.0;
        }
        double DiscountedFee = TutiionFee - (TutiionFee*DiscountPercentage / 100.0);

        System.out.println("Student's Grade Level : " + GradeLevel);
        System.out.println("Base Tution Fee : $" +TutiionFee);
        System.out.println("Total Discount Percentage : " + DiscountPercentage + "%");
        System.out.println("TutionFee After The Discount :$" + DiscountedFee);
    }
}
