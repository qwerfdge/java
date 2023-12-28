package ua.brekher.hw13;

public class Box {
    private String from;
    private String material;
    private String color;
    private MaxLiftingCapacity maxLiftingCapacity;
    private Cargo cargo;
    private String deliveryDate;

    public String getFrom() {
        return from;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public MaxLiftingCapacity getMaxLiftingCapacity() {
        return maxLiftingCapacity;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public static class MaxLiftingCapacity {
        private String unit;
        private int value;

        public String getUnit() {
            return unit;
        }

        public int getValue() {
            return value;
        }
    }

    public static class Cargo {
        private String name;
        private String clazz;

        public String getName() {
            return name;
        }

        public String getClazz() {
            return clazz;
        }
    }
}

