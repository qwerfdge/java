package ua.brekher.hw13;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try (FileReader reader = new FileReader("box.json")) {
            Box box = gson.fromJson(reader, Box.class);
            try {
                Date date = dateFormat.parse(box.getDeliveryDate());
                box.setDeliveryDate(dateFormat.format(date));
            } catch (ParseException e) {
                System.out.println("e = " + e.getMessage());
            }
            System.out.println("From: " + box.getFrom());
            System.out.println("Material: " + box.getMaterial());
            System.out.println("Color: " + box.getColor());
            System.out.println("Max Lifting Capacity: " + box.getMaxLiftingCapacity().getValue() +
                    " " + box.getMaxLiftingCapacity().getUnit());
            System.out.println("Cargo Name: " + box.getCargo().getName());
            System.out.println("Cargo Class: " + box.getCargo().getClazz());
            System.out.println("Delivery Date: " + box.getDeliveryDate());

        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }
    }
}

