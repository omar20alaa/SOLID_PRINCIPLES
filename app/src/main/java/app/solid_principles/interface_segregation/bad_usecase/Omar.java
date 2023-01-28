package app.solid_principles.interface_segregation.bad_usecase;

class Omar implements Teacher {

   @Override
   public void English() {

   }

   @Override
   public void Biology() {

   }

   @Override
   public void Chemistry() {

   }

   @Override
   public void Mathematics() {
      System.out.println("Omar is teaching the students Math language.");
   }


   /*
   From the code above, you can tell that Omar is a Math teacher who has no business with the other subjects.
    But these other methods are extended by default with the Teacher interface.

   Do not confuse the Liskov substitution principle and the interface segregation principle. They may seem similar but they are not entirely the same.

   Liskov substitution principle gives us the idea that when a new class has the need to inherit an existing class,
   it should do so because this new class has a need for the methods the existing class has.

   On the other hand, the interface segregation principle makes us understand that it is unnecessary and unreasonable to create an interface
   with a lot of methods as some of these methods may be irrelevant to the needs of a particular user when extended.

   Now let's fix the code in the last example.

    */


}
