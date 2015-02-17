import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BusTableGateway {
    
    private Connection mConnection;
    
    private static final String TABLE_NAME = "bus";
    private static final String COLUMN_BUSID = "busID";
    private static final String COLUMN_REGISTRATION = "registration";
    private static final String COLUMN_MAKE_MODEL = "makeModel";
    private static final String COLUMN_SEATS = "seats";
    private static final String COLUMN_ENGINE = "engine";
    private static final String COLUMN_DATE_BOUGHT = "dateBought";
    private static final String COLUMN_NEXT_SERVICE = "nextService";
    private static final String COLUMN_GARAGEID = "garageID";
    
    public BusTableGateway(Connection connection) {
        mConnection = connection;
    }
    
    public List<Bus> getBuses() throws SQLException {
        String query;
        Statement stmt;
        ResultSet rs;
        List<Bus> buses;
        
        
        String registation, makeModel, engine, dateBought, nextService;
        int busID, seats, gID;
        
        Bus b;
        
        
        query = "SELECT * FROM " + TABLE_NAME;
        stmt = this.mConnection.createStatement();
        rs = stmt.executeQuery(query);
        
        
        
        buses = new ArrayList<Bus>();
        while (rs.next()) {
            busID = rs.getInt(COLUMN_BUSID);
            String registration = rs.getString(COLUMN_REGISTRATION);
            makeModel = rs.getString(COLUMN_MAKE_MODEL);
            seats = rs.getInt(COLUMN_SEATS);
            engine = rs.getString(COLUMN_ENGINE);
            dateBought = rs.getString(COLUMN_DATE_BOUGHT);
            nextService = rs.getString(COLUMN_NEXT_SERVICE);
            int garageID = rs.getInt(COLUMN_GARAGEID);
            
            b = new Bus(busID, registration, makeModel, seats, engine, dateBought, nextService, garageID);
            buses.add(b);
        }
        
        return buses;
    }
}
