import javax.script.*;
public class EmbeddedJavaScript {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("nashorn");
        try {
            engine.eval(
                    "var i=0;"
                            + "i++;"
                            + "var String = Java.type(\"java.lang.String\");"
                            + "var str = new String(\"Java\");"
                            + "print(str);"
                            + "print(i);"
            );
        } catch (ScriptException se) { System.out.println("Script Exception"); }
    }
}