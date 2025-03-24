package racingcar;
import javax.lang.model.element.Name;
import java.util.Scanner;
import java.util.ArrayList;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("경주할 자동차 이름을 입력하세요.");
        String name = readLine();
        String[] Name = name.split(",");
        for(String n: Name){
            Car car= new Car(n);
            cars.add(car);
        }
        System.out.println("시도할 회수는 몇회인가요?");
        int Count = Integer.parseInt(readLine());

        racing race = new racing();
        race.racing(cars, Count);
    }
}
