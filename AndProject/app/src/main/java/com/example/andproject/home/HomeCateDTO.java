package com.example.andproject.home;

public class HomeCateDTO {
        private int imgHome, imgPlay;
        private String homeSong, homeSinger;

        public HomeCateDTO(int imgHome, int imgPlay, String homeSong, String homeSinger) {
                this.imgHome = imgHome;
                this.imgPlay = imgPlay;
                this.homeSong = homeSong;
                this.homeSinger = homeSinger;
        }

        public int getImgHome() {
                return imgHome;
        }

        public void setImgHome(int imgHome) {
                this.imgHome = imgHome;
        }

        public int getImgPlay() {
                return imgPlay;
        }

        public void setImgPlay(int imgPlay) {
                this.imgPlay = imgPlay;
        }

        public String getHomeSong() {
                return homeSong;
        }

        public void setHomeSong(String homeSong) {
                this.homeSong = homeSong;
        }

        public String getHomeSinger() {
                return homeSinger;
        }

        public void setHomeSinger(String homeSinger) {
                this.homeSinger = homeSinger;
        }
}
