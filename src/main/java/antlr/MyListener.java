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


    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    @Override
    public void exitCompare(langParser.CompareContext ctx) {
        String variableName1 = String.valueOf(ctx.children.get(1));
        String variableName2 = String.valueOf(ctx.children.get(3));

        int cnt = 0;
        int value1 = 0;
        if (isNumeric(variableName1)){
            value1 = Integer.parseInt(variableName1);
        }
        else{
            value1 = variables.get(ctx.ID(cnt).getText());
            cnt += 1;
        }

        int value2 = 0;
        if (isNumeric(variableName2)){
            value2 = Integer.parseInt(variableName2);
        }
        else{
            value2 = variables.get(ctx.ID(cnt).getText());
            cnt += 1;
        }

        String resultVariableName = ctx.ID(cnt).getText();

        boolean result = value1 == value2;

        variables.put(resultVariableName, result ? 1 : 0);
    }


    @Override
    public void exitExrpession(langParser.ExrpessionContext ctx) {
        String valueVariable1 = String.valueOf(ctx.children.get(0));
        String valueVariable2 = String.valueOf(ctx.children.get(2));

        int cnt = 0;
        int value1 = 0;
        if (isNumeric(valueVariable1)){
            value1 = Integer.parseInt(valueVariable1);
        }
        else{
            value1 = variables.get(ctx.ID(cnt).getText());
            cnt += 1;
        }


        int value2 = 0;
        if (isNumeric(valueVariable2)){
            value2 = Integer.parseInt(valueVariable2);
        }
        else{
            value2 = variables.get(ctx.ID(cnt).getText());
            cnt += 1;
        }

        String resultVariable = ctx.ID(cnt).getText();

        String operator = (ctx.OVER() != null && ctx.OVER().getText().equals(">")) ? ">" : "<"; // Получить текст оператора (может быть '>' или '<')

        boolean result;

        switch (operator) {
            case ">":
                result = value1 > value2;
                break;
            case "<":
                result = value1 < value2;
                break;
            default:
                System.err.println("Unsupported operator: " + operator);
                return;
        }

        variables.put(resultVariable, result ? 1 : 0);

    }


    @Override
    public void exitPow(langParser.PowContext ctx){
        String valueVariable1 = String.valueOf(ctx.children.get(0));
        int value1 = variables.get(ctx.ID(0).getText());

        String valueVariable2 = String.valueOf(ctx.children.get(2));
        int value2 = 0;
        if (isNumeric(valueVariable2)){
            value2 = Integer.parseInt(valueVariable2);
        }
        else {
            value2 = variables.get(ctx.ID(1).getText());
        }

        value1 = (int)Math.pow(value1, value2);
        variables.put(valueVariable1, value1);
    }

    @Override
    public void exitMult(langParser.MultContext ctx){
        String valueVariable1 = String.valueOf(ctx.children.get(0));
        String valueVariable2 = String.valueOf(ctx.children.get(2));

        int cnt = 0;
        int value1 = 0;
        if (isNumeric(valueVariable1)){
            value1 = Integer.parseInt(valueVariable1);
        }
        else{
            value1 = variables.get(ctx.ID(cnt).getText());
            cnt += 1;
        }


        int value2 = 0;
        if (isNumeric(valueVariable2)){
            value2 = Integer.parseInt(valueVariable2);
        }
        else{
            value2 = variables.get(ctx.ID(cnt).getText());
            cnt += 1;
        }
        String resultVariable = ctx.ID(cnt).getText();

        int result = value1 * value2;
        variables.put(resultVariable, result);
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

