public class Wiener extends Dog {

  public Wiener() {
    super();
    this.weight = 20;
    setSize(Size.Small);
  }

  void eat(Goldfish fishy) {
    this.weight += fishy.weight / 10;
    fishy.die();
    System.out.println("Ate a Goldfish. Om nom nom nom!");
  }

  void eat(String food) {
    this.weight += 2;
    System.out.println("Ate dog food. Meh.");
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
          this.eat("Dog Food");
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
// - Size is set to "small".
// - Only eats the following:
//   - Small fish.
//   - String "Dogfood".
//     - "Dogfood" adds 2 to weight.
