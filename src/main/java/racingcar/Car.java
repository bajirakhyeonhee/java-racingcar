package racingcar;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    protected String Name;
    protected String Distance;
    public Car(String Name) {
        if (Name == null || Name.length() > 5)
            throw new IllegalArgumentException();
        this.Name = Name;
        this.Distance = "";
    }

    void move(){
        int num = Randoms.pickNumberInRange(0,9);
        if(num>4){
            for (int i=0; i<num; i++){
                this.Distance+="-";
            }
        }


    }

}
