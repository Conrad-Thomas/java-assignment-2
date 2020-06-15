package thomcs4.bit;

public class Questions {
//-------------------------------------------------------------------------------------------------
    private String[] questions = {"1. Which is Christchurch's Nickname?", "2. What is Auckland's Nickname?", "3. What is Hamilton's Nickname?"};
    private int[] images = {R.drawable.christchurch, R.drawable.auckland, R.drawable.hamilton};
    private String[][] options = {{"Emerald City", "The City of Dreams", "The Garden City", "White City"},
                                 {"City of Sails", "The City of Lilies", "Motor City", "The Big Apple"},
                                 {"River City", "The Four Avenues", "The Eternal City", "The Tron"}};
    private String[] answers = {"The Garden City", "City of Sails", "The Tron"};

    private String[] answerDesc = {"Christchruch is called \"The Garden City\" because of its vast tracts of parklands, rose and water gradens, and verdant surroundings. ... \nIn and around the square are some of the city's exclusive hotels, cinemas, bars, cafes, restaurants, and shops."};

//-------------------------------------------------------------------------------------------------

    public int getLength() {
        return questions.length;
    }

    public int getImage(int q) {
        return images[q];
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public String getQuestion(int q) {
        return questions[q];
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String getOption(int q, int num) {
        return options[q][num-1];
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }

    public String getAnswer(int q) {
        return answers[q];
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getAnswerDesc(int q) {
        return answerDesc[q];
    }

    public void setAnswerDesc(String[] answerDesc) {
        this.answerDesc = answerDesc;
    }

}
