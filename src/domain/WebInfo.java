package domain;

public class WebInfo {

    private String[] users;
    private String[] timestamps;
    private String[] toFromTitle;

    public WebInfo(String[] aUsersArray, String[] aTimeStampArray, String[] aTFT){
        this.users = aUsersArray;
        this.timestamps = aTimeStampArray;
        this.toFromTitle = aTFT;
    }

    public String[] getTimestamps() {
        return timestamps;
    }

    public String[] getUsers() {
        return users;
    }

    public String[] getToFromTitle() {
        return toFromTitle;
    }
}
