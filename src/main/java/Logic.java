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
                System.exit(1);
            }
            questions.partOneSecondQuestions();
            String part1 = Util.inputString("");


            if (part1.equals(itemBuild[0])) {
                answer.partOneAnswer5();
            } else if (part1.equals(itemBuild[1])) {
                answer.partOneAnswer6();
            } else if (part1.equals(itemBuild[2])) {
                answer.partOneAnswer7();
            } else if (part1.equals(itemBuild[3])) {
                answer.partOneAnswer8();
            }else {
                answer.partOneAnswer9();
            }

            questions.partOneThirdQuestions();
            String part2 = Util.inputString("");

            if (part2.equals("A")) {
                answer.partOneAnswer11();
            } else if (part2.equals("B")) {
                answer.partOneAnswer12();
            } else if (part2.equals("C")) {
                answer.partOneAnswer13();
            }else {
                Util.message("Анлак");
            }

            questions.partOneFourthQuestions();
            String part3 = Util.inputString("");

            if (part3.equals("A")) {
                answer.partOneAnswer14();
            } else if (part3.equals("B")) {
                answer.partOneAnswer15();
            }
        }

    }

}
