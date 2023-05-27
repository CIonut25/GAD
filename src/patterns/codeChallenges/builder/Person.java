package patterns.codeChallenges.builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }


        public Person build() {
            return new Person(this);
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setMarried(boolean married) {
            isMarried = married;
            return this;
        }
    }

}
