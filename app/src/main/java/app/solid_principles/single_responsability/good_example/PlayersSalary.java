package app.solid_principles.single_responsability.good_example;

class PlayersSalary {

   public void calculatePlayerSalary() {
      // some logic
   }


   /*

   Now we've separated each functionality in our program. We can call the classes anywhere we want to use them in our code.

   The examples we used use just showed each class having one method – this is mainly for simplicity.
   You can have as many methods as you want but they should be linked to the responsibility of the class.

   Now that we have separated the logic, our code is easier to understand as each core functionality has its own class. We can test for errors more efficiently.

   The code is now reusable. Before, we could only use these functionalities inside one class but now they can be used in any class.

   The code is also easily maintainable and scalable because instead of reading interconnected lines of code,
   we have separated concerns so we can focus on the features we want to work on.

    */

}
