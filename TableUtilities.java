 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        String space = "";
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=5; j++)
            {
                if(i*j < 10) space = "  ";
                    else if(i*j < 100) space = " ";
                        else if(i*j > 99) space = "";
                
                result += space + String.valueOf(i*j) + " |";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        String space = "";
        for(int i = 1; i<=10; i++)
        {
            for(int j = 1; j<=10; j++)
            {
                if(i*j < 10) space = "  ";
                    else if(i*j < 100) space = " ";
                        else if(i*j > 99) space = "";
                    
                result += space + String.valueOf(i*j) + " |";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        String space = "";
        for(int i = 1; i<=tableSize; i++)
        {
            for(int j = 1; j<=tableSize; j++)
            {
                if(i*j < 10) space = "  ";
                    else if(i*j < 100) space = " ";
                        else if(i*j > 99) space = "";
                    
                
                result += space + String.valueOf(i*j) + " |";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }
}
