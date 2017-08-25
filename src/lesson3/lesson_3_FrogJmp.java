package lesson3;

/**
 * Created by masinogns on 2017. 5. 25..
 *
 */
public class lesson_3_FrogJmp {

    public int solution(int X, int Y, int D){
        int result = 0;

        result = (int)Math.ceil((double)(Y-X)/D);

        return result;
    }

    public static void main(String[] args) {

        lesson_3_FrogJmp controller = new lesson_3_FrogJmp();
        controller.solution(10, 85, 30);

    }
}
