
public class Loader
{
    public static void main(String[] args)
    {
        String text = "  Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей  ";
        text = text.trim();
        String sumV = text.substring(text.indexOf('5'), (text.indexOf('5') + 4));
        String sumP = text.substring(text.indexOf('7'), text.indexOf('7') + 4);
        String sumM = text.substring(text.lastIndexOf('3'), text.lastIndexOf('3') + 5);
        System.out.println(text);
        int sum = Integer.parseInt(sumV) + Integer.parseInt(sumP) + Integer.parseInt(sumM);
        System.out.println("Total salary: " + sum);
    }
}