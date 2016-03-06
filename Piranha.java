public class Piranha extends Fish {

  public Piranha() {
    super();
    setSize(Size.Large);
    this.weight = 12;
  }

  void act() {
    if (this.isDead != true && this.isSleeping != true) {
      int random = (int) Math.floor(Math.random() * 3 + 1);
      if (random == 3) {
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
          this.eat(new Lion());
        }
      } else if (random == 1) {
        this.poop();
      }
    } else if (this.isSleeping == true) {
      this.sleep();
    }
  }

  void eat(Entity other) {
    System.out.println("OMNOMOMMONOMOOMONOM");
    other.die();
    this.weight += (int) Math.ceil(other.weight / 10);
  }
}


// - Subclasses Fish.
// - Size is set to "Large".
// - Eats everything besides piranhas.
// - If an entity is passed into act it will eat it unless it is another Piranha.
