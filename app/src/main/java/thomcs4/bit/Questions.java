package thomcs4.bit;

public class Questions {
//-------------------------------------------------------------------------------------------------
    private String[] questions = {"1. Which is Christchurch's Nickname?", "2. What is Auckland's Nickname?", "3. What is Hamilton's Nickname?", "4. What is Invercargill's Nickname?", ""};
    private int[] images = {R.drawable.christchurch, R.drawable.auckland, R.drawable.hamilton, R.drawable.invercargill};
    private String[][] options = {{"Emerald City", "The City of Dreams", "The Garden City", "White City"},
                                 {"City of Sails", "The City of Lilies", "Motor City", "The Big Apple"},
                                 {"River City", "The Four Avenues", "The Eternal City", "The Tron"},
                                 {"City of Water and Light", "City of Sails", "The Painted City", "The Cold City"}};
    private String[] answers = {"The Garden City", "City of Sails", "The Tron", "City of Water and Light"};

    private String[] answerDesc = {"Christchruch is called \"The Garden City\" because of its vast tracts of parklands, rose and water gradens, and verdant surroundings. ... In and around the square are some of the city's exclusive hotels, cinemas, bars, cafes, restaurants, and shops.",
                                   "New Zealand's largest city – often mistaken as the country's capital – is called the City of Sails because of its numerous yacht marinas and sailboats anchoring offshore.",
                                   "Hamilton is called \"The Tron\" because all you see are the blurs of red and blue lights as you drive through as fast as possible. ... Hamiltron, City of the Future.",
                                   "Invercargill is the \"City of Water and Light\". The \"light\" refers to the long summer twilights and the aurora australis (southern lights). The \"water\" reference, humorists suggest, comes from notorious horizontal, driving rain in high wind at the corner of the two main streets, Dee and Tay."};

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

    @Override
    public String toString() {
        return "";
    }

}
