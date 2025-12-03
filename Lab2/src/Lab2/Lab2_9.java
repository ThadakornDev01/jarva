package Lab2;
import java.util.Scanner;

class Address {
    String street;
    String city;
    String zipCode;

    Address(String st, String ct, String zip) {
        street = st;
        city = ct;
        zipCode = zip;
    }

    String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
   		}
	}

	class Student {
		String name;
		Address address;

		Student(String n, Address addr) {
			name = n;
			address = addr;
			}

		void displayProfile() {
			System.out.println("Name: " + name);
			System.out.println("Address: " + address.getFullAddress());
			}
		}

			public class Lab2_9 {
				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);

					String name = scanner.nextLine();
					String street = scanner.nextLine();
					String city = scanner.nextLine();
					String zipCode = scanner.nextLine();

					Address address = new Address(street, city, zipCode);
					Student student = new Student(name, address);

					student.displayProfile();

					scanner.close();
				}
			}
