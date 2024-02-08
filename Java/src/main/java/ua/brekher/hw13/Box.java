package main.java.ua.brekher.hw13;

import org.json.JSONObject;
import org.json.JSONException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Box {
    private String fromCountry;
    private String material;
    private String color;
    private int maxLiftingCapacity;
    private String cargoName;
    private String cargoClass;
    private LocalDateTime deliveryDate;

    public Box(String fromCountry, String material, String color, int maxLiftingCapacity, String cargoName, String cargoClass, LocalDateTime deliveryDate) {
        this.fromCountry = fromCountry;
        this.material = material;
        this.color = color;
        this.maxLiftingCapacity = maxLiftingCapacity;
        this.cargoName = cargoName;
        this.cargoClass = cargoClass;
        this.deliveryDate = deliveryDate;
    }

    public static Box createBoxFromJson(String filePath) throws IOException, JSONException {
        String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));
        JSONObject jsonObject = new JSONObject(jsonContent);

        String fromCountry = jsonObject.getString("from");
        String material = jsonObject.getString("material");
        String color = jsonObject.getString("color");
        int maxLiftingCapacity = jsonObject.getJSONObject("max-lifting-capacity").getInt("value");
        String cargoName = jsonObject.getJSONObject("cargo").getString("name");
        String cargoClass = jsonObject.getJSONObject("cargo").getString("class");
        String deliveryDateString = jsonObject.getString("delivery-date");
        LocalDateTime deliveryDate = LocalDateTime.parse(deliveryDateString, DateTimeFormatter.ISO_DATE_TIME);

        return new Box(fromCountry, material, color, maxLiftingCapacity, cargoName, cargoClass, deliveryDate);
    }

    public static void main(String[] args) {
        try {
            Box box = createBoxFromJson("box.json");
            System.out.println(box);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Box from: " + fromCountry + ", Material: " + material + ", Color: " + color +
                ", Max Lifting Capacity: " + maxLiftingCapacity + ", Cargo: " + cargoName +
                ", Class: " + cargoClass + ", Delivery Date: " + deliveryDate;
    }
}

