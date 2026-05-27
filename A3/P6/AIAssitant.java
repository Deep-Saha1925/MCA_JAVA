public class AIAssitant implements Speaker, Translator {

    @Override
    public void speak(String text) {
        System.out.println(text);
    }

    @Override
    public void translate(String text, String language) {
        System.out.println("Translating '" + text + "' to " + language);
    }

    public static void main(String[] args) {
        AIAssitant ai = new AIAssitant();
        ai.speak("Hello, I am your AI Assistant!");
        ai.translate("Hello, how are you?", "Spanish");
    }
}
