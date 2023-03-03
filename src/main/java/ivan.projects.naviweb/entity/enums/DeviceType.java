package ivan.projects.naviweb.entity.enums;

public enum DeviceType {

    KF1("КФ1"), KF1M("КФ1-М"), NEL1000("НЭЛ1000"), NEL1000M("НЭЛ1000-М");

    private String deviceType;

    DeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceType() {
        return deviceType;
    }

}
