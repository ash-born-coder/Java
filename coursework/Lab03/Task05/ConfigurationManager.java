package Task05;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;

    private int maxStudents = 500;
    private String universityName = "HAW Hamburg";

    private ConfigurationManager() { }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getUniversityName() {
        return universityName;
    }
}
