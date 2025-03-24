package racingcar;

import java.util.ArrayList;

public class racing {
    public void racing(ArrayList<Car> cars, Integer count) {
        for (int i = 0; i < count; i++) {
            for (Car c : cars) {
                c.move();
                System.out.println(c.Name + " : " + c.Distance);
            }
        }

        int max = 0;
        for (Car c : cars) {
            if (c.Distance.length() > max) {
                max = c.Distance.length();
            }
        }
        ArrayList<String> names = new ArrayList<>();
        for (Car c : cars) {
            if (c.Distance.length() == max) {
                names.add(c.Name);
            }
        }

        System.out.println("최종 우승자:" + String.join(",", names));

    }
}

