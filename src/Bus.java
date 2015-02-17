public class Bus {
    
    private int busID;
    private String registration;
    private String makeModel;
    private int seats;
    private String engine;
    private String dateBought;
    private String nextService;
    private int garageID;
    
    public Bus(int busID, String r, String m, int s, String e, String d, String n, int gID) {
        this.registration = r;
        this.makeModel = m;
        this.seats = s;
        this.engine = e;
        this.dateBought = d;
        this.nextService = n;
        this.garageID = gID;
    }
    
    public Bus(String r, String m, int s, String e, String d, String n, int gID) {
        this(-1, r, m, s, e, d, n, gID);
    }
    
    public int getId() {
        return busID;
    }
    
    public void setId(int busID) {
        this.busID = busID;
    }
    
}
