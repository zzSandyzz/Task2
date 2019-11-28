public class AtomicSub {
    AtomicEngine engine =new AtomicEngine();

    void swim(){
        System.out.println("submarine floating");
        engine.startEngine();
    }

    class AtomicEngine{


        void startEngine(){
            System.out.println("engine started");
        }
    }
}
