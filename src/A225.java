import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Dice> dices = new ArrayList<>(n);

        Dice dice = new Dice();
        dice.setTop(in.nextInt());
        dice.setFaceSide1(in.nextInt());
        dice.setFaceSide2(in.nextInt());
        dices.add(dice);

        for (int i = 1; i < n; i++) {
            Dice dice1 = new Dice();
            dice1.setFaceSide1(in.nextInt());
            dice1.setFaceSide2(in.nextInt());
            dices.add(dice1);
        }


        int prevBottom = dice.getBottom();
        int i=0;
        boolean sol = true;
        for (Dice d : dices){
            if(i==0) {
                i++;
                continue;
            }

            if(prevBottom != d.getTop()) {
                d.replaceTopAndBottom();
                if(prevBottom != d.getTop()){
                    sol = false;
                    break;
                }
            } else {
                d.replaceTopAndBottom();
                if(prevBottom == d.getTop()){
                    sol = false;
                }
            }
            prevBottom = d.getBottom();
            i++;
        }

        if(sol){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}

class Dice {
    int top;
    int bottom;
    int faceSide1;
    int faceSide2;
    int backSide1;
    int backSide2;
    int[] allFaces;

    public Dice(){
        allFaces = new int[7];
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
        this.bottom = Math.abs(this.top - 7);
    }

    public int getBottom() {
        return bottom;
    }



    public int getFaceSide1() {
        return faceSide1;
    }

    public void setFaceSide1(int faceSide1) {
        this.faceSide1 = faceSide1;
        this.backSide1 = Math.abs(this.faceSide1 - 7);
        allFaces[faceSide1] = faceSide1;
        allFaces[backSide1] = backSide1;
    }

    public int getFaceSide2() {
        return faceSide2;
    }

    public void setFaceSide2(int faceSide2) {
        this.faceSide2 = faceSide2;
        this.backSide2 = Math.abs(this.faceSide2 - 7);
        allFaces[faceSide2] = faceSide2;
        allFaces[backSide2] = backSide2;
        calcTopAndBottom();
    }

    public int getBackSide1() {
        return backSide1;
    }


    public int getBackSide2() {
        return backSide2;
    }

    public void replaceTopAndBottom(){
        int swap = this.bottom;
        this.bottom = this.top;
        this.top = swap;
    }

    private void calcTopAndBottom(){
        for (int i=1; i <=6;i++){
            if(allFaces[i] == 0) {
                this.top = i;
                this.bottom = 7 - i;
                break;
            }
        }
    }


}
