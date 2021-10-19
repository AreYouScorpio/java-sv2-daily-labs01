package week01day04;

public class Hello {
    private String name;

    public String GetName() {
        return name;
    }

    public void writeName(String newName) {
        name = newName;
        System.out.println(name);
    }
}
