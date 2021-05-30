package Market;

import java.util.Date;

public class Tablet  {
    private String mark;
    private int screen_diagonal;
    private String color;
    private static Owner owner;

    public Tablet() {
    }


    public Tablet (String mark, int screen_diagonal, String color) {
        this.mark = mark;
        this.screen_diagonal = screen_diagonal;
        this.color = color;
        setOwner(new Owner("Somebody"),"1234");
    } //Todo конструктор
    public Tablet (String mark, int screen_diagonal,String color,String nameOwner,String password ) {
        this.mark = mark;
        this.screen_diagonal = screen_diagonal;
        this.color = color;
        setOwner(new Owner(nameOwner),password);
    } //Todo конструктор в котором можно указать владельца планшета если введён верный пароль


    public static Owner getOwner() {
        return owner;
    }
    public static void setOwner(Owner owner,String password) {
        if (password !="1234") {
            Tablet.owner = owner;
        } else {
            System.out.println("Пароль не верный.");
        }// принцип инкапсуляции
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getScreen_diagonal() {
        return screen_diagonal;
    }

    public void setScreen_diagonal(int screen_diagonal) {
        this.screen_diagonal = screen_diagonal;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "mark='" + mark + '\'' +
                ", screen_diagonal=" + screen_diagonal +
                ", color='" + color + '\'' +
                '}';
    }//Todo выводит значения построчно
}

