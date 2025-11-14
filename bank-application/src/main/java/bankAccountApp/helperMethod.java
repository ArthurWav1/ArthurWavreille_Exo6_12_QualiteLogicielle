package bankAccountApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class helperMethod {

    public static void closeFISObject(FileInputStream fis){
        if (fis != null) { // 5
				try { // 6
					fis.close();

				} catch (IOException ex) { // 7
					// ignore
				}
			}
    }

    public static void closeScannerObject(Scanner fileScanner){
        if (fileScanner != null) { // 8
				fileScanner.close();
			}
    }
}
