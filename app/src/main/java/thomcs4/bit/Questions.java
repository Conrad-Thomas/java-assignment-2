package thomcs4.bit;

import android.content.Context;
import android.content.ContextWrapper;

public class Questions  {

    private String[] questions = {"1. Which is Christchurch's Nickname?",
                                  "2. Which is Auckland's Nickname?",
                                  "3. Which is Hamilton's Nickname?",
                                  "4. Which is Invercargill's Nickname?",
                                  "5. Which is Rotorua's Nickname?",
                                  "6. Which is Te Anau's Nickname?",
                                  "7. Which is Dunedin's Nickname?",
                                  "8. Which is Oamaru's Nickname?",
                                  "9. Which is Wellington's Nickname?",
                                  "10. Which is Whanganui's Nickname?"};

    private int[] images = {R.drawable.christchurch,
                            R.drawable.auckland,
                            R.drawable.hamilton,
                            R.drawable.invercargill,
                            R.drawable.rotorua,
                            R.drawable.teanau,
                            R.drawable.dunedin,
                            R.drawable.oamaru,
                            R.drawable.wellington,
                            R.drawable.whanganui};

    private String[][] options = {{"Emerald City", "The City of Dreams", "The Garden City", "White City"},
                                 {"City of Sails", "The City of Lilies", "Motor City", "The Big Apple"},
                                 {"River City", "The Four Avenues", "The Eternal City", "The Tron"},
                                 {"City of Water and Light", "City of Sails", "The Painted City", "The Cold City"},
                                 {"The Big Smoke", "Sulphur City", "Bluff City", "The Volcano"},
                                 {"Windy City", "City of Parks", "Tiger Town", "Gateway to Fiordland"},
                                 {"Dunners", "Palmy", "Big Little City", "Celestial City"},
                                 {"O-Town", "Fort Mac", "Whitestone City", "Orchard City"},
                                 {"Space City", "Alamo City", "Hill City", "Wellywood"},
                                 {"The Painted City", "River City", "The Cold City", "City of Parks"}};

    private String[] answers = {"The Garden City",
                                "City of Sails",
                                "The Tron",
                                "City of Water and Light",
                                "Sulphur City",
                                "Gateway to Fiordland",
                                "Dunners",
                                "Whitestone City",
                                "Wellywood",
                                "River City"};

    private String[] answerDesc = {"Christchruch is called \"The Garden City\" because of its vast tracts of parklands, rose and water gradens, and verdant surroundings. ... In and around the square are some of the city's exclusive hotels, cinemas, bars, cafes, restaurants, and shops.",
                                   "New Zealand's largest city – often mistaken as the country's capital – is called the City of Sails because of its numerous yacht marinas and sailboats anchoring offshore.",
                                   "Hamilton is called \"The Tron\" because all you see are the blurs of red and blue lights as you drive through as fast as possible. ... Hamiltron, City of the Future.",
                                   "Invercargill is the \"City of Water and Light\". The \"light\" refers to the long summer twilights and the aurora australis (southern lights). The \"water\" reference, humorists suggest, comes from notorious horizontal, driving rain in high wind at the corner of the two main streets, Dee and Tay.",
                                   "A common nickname for Rotorua is \"Sulphur City\" due to the hydrogen sulphide emissions, which gives the city a smell similar to \"rotten eggs\", as well as \"Rotten-rua\" combining its legitimate name and the rotten smell prevalent.",
                                   "Te Anau is the 'gateway to the fiords' being the closest town to Milford Sound, being only a scenic two and a half hour drive away.",
                                   "It is unknown how Dunedin got it's nickname \"Dunners\"",
                                   "Many of the buildings in Oamaru are built from a special limestone that is quarried nearby. In the late 1800s, Oamaru was flush from a gold rush, so it hired a few fancy architects to make beautiful public buildings. Which were all made from Whitestone or \"Oamaru Stone\".",
                                   "Wellington got it\'s nickname \"Wellywood\" beacuse it is the centre of the New Zealand film industry. Specifically because of The Lord of the Rings trilogy and King kong.",
                                   "Redoubts (fortifications) were built to the north-west and along the river, and troops were deployed. Whanganui became a city in 1924, when it was New Zealand's largest urban area after the four main centres. ... The name means big harbour, although another version is 'long wait'; the town is known as the 'River City'."};

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
