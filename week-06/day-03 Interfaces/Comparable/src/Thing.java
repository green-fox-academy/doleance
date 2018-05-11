public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing otherThing) {
    if (this.completed == otherThing.completed) {
      return this.name.compareTo(otherThing.name);
    } else if (this.completed) {
      return -1;
    } else {
      return 1;
    }
  }
}