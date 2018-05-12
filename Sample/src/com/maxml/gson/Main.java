package com.maxml.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.maxml.gson.forJson.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Let's initialize our sample array of cars
        Car cars[] = new Car[]{new Lexus("Lexus Is", 260, "Sedan", 3),
                new Acura("Acura Mdx", 193, "Suv")};

        //Create our gson instance
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Car.class, new InterfaceAdapter<Car>());
        Gson gson = builder.create();

        ForJsonClass class1 = new ForJsonClass(null, "", true);
        ForJsonClass class2 = new ForJsonClass(null, "RGER", true);
        ForJsonClass class3 = new ForJsonClass(new HashMap<>(), "RGER", true);

        HashMap<String, Car> buff = new HashMap<>();
        buff.put("1", cars[0]);
        buff.put("2", cars[1]);
        ForJsonClass class4 = new ForJsonClass(buff, "RGER", true);

        fromToJson(gson, class1);
        fromToJson(gson, class2);
        fromToJson(gson, class3);
        fromToJson(gson, class4);
    }

    private static void fromToJson(Gson gson, ForJsonClass class1) {
        //Let's serialize our array
        String carsJsonFormat = gson.toJson(class1, ForJsonClass.class);
        //Let's Print our serialized arrya
        System.out.println("Cars in Json Format: " + carsJsonFormat);

        ForJsonClass carJsonArray = gson.fromJson(carsJsonFormat, ForJsonClass.class);
        System.out.println(carJsonArray);
    }

    private static void exGson() {
        String str = "{\n" +
                "   \"DiagnosticResult\": {\n" +
                "      \"captivePortalTest\": {\n" +
                "         \"result\": \"OPEN\",\n" +
                "         \"time\": \"2018-01-26T11:47:01+0200\",\n" +
                "         \"url\": \"http://connectivitycheck.gstatic.com/generate_204\"\n" +
                "      },\n" +
                "      \"illegalCharacters\"\": {\n" +
                "         \"octal\": \" 2 \",\n" +
                "         \"t_symbol\": \"\t\",\n" +
                "         \"n_symbol\": \"\n" +
                "\",\n" +
                "         \"quote\": \" \" \",\n" +
                "         \"double_backslash\": \" \\ \",\n" +
                "         \"double_slash\": \" // \",\n" +
                "         \"single_quotes\": \" ' \",\n" +
                "         \"unicode\": \" 2 \",\n" +
                "         \"r_symbol\": \"\n" +
                "\"\n" +
                "      }\n" +
                "   }\n" +
                "}";
        JsonObject obj = new Gson().fromJson(str, JsonObject.class);
        System.out.println(obj.toString());
    }
}
