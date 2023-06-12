public class Client {
    private String name;

    private boolean hasHaircut;

    public Client(String name) {
        this.name = name;
        this.hasHaircut = false;
    }

    public String getName() {
        return name;
    }

    public boolean isHasHaircut() {
        return hasHaircut;
    }

    public void setHasHaircut(boolean hasHaircut) {
        this.hasHaircut = hasHaircut;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", hasHaircut=" + hasHaircut +
                '}';
    }
}
