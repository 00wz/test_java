package lesson1.MathParser;

public class MathParser {

    static public double CalculateExpression(String expression){
        return CalculateTerm(expression);
    }
    static private double CalculateTerm(String term){
        if(term.length()<=0)
            throw new Error("ошибка. пропущено число");
        return CalculateFirstPriority(term);
    }

    static private double CalculateFirstPriority(String term){
        for(int i=term.length()-1;i>=0;i--)
        {
            if(term.charAt(i)==')')
            {
                i=GetIndexOfOpeningBracket(i,term);
                continue;
            }
            if(term.charAt(i)=='+')
                return Sum(term.substring(0, i),term.substring(i+1));
            if(term.charAt(i)=='-')
                return Difference(term.substring(0, i),term.substring(i+1));
            if(term.charAt(i)=='(')
            {
                throw new Error("ошибка синтаксиса. не хватает скобок");
            }
        }
        return CalculateSecondPriority(term);
    }
    static private double CalculateSecondPriority(String term){
        for(int i=term.length()-1;i>=0;i--)
        {
            if(term.charAt(i)==')')
            {
                i=GetIndexOfOpeningBracket(i,term);
                continue;
            }
            if(term.charAt(i)=='*')
                return Cross(term.substring(0, i),term.substring(i+1));
            if(term.charAt(i)=='/')
                return Quotient(term.substring(0, i),term.substring(i+1));
        }
        return CalculateThirdPriority(term);
    }
    static private double CalculateThirdPriority(String term){
        int last=term.length()-1;
            if(term.charAt(0)=='('&&term.charAt(last)==')')
                return CalculateTerm(term.substring(1, last));
        Double number=ParseIntOrNull(term);
        if (number==null)
            throw new Error("не удалось прочитать выражение: \""+term+"\"");
        return number;

    }
    static private Double ParseIntOrNull(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    static private double Sum(String term1,String term2){
        return CalculateTerm(term1)+CalculateTerm(term2);
    }
    static private double Difference(String term1,String term2){
        if(term1.length()<=0)
            return (-CalculateTerm(term2));
        return CalculateTerm(term1)-CalculateTerm(term2);
    }
    static private double Cross(String term1,String term2){
        return CalculateTerm(term1)*CalculateTerm(term2);
    }
    static private double Quotient(String term1,String term2){
        return CalculateTerm(term1)/CalculateTerm(term2);
    }
    static private int GetIndexOfOpeningBracket(int closingBracketPosition,String term){
        int vacantBracketsStack=1;
        for(int i=closingBracketPosition-1;i>=0;i--)
        {
            if(term.charAt(i)==')')
            {
                vacantBracketsStack++;
                continue;
            }
            if(term.charAt(i)=='(')
            {
                vacantBracketsStack--;
                if(vacantBracketsStack<=0)
                    return i;
            }

        }
        throw new Error("ошибка синтаксиса. не хватает скобок: \""+term+"\"");
    }
}