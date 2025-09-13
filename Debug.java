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
        if (var2 == 6){ // I fixed it so it can check if it is equal to 6, 
        //then to 5, then greater than 5 and then less than 5. 
        // the first check for 6 probably was unnecessary code, but I didn't want to remove it since it was in the original code.
            System.out.println("Var2 is 6");
        } else if (var2 == 5){
        System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else {
            System.out.println("Var2 is less than 5");
        }

        int var3 = 5;
        if (var3==10 ){ // Everything is good, just added a check so we dont run into any issues if 10 is input,
            System.out.println("Var3 is 10");
        } else {
            System.out.println("Var3 is less than 10");
        }


        //for this section: why are we not entering the if statement?
        // I added a string for marist, which accepts both capitalized and uncapitalized Marist
        String school = "Marist" ;
        if (school == "marist"){
            System.out.println("Marist college!");
        } else if (school == "Marist"){ //
            System.out.println("Marist college!");
        } else {
            System.out.println("Not marist college :(!");
        }
        // Or in a more simple way we can simply use the .equals which we found out about before
        if ("Marist".equals("marist")){
            System.out.println("Marist college!");
        } else {
            System.out.println("Not marist college :(!");
        }
     }}