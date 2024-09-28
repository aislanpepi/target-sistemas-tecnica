package distributor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class DailyBilling {
    public static double[] createDailyBilling() {
        JSONParser parser = new JSONParser();
        JSONArray data;
        try {
            Object dados = parser.parse(new FileReader("distributor/dados.json"));
            data = (JSONArray) dados;
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        double[] dailyBilling = new double[30];
        int i = 0;
        for (Object element : data) {
            JSONObject jsonObject = (JSONObject) element;
            dailyBilling[i] = (double) jsonObject.get("valor");
            i++;
        }
        return dailyBilling;
    }

    public static double minDailyBilling(double[] dailyBilling){
        double min = dailyBilling[0];
        for (double value : dailyBilling){
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static double maxDailyBilling(double[] dailyBilling){
        double max = dailyBilling[0];
        for (double value : dailyBilling){
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    public static int countAboveMonthAverage(double[] dailyBilling){
        double sum = 0,average;
        for(double value : dailyBilling){
            sum += value;
        }
        average = sum / dailyBilling.length;
        int count = 0;
        for(double value : dailyBilling){
            if(value > average) count++;
        }
        return count;
    }

    public static void main(String[] args){
        double[] dailyBilling = createDailyBilling();
        System.out.println("Menor valor de faturamento no mes R$" + minDailyBilling(dailyBilling));
        System.out.println("Maior valor de faturamento no mes R$" + maxDailyBilling(dailyBilling));
        System.out.println("Dias acima da media do mes " + countAboveMonthAverage(dailyBilling));
    }
}
