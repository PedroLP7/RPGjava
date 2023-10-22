package rol;

import javax.swing.*;

public class Item {
private int idItem;
    private String name;

    private double price;
    private String description;
    private boolean equippable;
    private boolean consumible;
    private JLabel label;

    public Item(int idItem, String name, double price, String description, boolean equippable, boolean consumible, JLabel label) {
        this.idItem = idItem;
        this.name = name;
        this.price = price;
        this.description = description;
        this.equippable = equippable;
        this.consumible = consumible;
        this.label = label;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEquippable() {
        return equippable;
    }

    public void setEquippable(boolean equippable) {
        this.equippable = equippable;
    }

    public boolean isConsumible() {
        return consumible;
    }

    public void setConsumible(boolean consumible) {
        this.consumible = consumible;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public String toString2() {
        return "Item{" +
                "idItem=" + idItem +
                ", name='" + name + '\'' +
                ", price=" + price +


                '}';
    }
    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", equippable=" + equippable +
                ", consumible=" + consumible +

                '}';
    }
}


