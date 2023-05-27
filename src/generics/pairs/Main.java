package generics.pairs;

public class Main {
    public static void main(String[] args) throws NoMatchSizeException, NoMatchColorException {
        Running runningShoe1 = new Running("RED",41);
        Running runningShoe2 = new Running("RED", 41);

        Pair<Running> pairOk = new Pair<>(runningShoe1, runningShoe2);
        System.out.println(pairOk);

        Running runningShoe3 = new Running("RED", 41);
        Boot bootShoe = new Boot("BLACK", 45);
        //Pair<Running> pairKO = new Pair<>(runningShoe3,bootShoe);

        Running runningShoe5 = new Running("RED", 41);
        Running runningShoe4= new Running("BLACK", 45);
        Pair<Running> pairKO2 = new Pair<>(runningShoe5,runningShoe4);
        System.out.println(pairKO2);


    }
}
