package ivan.projects.naviweb.entity;


import ivan.projects.naviweb.entity.enums.DeviceType;

import java.util.Objects;

public class Card {

    private int id;

    private String contractNumber;

    private String factoryNumber;

    private String deviceType;

    private String deliveryDate;

    private String deliveryAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Card(int id, String contractNumber, String factoryNumber, String deviceType, String deliveryDate, String deliveryAddress) {
        this.id = id;
        this.contractNumber = contractNumber;
        this.factoryNumber = factoryNumber;
        this.deviceType = deviceType;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id == card.id && Objects.equals(contractNumber, card.contractNumber) && Objects.equals(factoryNumber, card.factoryNumber) && deviceType == card.deviceType && Objects.equals(deliveryDate, card.deliveryDate) && Objects.equals(deliveryAddress, card.deliveryAddress);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", contractNumber='" + contractNumber + '\'' +
                ", factoryNumber='" + factoryNumber + '\'' +
                ", deviceType=" + deviceType +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contractNumber, factoryNumber, deviceType, deliveryDate, deliveryAddress);
    }


    public static void main(String[] args) {

        System.out.println(new Card(9,"801", "№9346", DeviceType.NEL1000M.getDeviceType(),
                "02.03.2023","Горигледжан"));
    }

}
