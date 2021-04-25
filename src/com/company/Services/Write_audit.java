package com.company.Services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Write_audit {
        public static void writeAudit (String actionName) {
            String path = "src/com/company/Files/audit.csv";
            try {
                FileWriter fileWriter = new FileWriter(path, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);

                Date date = new Date();

                printWriter.println(actionName + "," + date.toString());
                printWriter.flush();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
