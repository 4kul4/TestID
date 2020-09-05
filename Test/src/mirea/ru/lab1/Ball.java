package mirea.ru.lab1;

public class Ball {
    private String color;
    private Float size;

    public Ball(String color02, Float size02){

        this.color = color02;
        this.size = size02;
    }


    public void GetSizeOfBall() {
        System.out.print("Ball size is " + size + "\n");


    }
        public void GetColorOfBall(){
            System.out.print("Ball color is " + color + "\n");


    }
}
