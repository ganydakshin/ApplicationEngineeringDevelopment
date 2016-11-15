package Business.UserAccount;

import Business.Employee.Employee;
import Business.Music.FreeMusic;
import Business.Music.PaidMusic;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import Business.UserFeedback.WorkQueue1;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

public class UserAccount {

    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private WorkQueue1 workQueue1;
    private int passCode;
    private int adminFlag;
    private ArrayList<PaidMusic> paidMusicList;
    private ArrayList<FreeMusic> freeMusicList;
    private ProductDirectory productDirectory;
    
    public UserAccount() {
        workQueue = new WorkQueue();
        workQueue1 = new WorkQueue1();
        productDirectory = new ProductDirectory();
        paidMusicList = new ArrayList<PaidMusic>();
        freeMusicList = new ArrayList<FreeMusic>();
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public int getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(int adminFlag) {
        this.adminFlag = adminFlag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<PaidMusic> getPaidMusicList() {
        return paidMusicList;
    }

    public void setPaidMusicList(ArrayList<PaidMusic> paidMusicList) {
        this.paidMusicList = paidMusicList;
    }

    public ArrayList<FreeMusic> getFreeMusicList() {
        return freeMusicList;
    }

    public WorkQueue1 getWorkQueue1() {
        return workQueue1;
    }

    public void setWorkQueue1(WorkQueue1 workQueue1) {
        this.workQueue1 = workQueue1;
    }

    
    public void setFreeMusicList(ArrayList<FreeMusic> freeMusicList) {
        this.freeMusicList = freeMusicList;
    }

    
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getPassCode() {
        return passCode;
    }

    public void setPassCode(int passCode) {
        this.passCode = passCode;
    }

    public FreeMusic addFreeMusic() {
        FreeMusic fm = new FreeMusic();
        freeMusicList.add(fm);
        return fm;
    }
    
    public PaidMusic addPaidMusic() {
        PaidMusic pm = new PaidMusic();
        paidMusicList.add(pm);
        return pm;
    }
    
    public void removeFreeMusic(FreeMusic fm) {
        freeMusicList.remove(fm);
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
