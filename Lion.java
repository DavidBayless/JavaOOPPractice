public class Lion extends Cat {

  public Lion() {
    super();
    setSize(Size.Large);
    this.weight = 150;
  }

  void eat(Entity other) {
    System.out.println("ROAR NOM!");
    other.die();
    this.weight += (int) Math.ceil(other.weight / 10);
  }

  void act() {
    if (this.isDead != true && this.isSleeping != true) {
      int random = (int) Math.floor(Math.random() * 5 + 1);
      if (random == 3 || random == 4 || random == 5) {
        this.sleep();
      } else if (random == 2) {
        random = (int) Math.floor(Math.random() * 5 + 1);
        if (random == 1) {
          this.eat(new Goldfish());
        } else if (random == 2) {
          this.eat(new Wiener());
        } else if (random == 3) {
          this.eat(new Rottweiler());
        } else if (random == 4) {
          this.eat(new Persian());
        } else if (random == 5) {
          this.eat(new Piranha());
        }
      } else if (random == 1) {
        this.poop();
      }
    } else if (this.isSleeping == true) {
      this.sleep();
    }
  }
}


// - Subclasses Cat.
// - Size is set to "Large".
//   - Eats anything besides a Lion.
//   - Is 3x more likely to sleep than anything other action.
