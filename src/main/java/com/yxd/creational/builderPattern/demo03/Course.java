package com.yxd.creational.builderPattern.demo03;

public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }

    public static class Builder {
        private Course course = new Course();

        public Builder addName(String name) {
            course.setName(name);
            return this;
        }

        public Builder addPpt(String ppt) {
            course.setPpt(ppt);
            return this;
        }

        public Builder addVideo(String video) {
            course.setVideo(video);
            return this;
        }

        public Builder addNote(String note) {
            course.setNote(note);
            return this;
        }

        public Builder addHomework(String homework) {
            course.setHomework(homework);
            return this;
        }

        Course builder() {
            return course;
        }
    }
}
