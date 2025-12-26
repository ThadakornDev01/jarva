package Lab5;
import java.util.Scanner;

class User13 {
    protected String name;

    public User13(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer13 extends User13 {
    protected int projects;

    public Developer13(String name, int projects) {
        super(name); 
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin13 extends Developer13 {
    protected String adminKey;

    public Admin13(String name, int projects, String adminKey) {
        super(name, projects); 
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}


public class Lab5_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String dName = sc.nextLine();
        int dProjects = sc.nextInt();
        sc.nextLine();

        String aName = sc.nextLine();
        int aProjects = sc.nextInt();
        sc.nextLine();
        String aKey = sc.nextLine();

        User13 u1 = new User13("Guest"); 
        Developer13 d1 = new Developer13(dName, dProjects);
        Admin13 a1 = new Admin13(aName, aProjects, aKey);

        User13[] users = {u1, d1, a1};

        int totalClearance = 0;
        for (User13 u : users) {
            totalClearance += u.getClearanceLevel();
        }

        for (User13 u : users) {
            if (u instanceof Admin13) {
                Admin13 admin = (Admin13) u;
                System.out.println(admin.getAdminKey());
            }
        }

        System.out.println(totalClearance);

        sc.close();
	}

}
