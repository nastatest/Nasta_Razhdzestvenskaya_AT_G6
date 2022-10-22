package main.java.homework.day6.stringtask;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintAccessAttemptsFromLogTask {
    public void printAccessAttemptFromLog(String log) {
        Pattern pattern = Pattern.compile("(\\b((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[0-9][0-9]?)\\b)\\s(granted|denied)");
        Matcher matcher = pattern.matcher(log);
        ArrayList<IpAndStatus> tempArray = new ArrayList<>();
        while (matcher.find()) {
            IpAndStatus ipAndStatus = new IpAndStatus();
            ipAndStatus.iP = matcher.group(1);
            String groupFive = matcher.group(5);
            if (groupFive.compareTo("granted") == 0) {
                ipAndStatus.isGranted = true;
            } else if (groupFive.compareTo("denied") == 0) {
                ipAndStatus.isGranted = false;
            }
            tempArray.add(ipAndStatus);
        }

        String tempIp;
        int tempGranted = 0;
        int tempDenied = 0;

        for (int i = 0; i < tempArray.size(); i++) {
            if (tempArray.get(i) == null)
                continue;
            tempIp = tempArray.get(i).iP;
            for (int j = i; j < tempArray.size(); j++) {
                if (tempArray.get(j) != null && tempIp.equals(tempArray.get(j).iP)) {
                    if (tempArray.get(j).isGranted) {
                        tempGranted++;
                    } else tempDenied++;
                    tempArray.set(j, null);
                }
            }
            System.out.println("ip " + tempIp + ": ok - " + tempGranted + ", failed - " + tempDenied);
            tempGranted = 0;
            tempDenied = 0;
        }
    }
}