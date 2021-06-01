package laboratoryestudents.app.util;

import laboratoryestudents.app.model.DatabaseTemplate;

public class MapTableHour {

    public static void setFalse(DatabaseTemplate table, String hour) {

        switch (hour) {
            case "7":
                table.setSeven_am(false);
                break;
            case "8":
                table.setEight_am(false);
                break;
            case "9":
                table.setNine_am(false);
                break;
            case "10":
                table.setTen_am(false);
                break;
            case "11":
                table.setEleven_am(false);
                break;
            case "12":
                table.setTwelve_am(false);
                break;
            case "13":
                table.setOne_pm(false);
                break;
            case "14":
                table.setTwo_pm(false);
                break;
            case "15":
                table.setThree_pm(false);
                break;
            case "16":
                table.setFour_pm(false);
                break;
            case "17":
                table.setFive_pm(false);
                break;
            case "18":
                table.setSix_pm(false);
                break;
            case "19":
                table.setSeven_pm(false);
                break;
            case "20":
                table.setEight_pm(false);
                break;
            case "21":
                table.setNine_pm(false);
                break;
            default:
                System.out.println("Invalid hour!");
        }
    }
}
