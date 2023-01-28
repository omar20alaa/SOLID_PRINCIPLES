package app.solid_principles.interface_segregation.good_usecase;

class Omar implements MathematicsTeacher {

    @Override
    public void Teach() {
        System.out.println("Omar has started teaching.");
    }


    @Override
    public void Mathematics() {

    }


   /*
    We have created different interfaces for every subject. Now Omar can teach Mathematics without carrying the other methods with them.

    */


}
