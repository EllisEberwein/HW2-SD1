public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else if (var1 == 4){ // I added an else if that checks that the number is equal to 4
            System.out.println("Var1 is equal to 4");
        }else{
            System.out.println("Var1 is less than 4");
        }

        int var2 = 6;
        if (var2 == 5){ // I fixed it removing the check if it is equal to 6, since that makes no sense, since the purpose is to check if its below or above 5 or is 5.
            // I arranged it to check if it is 5, then if it is greater than 5, then the else is automatically checking if its below 5.
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else {
            System.out.println("Var2 is less than 5");
        }

        int var3 = 5;
        if (var3==10 ){ // Everything is good, just added a check for 10 and added an else if so we dont run into any issues if 10 is input.
            System.out.println("Var3 is 10");
        } else if (var3 > 10){ // 
            System.out.println("Var3 is greater than 10");
        } else {
            System.out.println("Var3 is less than 10");
        }


        //for this section: why are we not entering the if statement?
        // I added a string for marist, and checks that accepts both capitalized and uncapitalized Marist
        String school = "Marist" ;
        if (school == "marist"){
            System.out.println("Marist college!");
        } else if (school == "Marist"){ //
            System.out.println("Marist college!");
        } else {
            System.out.println("Not marist college :(!");
        }
     }}
