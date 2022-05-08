public class User implements Comparable<User> {
    private String name;
    private int skor;
    private int health;

    // user constructor
    public User(String name) {
        this.name = name;
        this.skor = 0;
        this.health = 3;
    }

    // name getter
    public String getName() {
        return name;
    }

    // health getter
    public int getHealth() {
        return health;
    }

    // skor getter
    public int getSkor() {
        return skor;
    }

    // increment skor
    public void correct() {
        skor++;
    }

    // decrement health
    public void wrong() {
        health--;
    }

    // compares user object based on skor
    @Override
    public int compareTo(User user) {
        if (this.getSkor() > user.getSkor()) {
            return -1;
        } else if (this.getSkor() < user.getSkor()) {
            return 1;
        } else {
            return 0;
        }
    }
}
