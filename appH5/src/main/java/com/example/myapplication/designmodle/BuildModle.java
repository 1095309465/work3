package com.example.myapplication.designmodle;

/**
 * Build模式
 */
public class BuildModle {

    private String name;
    private String like;
    private int age;

    private BuildModle(Build build){
        this.name=build.name;
        this.like=build.like;
        this.age=build.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public static class Build {


        private String name;
        private String like;
        private int age;


        public Build setName(String name) {
            this.name=name;
            return this;
        }

        public Build setLike(String like) {
            this.like=like;
            return this;
        }

        public Build setAge(int age) {
            this.age=age;
            return this;
        }

        public BuildModle create() {

            return  new BuildModle(this);
        }


    }
}
