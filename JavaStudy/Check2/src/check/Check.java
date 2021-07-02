package check;

import constants.Constants;

public class Check {

     private String firstName = "誠志郎";
     private String lastName = "菅原";
      
      private void printName() {
      System.out.println("printNameメソッド" + firstName + lastName);
    }
      public  static void main(String[] args) {
          Check pn = new Check();
          pn.printName();
          
          Pet pet = new Pet(Constants.CHECK_CLASS_JAVA ,Constants.CHECK_CLASS_HOGE);
          pet.introduce();
          
          RobotPet RobotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
          RobotPet.introduce();
    }
        
   
    }

