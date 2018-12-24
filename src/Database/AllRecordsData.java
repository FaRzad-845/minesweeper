package Database;

public class AllRecordsData {

    private int record;
    private String name;

    public AllRecordsData(int record, String name) {
        this.record = record;
        this.name = name;
    }

    public AllRecordsData() {
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
