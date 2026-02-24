public class Student {

    private int studentNumber;
    private String firstName;
    private String middleInitial;
    private int age;
    private String gender;
    private String email;
    private String course;
    private int yearLevel;
    private String section;
    private String school;

    public Student(int studentNumber, String firstName, String middleInitial,
                   int age, String gender, String email,
                   String course, int yearLevel, String section, String school) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.course = course;
        this.yearLevel = yearLevel;
        this.section = section;
        this.school = school;
    }

    
    public int getStudentNumber() { return studentNumber; }
    public String getFirstName() { return firstName; }
    public String getMiddleInitial() { return middleInitial; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
    public int getYearLevel() { return yearLevel; }
    public String getSection() { return section; }
    public String getSchool() { return school; }


    public static class Builder {
        private int studentNumber;
        private String firstName;
        private String middleInitial;
        private int age;
        private String gender;
        private String email;
        private String course;
        private int yearLevel;
        private String section;
        private String school;

        public Builder setStudentNumber(int studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleInitial(String middleInitial) {
            this.middleInitial = middleInitial;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setYearLevel(int yearLevel) {
            this.yearLevel = yearLevel;
            return this;
        }
        public Builder setSection(String section) {
            this.section = section;
            return this;
        }
        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Student build() {
            return new Student(studentNumber, firstName, middleInitial, age, gender, email, course, yearLevel, section, school);
        }
    }
}