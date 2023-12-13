package antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends langBaseListener {
    private final Map <String, Integer> variables;
    public  MyListener() {
        variables = new HashMap<>();
    }
        @Override
        public void exitAssign(langParser.AssignContext ctx)
        {
            String variableName = ctx.ID(0).getText();
            String value = ctx.ID().size() > 1 ? ctx.ID(1).getText():
                    ctx.NUM().getText();
            // let a be b
            if(ctx.ID().size()>1)
                variables.put(variableName, variables.get(value));
            else
                variables.put(variableName, Integer.parseInt(value));

        }

    @Override
    public void exitAdd(langParser.AddContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText():
                ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()):
                Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) + value);
    }

    @Override
    public void exitPrint(langParser.PrintContext ctx) {
        String output = ctx.ID() == null ? ctx.NUM().getText():
                variables.get(ctx.ID().getText()).toString();
        System.out.println(output);
    }

    @Override
    public void exitSub(langParser.SubContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() :
                ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()) :
                Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) - value);
    }

    @Override
    public void exitDiv(langParser.DivContext ctx) {
        String variableName = ctx.ID(0).getText();  // Используем ID(0), чтобы результат сохранился в первой переменной
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(1).getText()) :
                Integer.parseInt(ctx.NUM().getText());

        if (value == 0) {
            System.err.println("Недопустимое деление на 0. Программа завершена с ошибкой.");
            System.exit(1);
        } else {
            variables.put(variableName, variables.get(variableName) / value);
        }
    }


    @Override
    public void exitCompare(langParser.CompareContext ctx) {
        String variableName1 = ctx.ID(0).getText();
        String variableName2 = ctx.ID(1).getText();

        int value1 = ctx.ID().size() > 1 && variables.containsKey(variableName1) ?
                variables.get(variableName1) :
                Integer.parseInt(ctx.NUM(0).getText());

        int value2 = ctx.ID().size() > 1 && variables.containsKey(variableName2) ?
                variables.get(variableName2) :
                Integer.parseInt(ctx.NUM(1).getText());

        boolean result = value1 == value2;

        String resultVariableName = ctx.ID(2).getText();
        variables.put(resultVariableName, result ? 1 : 0);
    }



    @Override
    public void exitMod(langParser.ModContext ctx) {
        String variableName = ctx.ID(0).getText();  // Используем ID(0), чтобы результат сохранился в первой переменной
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(1).getText()) :
                Integer.parseInt(ctx.NUM().getText());

        if (value == 0) {
            System.err.println("Недопустимое деление на 0. Программа завершена с ошибкой.");
            System.exit(1);
        } else {
            variables.put(variableName, variables.get(variableName) % value);
        }
    }



    public static void main(String[] args){
        try {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("C:\\Users\\shapo\\IdeaProjects\\Compilers\\src\\main\\java\\antlr\\test.lang");
            langLexer lexer = new langLexer(input);
            langParser parser = new langParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.program();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
}

