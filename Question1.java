class Person {
    String name;
    int age = 0;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printData() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Question1 {
    public static void main(String[] args) {
        Person obj = new Person("Atharva", 21);
        obj.printData();
    }
}