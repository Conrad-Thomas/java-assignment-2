package thomcs4.bit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The question class runs unit tests on the "Questions" class
 */
public class QuestionTest {
    private Questions questions = new Questions();

    /**
     * Tests the length of the questions array.
     */
    @Test
    public void testGetQuestionsLength() {
        assertEquals(10, questions.getLength());
    }

    /**
     * Tests the getImage method in the questions class, which returns a drawable.
     */
    @Test
    public void testQuestionImage() {
        int[] images = {R.drawable.christchurch,
                R.drawable.auckland,
                R.drawable.hamilton,
                R.drawable.invercargill,
                R.drawable.rotorua,
                R.drawable.teanau,
                R.drawable.dunedin,
                R.drawable.oamaru,
                R.drawable.whanganui,
                R.drawable.wellington};
        assertEquals(images[1], questions.getImage(1));
    }

    /**
     * Tests setting the images array in the questions class.
     */
    @Test
    public void testSetQuestionImages() {
        int[] images = {R.drawable.christchurch,
                R.drawable.auckland,
                R.drawable.hamilton,
                R.drawable.invercargill,
                R.drawable.rotorua,
                R.drawable.teanau,
                R.drawable.dunedin,
                R.drawable.oamaru,
                R.drawable.whanganui,
                R.drawable.wellington};
        questions.setImages(images);
        assertEquals(images[9], questions.getImage(9));
    }

    /**
     * Tests getting the question text from the questions class.
     */
    @Test
    public void testGetQuestion() {
        assertEquals("1. Which is Christchurch's Nickname?", questions.getQuestion(0));
    }

    /**
     * Tests setting the questions array.
     */
    @Test
    public void testSetQuestions() {
        String[] question = {"10. Which is Whanganui's Nickname? ",
                "2. Which is Auckland's Nickname?",
                "3. Which is Hamilton's Nickname?",
                "4. Which is Invercargill's Nickname?",
                "5. Which is Rotorua's Nickname?",
                "6. Which is Te Anau's Nickname?",
                "7. Which is Dunedin's Nickname?",
                "8. Which is Oamaru's Nickname?",
                "9. Which is Wellington's Nickname?",
                "1. Which is Christchurch's Nickname?"};
        questions.setQuestions(question);
        assertEquals(question[9], questions.getQuestion(9));
    }

    /**
     * Tests getting the first option in the first question,
     * these end up being the options on the buttons.
     */
    @Test
    public void testGetOptions() {
        assertEquals("Emerald City", questions.getOption(0, 1));
    }

    /**
     * Tests setting the options array in the questions class.
     */
    @Test
    public void testSetOptions() {
        String[][] options = {{"The City of Dreams", "Emerald City", "The Garden City", "White City"},
                {"City of Sails", "The City of Lilies", "Motor City", "The Big Apple"},
                {"River City", "The Four Avenues", "The Eternal City", "The Tron"},
                {"City of Water and Light", "City of Sails", "The Painted City", "The Cold City"},
                {"The Big Smoke", "Sulphur City", "Bluff City", "The Volcano"},
                {"Windy City", "City of Parks", "Tiger Town", "Gateway to Fiordland"},
                {"Dunners", "Palmy", "Big Little City", "Celestial City"},
                {"O-Town", "Fort Mac", "Whitestone City", "Orchard City"},
                {"Space City", "Alamo City", "Hill City", "Wellywood"},
                {"The Painted City", "River City", "The Cold City", "City of Parks"}};
        questions.setOptions(options);
        assertEquals("The City of Dreams", questions.getOption(0, 1));
    }

    /**
     * Tests getting the answer for question 1.
     */
    @Test
    public void testGetAnswer() {
        assertEquals("The Garden City", questions.getAnswer(0));
    }

    /**
     * Tests setting all the answers in the Questions class.
     */
    @Test
    public void testSetAnswers() {
        String[] answers = {"City of Sails",
                "The Garden City",
                "The Tron",
                "City of Water and Light",
                "Sulphur City",
                "Gateway to Fiordland",
                "Dunners",
                "Whitestone City",
                "Wellywood",
                "River City"};
        questions.setAnswers(answers);
        assertEquals("City of Sails", questions.getAnswer(0));
    }

    /**
     * Tests getting the answer information for question 1.
     */
    @Test
    public void testGetAnswerDesc() {
        assertEquals("Christchruch is called \"The Garden City\" because of its vast tracts of parklands, rose and water gradens, and verdant surroundings. ... " +
                        "In and around the square are some of the city's exclusive hotels, cinemas, bars, cafes, restaurants, and shops.", questions.getAnswerDesc(0));
    }

    /**
     * Tests setting the answer information array in the Questions class.
     */
    @Test
    public void testSetAnswerDesc() {

        String[] answerDesc = {"PLACEHOLDER is called \"The Garden City\" because of its vast tracts of parklands, rose and water gradens, and verdant surroundings. ... In and around the square are some of the city's exclusive hotels, cinemas, bars, cafes, restaurants, and shops.",
                "New Zealand's largest city – often mistaken as the country's capital – is called the City of Sails because of its numerous yacht marinas and sailboats anchoring offshore.",
                "Hamilton is called \"The Tron\" because all you see are the blurs of red and blue lights as you drive through as fast as possible. ... Hamiltron, City of the Future.",
                "Invercargill is the \"City of Water and Light\". The \"light\" refers to the long summer twilights and the aurora australis (southern lights). The \"water\" reference, humorists suggest, comes from notorious horizontal, driving rain in high wind at the corner of the two main streets, Dee and Tay.",
                "A common nickname for Rotorua is \"Sulphur City\" due to the hydrogen sulphide emissions, which gives the city a smell similar to \"rotten eggs\", as well as \"Rotten-rua\" combining its legitimate name and the rotten smell prevalent.",
                "Te Anau is the 'gateway to the fiords' being the closest town to Milford Sound, being only a scenic two and a half hour drive away.",
                "It is unknown how Dunedin got it's nickname \"Dunners\"",
                "Many of the buildings in Oamaru are built from a special limestone that is quarried nearby. In the late 1800s, Oamaru was flush from a gold rush, so it hired a few fancy architects to make beautiful public buildings. Which were all made from Whitestone or \"Oamaru Stone\".",
                "Wellington got it\'s nickname \"Wellywood\" beacuse it is the centre of the New Zealand film industry. Specifically because of The Lord of the Rings trilogy and King kong.",
                "Redoubts (fortifications) were built to the north-west and along the river, and troops were deployed. Whanganui became a city in 1924, when it was New Zealand's largest urban area after the four main centres. ... The name means big harbour, although another version is 'long wait'; the town is known as the 'River City'."};
        questions.setAnswerDesc(answerDesc);
        assertEquals("PLACEHOLDER is called \"The Garden City\" because of its vast tracts of parklands, rose and water gradens, and verdant surroundings. ... " +
                "In and around the square are some of the city's exclusive hotels, cinemas, bars, cafes, restaurants, and shops.", questions.getAnswerDesc(0));
    }

    /**
     * Tests the toString override in the Questions class which returns
     * a string with how many questions there are.
     */
    @Test
    public void testToString() {
        assertEquals("There are 10 questions in this quiz.", questions.toString());
    }
}