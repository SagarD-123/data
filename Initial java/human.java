public class human {
    String name;
    int age;


    human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        
        human h1 = new human("Sagar", 21);
        human h2 = new human("Vishal",23);

        System.out.println(h1.getName());
        System.out.println(h1.getAge());
        System.out.println(h2.getName());
        System.out.println(h2.getAge());
    }
}
