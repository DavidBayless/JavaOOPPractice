abstract class Entity {
  enum Size {Large, Small}
  boolean isDead;
  boolean isSleeping;
  double weight;

  public Entity() {
    this.isDead = false;
    this.isSleeping = false;
    this.weight = 10;
  }

  void poop() {
    this.weight = Math.ceil(this.weight / 10);
  }

  void eat(Entity other) {
    this.weight += other.weight / 10;
    other.die();
  }

  void eat() {
    this.weight += this.weight * 1.1;
  }
  
  void sleep() {
    if (this.isSleeping == true) {
      if (Math.floor(Math.random() * 2 + 1) == 2) {
        this.isSleeping = false;
        System.out.println("Woke up");
      }
    } else {
      this.isSleeping = true;
    }
  }
  void act() {
    int random = (int) Math.floor(Math.random() * 3 + 1);
    if (random == 3) {
      this.sleep();
    } else if (random == 2) {
      this.eat();
    } else if (random == 1) {
      this.poop();
    }
  }

  void die() {
    this.isDead = true;
  }
}

// - Is an abstract class
// - Has a field named size of type String
//   - String "large" or "small" as possible values.
//   - Bonus: enum for size field.
// - Has a field named isDead of type boolean.
// - Has a field named isSleeping of type boolean.
// - Has a field named weight of type int.
// - Has a method eat().
//   - Has one parameter of type Entity
//   - Increases weight by 1/10th weight of Eaten entity.
//   - Eaten entity dies.
// - Has a method sleep.
//   - Sets isSleeping to true;
// - Has a method poop.
//   - Decreases weight by 1/10th.
//   - If weight is zero Entity dies.
// - Has a method act.
//   - Does nothing if isDead.
//   - Does nothing if isSleeping.
//   - If isSleeping it has of 50% chance of setting isSleeping to true.
//   - Randomly will either eat(), sleep() or poop();
// - Has a method die.
//   - set isDead to true.
