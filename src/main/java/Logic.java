public class Logic {

    Questions questions = new Questions();
    Answer answer = new Answer();
    Util Util = new Util();

    public void logicGame() {

        String[] itemBuild = {"Линза", "Урна", "Блинк", "Аганим", "Глимер"};

        questions.partOneZeroQuestions();
        String selectPart = Util.inputString("");
        if (selectPart.equals("Аппарат")) {

            Util.message("Вы выбрали" + selectPart);
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
