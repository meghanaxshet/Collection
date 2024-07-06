//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        KeyAnalyzer keyAnalyzer = new KeyAnalyzerImpl();

        keyAnalyzer.storeKey("Table");
        keyAnalyzer.storeKey("Eraser");
        keyAnalyzer.storeKey("Eraser");
        keyAnalyzer.storeKey("Scale");
        keyAnalyzer.storeKey("Book");
        keyAnalyzer.storeKey("Book");
        keyAnalyzer.storeKey("Book");
        keyAnalyzer.storeKey("Pen");
        keyAnalyzer.storeKey("Pencil");
        keyAnalyzer.storeKey("Ink Pen");


        System.out.println(keyAnalyzer.keyData());
    }
}