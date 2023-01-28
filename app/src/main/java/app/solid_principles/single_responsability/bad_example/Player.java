package app.solid_principles.single_responsability.bad_example;

class Player {

    public void registerNewPlayer() {
        // some logic
    }

    public void calculatePlayerSalary() {
        // some logic
    }

    public void sendEmail() {
        // some logic
    }


   /*

    The class above violates the single responsibility principle. Why?

    This Player class has three responsibilities – registering new players, calculating their salary, and sending out emails to players.

    The code above will work perfectly but will lead to some challenges. We cannot make this code reusable for other classes or objects.
    The class has a whole lot of logic interconnected that we would have a hard time fixing errors.
    And as the codebase grows, so does the logic, making it even harder to understand what is going on.

    Imagine a new developer joining a team with this sort of logic with a codebase of about two thousand lines of code all congested into one class.

    Now let's fix this!

    */


}
