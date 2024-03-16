public class Course {
    private String title;
    private String description;
    private String lecturer;
    private String level;
    private int price;

    // Constructor
    public Course(String title, String description, String lecturer, String level, int price) {
        this.title = title;
        this.description = description;
        this.lecturer = lecturer;
        this.level = level;
        this.price = price;
    }

    // Setters & Getters
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    public String getLevel() {
        return level;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // Method to display course information
    public void getInfo() {
        System.out.println("===\nCOURSE INFO");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Lecturer: " + lecturer);
        System.out.println("Level: " + level);
        System.out.println("Price: " + price);
        System.out.println("===");
    }

    // Main method
    public static void main(String[] args) {
        Course dataScienceCourse = new Course("Data Science", "Learn about data science", "John Doe", "All Level", 150000);
        Course algorithmCourse = new Course("Algorithm", "Master the basics of algorithm", "Enki", "Beginner", 75000);
        Course dockerCourse = new Course("Docker", "Learn about Docker from zero to master", "Ray Krieger", "All Level", 125000);

        dataScienceCourse.getInfo();
        algorithmCourse.getInfo();
        dockerCourse.getInfo();
    }
}
