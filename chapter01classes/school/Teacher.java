package chapter01classes.school;

// Class 2: Teacher class
class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Getters and setters...

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}
