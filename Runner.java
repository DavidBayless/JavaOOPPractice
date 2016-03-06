import java.util.Timer;
import java.util.TimerTask;

public class Runner {
  public static void main(String [] args) {
    System.out.println("------------------");
    Wiener myWiener = new Wiener();
    myWiener.act();
    myWiener.act();
    myWiener.act();
    System.out.println("------------------");
    Rottweiler myRotty = new Rottweiler();
    myRotty.act();
    myRotty.act();
    myRotty.act();
    System.out.println("------------------");
    Goldfish myGolden = new Goldfish();
    myGolden.act();
    myGolden.act();
    myGolden.act();
    System.out.println("------------------");
    Persian myMeowth = new Persian();
    myMeowth.act();
    myMeowth.act();
    myMeowth.act();
    System.out.println("------------------");
    Piranha myScaryFish = new Piranha();
    myScaryFish.act();
    myScaryFish.act();
    myScaryFish.act();
    System.out.println("------------------");
    Lion tigersAndBears = new Lion();
    tigersAndBears.act();
    tigersAndBears.act();
    tigersAndBears.act();
    System.out.println("------------------");
    Timer wienerTimer = new Timer();
    Timer rottyTimer = new Timer();
    Timer goldeenTimer = new Timer();
    Timer piranhaTimer = new Timer();
    Timer persianTimer = new Timer();
    Timer lionTimer = new Timer();
    TimerTask wienerTask = new TimerTask() {
      public void run() {
        System.out.println("My Wiener " + myWiener.weight);
        myWiener.act();
      }
    };
    TimerTask rottyTask = new TimerTask() {
      public void run() {
        System.out.println("My Rotty " + myRotty.weight);
        myRotty.act();
      }
    };
    TimerTask goldeenTask = new TimerTask() {
      public void run() {
        System.out.println("My Goldfish " + myGolden.weight);
        myGolden.act();
      }
    };
    TimerTask piranhaTask = new TimerTask() {
      public void run() {
        System.out.println("My Piranha " + myScaryFish.weight);
        myScaryFish.act();
      }
    };
    TimerTask persianTask = new TimerTask() {
      public void run() {
        System.out.println("My Meowth" + myMeowth.weight);
        myMeowth.act();
      }
    };
    TimerTask lionTask = new TimerTask() {
      public void run() {
        System.out.println("My Lion");
        tigersAndBears.act();
      }
    };
    wienerTimer.schedule(wienerTask, 0L, 100);
    rottyTimer.schedule(rottyTask, 0L, 101);
    goldeenTimer.schedule(goldeenTask, 0L, 102);
    piranhaTimer.schedule(piranhaTask, 0L, 103);
    persianTimer.schedule(persianTask, 0L, 104);
    lionTimer.schedule(lionTask, 0L, 105);
  }
}
