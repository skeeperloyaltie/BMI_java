// Body Mass Index (BMI) is a condition that is applied to determine whether an individual is suitable or not depending on somebody’s
//  height (m) and mass (kg). The standard is straightforward; if an individual’s BMI is 27 or greater, it implies overweight. 
//  A BMI less or equal to 15 indicates skinny. Finally, a BMI greater than 30 shows obesity.
// You have been requested to create a program that helps the Kenyan Defense Forces’ (KDF) Recruit Training Centre (RTS), 
// to calculate the BMI of a person (BMI = kg/m2), where kg is a person's weight in kilograms and m2 is their height in metres squared.
// Besides, decide whether the individual has as well finished running a 10 km distance in the required time. 
// Men should complete 10km in less than 60 minutes for them to be accepted. Women should do that in under 80 minutes. Both males and females 
// are taken if their BMI is less than 25 and greater than 18.
// NB:  The input values for gender, mass and weight should be entered by the user.


import java.util.Scanner;

public class BMI {
    static void calculateBMI(){
        System.out.println("Enter your weight in kilograms: ");
        try (Scanner weight = new Scanner(System.in)) {
            double weightKg = weight.nextDouble();
            System.out.println("Enter your height in metres: ");
            try (Scanner height = new Scanner(System.in)) {
                double heightM = height.nextDouble();
                double BMI = weightKg / (heightM * heightM);
                // bmi into 3 decimal places
                BMI = Math.round(BMI * 1000.0) / 1000.0;
                System.out.println("Your BMI is: " + BMI);
                if (BMI < 18.5) {
                    System.out.println("Results from your BMI");
                    System.out.println("You are underweight.");
                } else if (BMI >= 18.5 && BMI < 25) {
                    System.out.println("Results from your BMI");
                    System.out.println("You are normal weight.");
                    
                } else if (BMI >= 25 && BMI < 30) {
                    System.out.println("Results from your BMI");
                    System.out.println("You are overweight.");
                } else {
                    System.out.println("Results from your BMI");
                    System.out.println("You are obese.");
                }
                // continue to run the program
                System.out.println("Do you want to continue? (y/n)");
                try (Scanner continueProgram = new Scanner(System.in)) {
                    String continueProgramInput = continueProgram.nextLine();
                    if (continueProgramInput.equals("y")) {
                        calculaterunFemale();
                    } else {
                        System.out.println("Thank you for using this program.");
                    }
                }
            }

            
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

    }

    // function to identify if men have run 10km within 60 minutes
    static void calculaterunMen(){
        System.out.println("Men Distance Run");
        System.out.println("Enter run KM: ");
        try (Scanner runKM = new Scanner(System.in)) {
            int runkm = runKM.nextInt();
            System.out.println("Enter run time in minutes: ");
            try (Scanner runTime = new Scanner(System.in)) {
                double runmin = runTime.nextDouble();
                if (runkm >= 10 && runmin <= 60){
                    System.out.println("You have finished running 10km in less than 60 minutes");
                    System.out.println("Do you want to continue? (y/n)");
                try (Scanner continueProgram = new Scanner(System.in)) {
                    String continueProgramInput = continueProgram.nextLine();
                    if (continueProgramInput.equals("y")) {
                        calculaterunMen();
                    } else {
                        System.out.println("Thank you for using this program.");
                    }
                }
                }
                else{
                    System.out.println("You have not finished running 10km in less than 60 minutes");
                }
                System.out.println("Do you want to continue? (y/n)");
                try (Scanner continueProgram = new Scanner(System.in)) {
                    String continueProgramInput = continueProgram.nextLine();
                    if (continueProgramInput.equals("y")) {
                        calculaterunFemale();
                    } else {
                        System.out.println("Thank you for using this program.");
                    }
                }
            }
           
        } catch (Exception e) {
            System.out.println("Invalid input");

        }
       
    }    

    static void calculaterunFemale(){
        System.out.println("Female Distance Run");
        System.out.println("Enter run KM: ");
        try (Scanner runKM = new Scanner(System.in)) {
            int runkm = runKM.nextInt();
            System.out.println("Enter run time in minutes: ");
            try (Scanner runTime = new Scanner(System.in)) {
                double runmin = runTime.nextDouble();
                if (runkm >= 10 && runmin <= 80){
                    System.out.println("You have finished running 10km in less than 80 minutes");
                    System.out.println("Do you want to continue? (y/n)");
                try (Scanner continueProgram = new Scanner(System.in)) {
                    String continueProgramInput = continueProgram.nextLine();
                    if (continueProgramInput.equals("y")) {
                        calculaterunMen();
                    } else {
                        System.out.println("Thank you for using this program.");
                    }
                }
                }
                
                else{
                    System.out.println("You have not finished running 10km in less than 80 minutes");
                }
                System.out.println("Do you want to continue? (y/n)");
                try (Scanner continueProgram = new Scanner(System.in)) {
                    String continueProgramInput = continueProgram.nextLine();
                    if (continueProgramInput.equals("y")) {
                        calculaterunMen();
                        
                    } else {
                        System.out.println("Thank you for using this program.");
                    }
                    
                }
                
            }
            
            
        } catch (Exception e) {
            System.out.println("Invalid input");

        }
       
    }
           
    public static void main(String[] args) {
        calculateBMI();
        calculaterunMen();
        calculaterunFemale();
    }
}


    