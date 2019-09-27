package com.example.day0927.bean;

    /***
     * 二级列表的bean类
     */
    public class MyChildBean {
        private String song_name;

        public MyChildBean(String song_name) {
            this.song_name = song_name;
        }

        public String getSong_name() {
            return song_name;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }
    }
