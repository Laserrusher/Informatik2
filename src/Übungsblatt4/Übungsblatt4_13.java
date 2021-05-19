package Übungsblatt4;

import java.util.ArrayList;
import java.util.Comparator;

public class Übungsblatt4_13 {

    public static void main(String[] args) {
        ArrayList<GeometricObject> list = new ArrayList<GeometricObject>();
        for (int i = 0; i < 10; i++){
            int a = (int) (Math.random() * 20) + 1;
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            list.add(new Circle(a, new Point(x,y)));
        }

        for (int i = 0; i < 10; i++){
            int l = (int) (Math.random() * 20) + 1;
            int b = (int) (Math.random() * 20) + 1;
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            list.add(new Rectangle(l, b, new Point(x,y)));
        }
        int max = 0;
        list.stream()
                .map(GeometricObject::getArea)
                .max(co)

    }
}
