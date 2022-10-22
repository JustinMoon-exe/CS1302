import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class BankDataProcessing {
	static ArrayList<BankAccount> Accounts = new ArrayList<>();
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
	public static void main(String[] args) {
		try {
			Path path = Paths.get("src/AccountData.csv");
			readAccounts(path, true);
			Path path2 = Paths.get("src/BankTransData.csv");
			readTransactions(path2, true, Accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readAccounts(Path Xpath, boolean bhead) throws IOException {
		BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
		// open the 'path2' file with accounts 'AccountData.csv'
		try {
			// code to process a String 'line' if header in file
			bufferedReader.readLine();
			String line;

			// process remainder of 'AccountData.csv'
			while ((line = bufferedReader.readLine()) != null) {
				// split each line into a string array String[]=line.split.... //name,acctnum
				// put informtiona into each object in the ArrayList
				// of GLOBAL 'Accounts' variable of object datatype 'BankAccount'
				Accounts.add(new BankAccount(line.split(",")[0], Integer.parseInt(line.split(",")[1])));
			}
		} catch (IOException ioe) {
			bufferedReader.close();
			ioe.printStackTrace();
		} finally {
			bufferedReader.close();
		}
	}

	private static void readTransactions(Path Xpath, boolean bHead, ArrayList<BankAccount> Xaccounts)
			throws IOException {

		for (BankAccount a : Xaccounts) {
			System.out.println("Account for " + a.getAcctname() + ", " + a.getAcctnum());
			BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
			try {
				bufferedReader.readLine();
				String line;
				double balance = 0;
				while ((line = bufferedReader.readLine()) != null) {
					int acctnum = Integer.parseInt(line.split(",")[0]);
					Date date = null;
					double amnt = 0;
					String type = null;
					if (acctnum == a.getAcctnum()) {
						date = formatter.parse(line.split(",")[1]);
						amnt = Double.parseDouble(line.split(",")[3]);
						type = "Credit";
						if (line.split(",")[2].equals("d")) {
							type = "Debit";
							balance -= amnt;
						} else {
							balance += amnt;
						}
						System.out.println(
								" Transaction date: " + formatter.format(date) + ", " + type + "= " + (int)amnt);
					}
				}
				a.setBalance(balance);
				System.out.println(a.toString());
				System.out.println("------------------------------------------------------------------------");
			} catch (IOException ioe) {
				bufferedReader.close();
				//ioe.printStackTrace();
			} finally {
				bufferedReader.close();
			}
		}
	}

}