package by.home.example1;

public class SampleDataObject {

    public SampleDataObject() {
        super();
    }

    public SampleDataObject(String name, Integer number) {
        super();
        this.name = name;
        this.number = number;
    }

    private String name;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}