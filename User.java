public class User implements Comparable<User> {
    private String name;
    private int skor;
    private int health;

    public User(String name) {
        this.name = name;
        this.skor = 0;
        this.health = 3;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSkor() {
        return skor;
    }

    public void correct() {
        skor++;
    }

    public void wrong() {
        health--;
    }

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
