package structural.facade;
// Класс фирмы
class Firm {
    // конструктора и деструктор
    public Firm() {
        builderLicense = false;
        name = "";
    }

    public Firm(String fName, boolean bLicense, boolean eLicense, boolean cLicense) {
        builderLicense = bLicense;
        name = fName;
        environmentalLicense = eLicense;
        cityLicense = cLicense;
    }

    // название фирмы
    private String name;
    // есть ли строительная лицензия у фирмы
    private boolean builderLicense;
    // есть ли экологическое разрешение
    private boolean environmentalLicense;
    // есть ли разрешение от города
    private boolean cityLicense;

    // функции для работы с именем
    public String GetName() {
        return name;
    }

    public void SetName(String fName) {
        name = fName;
    }

    // функции для работы со строительной лицензии
    public boolean GetBuilderLicense() {
        return builderLicense;
    }

    public void SetBuilderLicense(boolean bLicense) {
        builderLicense = bLicense;
    }

    // функции для работы с экологическим разрешением
    public boolean GetEnvironmentalLicense() {
        return environmentalLicense;
    }

    public void SetEnvironmentalLicense(boolean eLicense) {
        environmentalLicense = eLicense;
    }

    // функции для работы с городским разрешением
    public boolean GetCityLicense() {
        return cityLicense;
    }

    public void SetCityLicense(boolean cLicense) {
        cityLicense = cLicense;
    }
}

