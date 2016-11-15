package Business.UserFeedback;

import Business.UserAccount.UserAccount;

public class WorkRequest1 {

    private String status;
    private UserAccount customer;
    private String message;
    private int qualityOfSongs;
    private int overallRating;

    public int getQualityOfSongs() {
        return qualityOfSongs;
    }

    public void setQualityOfSongs(int qualityOfSongs) {
        this.qualityOfSongs = qualityOfSongs;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return customer.getUsername();
    }
    
}
