package dgoon.mobile.appmusic;

public class Music {
    String name, nameSingel, img, time;

    Music() {

    }

    public Music(String name, String nameSingel, String img, String time) {
        this.name = name;
        this.nameSingel = nameSingel;
        this.img = img;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSingel() {
        return nameSingel;
    }

    public void setNameSingel(String nameSingel) {
        this.nameSingel = nameSingel;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
