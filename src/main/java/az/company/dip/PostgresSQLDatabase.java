package az.company.dip;

public class PostgresSQLDatabase implements Database {
    public void connect() {
        System.out.println("Postgres ile qosuldu");
    }
}
