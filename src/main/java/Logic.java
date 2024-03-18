public class Logic {

    Questions questions = new Questions();
    Answer answer = new Answer();
    Util Util = new Util();

    public void logicGame() {

        String[] itemBuild = {"Линза", "Урна", "Блинк", "Аганим", "Глимер"};

        questions.partOneZeroQuestions();
        String choosePart = Util.inputString("");
        if (choosePart.equals("Аппарат")) {

            Util.message("Вы выбрали" + choosePart);
            questions.partOneFirstQuestions();

            int pos = Util.inputInt("Позиция :",1,5);
            if (pos == 4){
                answer.partOneAnswer3();
            }else {
                answer.partOneAnswer4();
            }

        }

    }

}
