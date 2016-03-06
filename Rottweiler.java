public class Rottweiler extends Dog {

  public Rottweiler() {
    super();
    setSize(Size.Large);
    this.weight = 70;
  }

  void eat(Goldfish fishy) {
    this.weight += fishy.weight / 10;
    fishy.die();
    System.out.println("Ate a Goldfish. Om nom nom nom!");
  }

  void eat(Persian kitty) {
    this.weight += kitty.weight / 10;
    kitty.die();
    System.out.println("Ate a kitty. Woof!");
  }

  void act() {
    if (this.isDead != true && this.isSleeping != true) {
      int random = (int) Math.floor(Math.random() * 3 + 1);
      if (random == 3) {
        this.sleep();
      } else if (random == 2) {
        random = (int) Math.floor(Math.random() * 2 + 1);
        if (random == 1) {
          this.eat(new Goldfish());
        } else {
          this.eat(new Persian());
        }
      } else if (random == 1) {
        this.poop();
      }
    } else if (this.isSleeping == true) {
      this.sleep();
    }
  }
}

// - Subclasses Dog.
// - Size is set to "large".
// - Only eats the following:
//   - Small cats.
//   - Small fish.
